package com.example.chat1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    EditText name,email,pass;
    Button signup;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        name=(EditText) findViewById(R.id.editTextText);
        email=(EditText) findViewById(R.id.editTextTextEmailAddress2);
        pass=(EditText) findViewById(R.id.editTextTextPassword2);
        signup=(Button) findViewById(R.id.button2);

        i=new Intent(MainActivity2.this, MainActivity.class);

    }
}