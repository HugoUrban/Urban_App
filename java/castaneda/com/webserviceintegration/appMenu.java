package castaneda.com.webserviceintegration;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class appMenu extends AppCompatActivity {

    private TextView bienvenida;
    private Button map;
    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_menu);

        bienvenida = (TextView)findViewById(R.id.textViewUrban);
        map = (Button) findViewById(R.id.btnMapa);
        exit = (Button) findViewById(R.id.btnSalir);

        String usuario = getIntent().getExtras().getString("Name");
        bienvenida.setText(bienvenida.getText().toString().replace("?", usuario));

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapa = new Intent(getApplicationContext(),Mapa1.class);
                startActivity(mapa);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salir = new Intent(getApplicationContext(),login.class);
                startActivity(salir);
                Toast.makeText(getApplicationContext(), "Log out!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
