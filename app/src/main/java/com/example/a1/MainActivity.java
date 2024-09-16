package com.example.a1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button signinButton, b2;
    SharedPreferences s;

    EditText email, pwd;
    Intent i;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.editEmail);
        pwd = (EditText) findViewById(R.id.editPassword);
        b2 = (Button) findViewById(R.id.b3);

        signinButton = findViewById(R.id.button);
        s = getSharedPreferences("user_details", MODE_PRIVATE);
        Intent J = new Intent(MainActivity.this, Home.class);
        if (s.contains("email") && s.contains("password")) {
            startActivity(J);
        }

        signinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e = email.getText().toString();
                String p = pwd.getText().toString();

                if (e.equals("bhumilv23@gmail.com") && p.equals("bhumil23")) {
                    SharedPreferences.Editor editor = s.edit();
                       editor.putString("email", e);
                       editor.putString("password", p);
                        editor.commit();
                    i = new Intent(MainActivity.this, Home.class);
                    startActivity(i);
                }
                else if (e.isEmpty()) {
                    email.setError("Email is compulsary");
                }
                else if (!Patterns.EMAIL_ADDRESS.matcher(e).matches()) {
                    email.setError("Valid Email is required");
                    email.requestFocus();
                    Toast.makeText(getApplicationContext(), "Please re-enter your email", Toast.LENGTH_LONG).show();
                }
                else if (p.isEmpty()) {
                    pwd.setError("Password is must");
                }
                else if (p.length() < 6) {
                    pwd.setError("Password should be at least 6 digits");
                    pwd.requestFocus();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Incorrect Email or Password", Toast.LENGTH_SHORT).show();
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent H = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(H);
            }
        });
    }
}
