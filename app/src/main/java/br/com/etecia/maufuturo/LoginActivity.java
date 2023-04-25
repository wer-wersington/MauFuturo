package br.com.etecia.maufuturo;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText login, senha;
    Button btnentrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        login = findViewById(R.id.login);
        senha = findViewById(R.id.senha);
        btnentrar = findViewById(R.id.btnentrar);

        btnentrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario, pass;
                usuario = login.getText().toString();
                pass = senha.getText().toString();


            }
        });

        btnentrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario, pass;
                usuario = login.getText().toString();
                pass = senha.getText().toString();

                if (usuario.equals("admin") && pass.equals("admin")) {
                    startActivity(new Intent(getApplicationContext(), MenuActivity.class));
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Usuario ou senha incorretos", Toast.LENGTH_SHORT).show();
                    login.setText("");
                    senha.setText("");
                    login.requestFocus();
                }
            }
        });
    }
}
