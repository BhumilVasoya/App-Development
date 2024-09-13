package com.example.a1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    Button Signup,b2;
    EditText email,pwd1,pwd2;
    Intent i;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Signup=(Button) findViewById(R.id.Signup);
        b2=(Button) findViewById(R.id.but4);
        email=(EditText) findViewById(R.id.Email);
        pwd1=(EditText) findViewById(R.id.Password1);
        pwd2=(EditText) findViewById(R.id.Password2);

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e= email.getText().toString();
                String p1=pwd1.getText().toString();
                String p2=pwd2.getText().toString();


                if(e.isEmpty())
                {
                    email.setError("Email is compulsary");

                } else if (p1.isEmpty()) {
                    pwd1.setError("Password is must");
                } else if (p2.isEmpty()||!(p1.equals(p2))) {
                    pwd2.setError("Passwords do not match.");
                } else
                {
                    Toast.makeText(getApplicationContext(),"Your Account has been created",Toast.LENGTH_SHORT).show();
                    i=new Intent(MainActivity2.this, Seat.class);
                    startActivity(i);                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}