package com.example.achieveify;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button login_button,register_button;
    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginButton();
    }

    public void LoginButton(){
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
        login_button = (Button)findViewById(R.id.btn_login);

        login_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (email.getText().toString().equals("user") &&
                            password.getText().toString().equals("pass")){
                            Toast.makeText(LoginActivity.this,"Username and password is correct",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent("com.abhinavhackpundit.loginapp.User");
                            startActivity(intent);

                        }
                        else {
                            Toast.makeText(LoginActivity.this,"Email and/or password is NOT correct.",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }

    public void RegisterButton() {
        register_button = (Button) findViewById(R.id.btn_register);
    }
}