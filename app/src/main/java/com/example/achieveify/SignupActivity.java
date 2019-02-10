package com.example.achieveify;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.user.Consultant;

public class SignupActivity extends AppCompatActivity {
    // TODO: is it true that if you sign up - you must be a consultant?

    EditText email,password;
    Button signup_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ValidateInformation();
    }

    private void ValidateInformation() {
        email = (EditText)findViewById(R.id.signup_email);
        password = (EditText)findViewById(R.id.signup_password);
        signup_button = (Button)findViewById(R.id.btn_signup);

        Log.i("this is the email ",email.toString());
        Log.i("this is the password ",password.toString());
        if (!email.equals("") && !password.equals("")) {
            // create account here & store info
            signup_button.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
//                            Consultant newConsultant = new Consultant(email.toString(), password.toString());
//                            System.out.println("The new consultant was made: " + newConsultant);
                            Log.i("I created an instance",email.toString());
                            setContentView(R.layout.activity_home);
                        }
                    }
            );
        }
    }
}
