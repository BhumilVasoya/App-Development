package com.example.a1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    Button signinButton, b2;

    EditText email, pwd;
    Intent i;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth=FirebaseAuth.getInstance();

        email = (EditText) findViewById(R.id.editEmail);
        pwd = (EditText) findViewById(R.id.editPassword);
        b2 = (Button) findViewById(R.id.b3);

        signinButton = findViewById(R.id.button);
        Intent J = new Intent(MainActivity.this, Home.class);
        FirebaseUser currentUser=mAuth.getCurrentUser();
        if(currentUser!=null)
        {
            startActivity(J);
            finish();
        }

        signinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e = email.getText().toString();
                String p = pwd.getText().toString();

                if (e.isEmpty()) {
                    email.setError("Email is compulsary");
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(e).matches()) {
                    email.setError("Valid Email is required");
                    email.requestFocus();
                    Toast.makeText(getApplicationContext(), "Please re-enter your email", Toast.LENGTH_LONG).show();
                }
                if (p.isEmpty()) {
                    pwd.setError("Password is must");
                }
                if (p.length() < 6) {
                    pwd.setError("Password should be at least 6 digits");
                    pwd.requestFocus();
                }

                mAuth.signInWithEmailAndPassword(e, p)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    i = new Intent(MainActivity.this, Home.class);
                                    startActivity(i);
                                } else {
                                    Toast.makeText(MainActivity.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();

                                }
                            }
                        });

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
