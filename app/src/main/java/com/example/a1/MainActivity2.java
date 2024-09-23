package com.example.a1;

import static android.content.ContentValues.TAG;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity2 extends AppCompatActivity {
    Button Signup,b2;
    EditText email,pwd1,pwd2;
    Intent i;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        mAuth=FirebaseAuth.getInstance();

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
                    email.setError("Email is required");
                    Toast.makeText(getApplicationContext(),"Please enter your email",Toast.LENGTH_LONG).show();
                    email.requestFocus();

                }if (!Patterns.EMAIL_ADDRESS.matcher(e).matches()) {
                    email.setError("Valid Email is required");
                    email.requestFocus();
                    Toast.makeText(getApplicationContext(),"Please re-enter your email",Toast.LENGTH_LONG).show();
                    
                }if (p1.isEmpty()) {
                    pwd1.setError("Password is must");
                    pwd1.requestFocus();

                }if (p1.length()<6) {
                    pwd1.setError("Password should be at least 6 digits");
                    pwd1.requestFocus();

                }if (!(p1.equals(p2))) {
                    pwd2.setError("Passwords do not match.");
                    pwd2.requestFocus();
                }
                mAuth.createUserWithEmailAndPassword(e, p1).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(getApplicationContext(),"Your Account has been created",Toast.LENGTH_SHORT).show();
                                    i=new Intent(MainActivity2.this, Home.class);
                                    startActivity(i);
                                } else {

                                    Toast.makeText(MainActivity2.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
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