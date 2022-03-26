package main.registry.loginsignup;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        //button LogIn
        TextView EmailAddress = (TextView) findViewById (R.id.login_email);
        TextView Password = (TextView) findViewById (R.id.login_password);

        Button btnLogin = findViewById (R.id.btnLogin);

        btnLogin.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                if (EmailAddress.getText ().toString ().equals ("admin") && Password.getText ().toString ().equals ("admin")) {

                    Toast.makeText (MainActivity.this, "Login Successfully!", Toast.LENGTH_LONG).show ();


                }else {

                    Toast.makeText (MainActivity.this, "Login Failed!", Toast.LENGTH_LONG).show ();

                }

            }
        });

        //direct to signup
        TextView btnRegister = (TextView) findViewById (R.id.btnRegister);
        btnRegister.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (MainActivity.this,SignUp.class));

            }
        });

    }

    }
