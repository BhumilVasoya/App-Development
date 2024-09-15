package com.example.a1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ticket extends AppCompatActivity {

    TextView seat;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        /*Intent i=getIntent();
        String m=i.getStringExtra("seats");
        seat.setText(m);*/
    }

}