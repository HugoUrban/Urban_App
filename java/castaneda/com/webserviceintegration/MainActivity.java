package castaneda.com.webserviceintegration;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private EditText userEditText;
    private EditText passEditText;
    private EditText emailEditText;
    private Button okButton;
    ProgressDialog progressDialog;

    private String END_POINT_URL = "http://10.0.12.184/android-urban/Registro/registration.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userEditText = (EditText) findViewById(R.id.userEditText);
        passEditText = (EditText) findViewById(R.id.passEditText);
        emailEditText = (EditText) findViewById(R.id.emailEditText);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Por favor espere...");
        progressDialog.setCancelable(false);

        okButton = (Button) findViewById(R.id.okButton);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = userEditText.getText().toString();
                String contrasena = passEditText.getText().toString();
                if (!isValidPassword(contrasena)) {
                    passEditText.setError("Invalid Password");
                    return;
                }

                String email = emailEditText.getText().toString();
                if (!isValidEmail(email)) {
                    emailEditText.setError("Invalid Email");
                    return;
                }

                RequestParams params = new RequestParams();
                params.put("usuario", usuario);
                params.put("contrasena", contrasena);
                params.put("email", email);
                callRegisterWebservice(params);

                Intent back = new Intent(getApplicationContext(), login.class);
                startActivity(back);
            }
        });
    }

    private void callRegisterWebservice(RequestParams params)
    {
        progressDialog.show();

        AsyncHttpClient client = new AsyncHttpClient();
        client.post(END_POINT_URL, params, new AsyncHttpResponseHandler(){

            @Override
            public void onSuccess(int statusCode, String content) {
                progressDialog.hide();

                try {
                    JSONObject jsonResponse = new JSONObject(content);
                    String msg = "";
                    if(jsonResponse.getInt("status") == 1){
                        msg = jsonResponse.getString("msg");
                    }else{
                        msg = jsonResponse.getString("msg");
                    }
                    Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
                }catch(JSONException e){
                    Toast.makeText(getApplicationContext(), "Error occured [Server's JSON response might be invalid]!", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(int statusCode, Throwable error, String content) {
                progressDialog.hide();

                if(statusCode == 404){
                    Toast.makeText(getApplicationContext(), "Requested resource not found", Toast.LENGTH_LONG).show();
                }
                else if(statusCode == 500){
                    Toast.makeText(getApplicationContext(), "Something went wrong at server end", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Unexpected Error occcured! [Most common Error: Device might not be connected to Internet or remote server is not up and running]", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private boolean isValidEmail(String email) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean isValidPassword(String contrasena) {
        if (contrasena != null && contrasena.length() > 2) {
            return true;
        }
        return false;
    }
}