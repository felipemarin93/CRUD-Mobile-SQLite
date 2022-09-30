package com.cdp.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (User.getText().toString().equals("administrator") && Pass.getText().toString().equals("...."))
                {
                    Toast.makeText(Login.this, "Hello World", Toast.LENGTH_LONG).show();

                }
                else   {
                    Toast.makeText(Login.this, "No sea Sapo", Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}