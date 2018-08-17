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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.view);
        final EditText name = findViewById(R.id.name);
        final EditText phone= findViewById(R.id.phone);
        final EditText email1 = findViewById(R.id.email1);
        final EditText city = findViewById(R.id.city);
        final EditText state= findViewById(R.id.state);
        Button submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(name.getText().toString().length() == 0 )
                    name.setError( "name required" );
                if(phone.getText().toString().length() == 0 )
                    phone.setError( "phone no. required" );
                if(email1.getText().toString().length() == 0 )
                    email1.setError( "email required" );
                if(city.getText().toString().length() == 0 )
                    city.setError( "city required" );
                if(state.getText().toString().length() == 0 )
                    state.setError( "state required" );

                else {
                    Toast t = Toast.makeText(MainActivity.this, "REGISTERED", Toast.LENGTH_LONG);
                    t.show();
                    Intent intent = new Intent(MainActivity.this,loginactivity.class);
                    startActivity(intent);

                }
            }
        });




    }
}
