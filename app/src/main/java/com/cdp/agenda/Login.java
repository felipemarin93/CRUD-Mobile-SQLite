package com.cdp.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText User, Pass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        User = findViewById(R.id.txtUser);
        Pass = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (User.getText().toString().equals("administrator@gmail.com") || (User.getText().toString().equals("daniel.marin@gmail.com") || (User.getText().toString().equals("juan.arias@gmail.com")||(User.getText().toString().equals("duvan.botero@gmail.com") || (User.getText().toString().equals("prueba@gmail.com") && Pass.getText().toString().equals("1234"))))))
                {
                    Toast.makeText(Login.this, "Inicio Satisfactorio", Toast.LENGTH_LONG).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(Login.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    }, 1000);

                }
                else   {
                    Toast.makeText(Login.this, "Usuario y/o contraseña incorrecto", Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}