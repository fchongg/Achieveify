package com.example.achieveify;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import 	android.accounts.Account;

public class SignupActivity extends AppCompatActivity {
    // TODO: is it true that if you sign up - you must be a consultant?

    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void ValidateInformation() {
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);

        if (!email.equals("") && !password.equals("")) {
            // create account here & store info
            Account newAccount = new Account(email, );
        }
    }
}
