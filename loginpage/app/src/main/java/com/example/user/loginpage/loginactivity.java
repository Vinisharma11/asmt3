package com.example.user.loginpage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        TextView textview = findViewById(R.id.textView);
        final EditText username = findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);

        Button login = findViewById(R.id.button);
        Button reset = findViewById(R.id.reset);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(username.getText().toString().length() == 0 )
                    username.setError( "USERNAME IS REQUIRED" );
                if(password.getText().toString().length() == 0 )
                    password.setError( "PASSWORD IS REQUIRED" );

                else {
                    Toast t = Toast.makeText(loginactivity.this, "LOGGING IN", Toast.LENGTH_LONG);
                    t.show();
                    Intent intentObj = new Intent(Intent.ACTION_VIEW);
                    intentObj.setData(Uri.parse("http://www.careerairforce.nic.in/"));
                    startActivity(intentObj);
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.setText("");
                password.setText("");
            }
        });
    }
}
