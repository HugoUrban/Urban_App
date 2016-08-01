package castaneda.com.webserviceintegration;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONException;
import org.json.JSONObject;

public class login extends AppCompatActivity {

    private EditText user;
    private EditText pass;
    private Button login;
    private Button register;
    ProgressDialog progressDialog;

    private String END_POINT_URL = "http://10.0.12.184/android-urban/Registro/login.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText)findViewById(R.id.editUsuario);
        pass = (EditText)findViewById(R.id.editContraseña);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Por favor espere...");
        progressDialog.setCancelable(true);

        register = (Button) findViewById(R.id.btnRegistrarse);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registro = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(registro);
            }
        });

        login = (Button)findViewById(R.id.btnInicio);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = user.getText().toString();
                String contrasena = pass.getText().toString();
                if (!isValidPassword(contrasena)) {
                    pass.setError("Invalid Password");
                    return;
                }

                RequestParams params = new RequestParams();
                params.put("usuario", usuario);
                params.put("contrasena", contrasena);
                callRegisterWebservice(params);
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
                        String user = jsonResponse.getString("user");
                        Intent hiActivity = new Intent(getApplicationContext(), appMenu.class);
                        hiActivity.putExtra("Name", user);
                        startActivity(hiActivity);
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

    private boolean isValidPassword(String contrasena) {
        if (contrasena != null && contrasena.length() > 2) {
            return true;
        }
        return false;
    }
}
