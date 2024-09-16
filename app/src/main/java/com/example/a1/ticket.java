package com.example.a1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ticket extends AppCompatActivity {

    TextView seat,movie;
    SharedPreferences t;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        seat=(TextView) findViewById(R.id.seatview);
        movie=(TextView) findViewById(R.id.movietitle);

        t = getSharedPreferences("movie_details", MODE_PRIVATE);
        seat.setText(t.getString("seat",null));
        movie.setText(t.getString("movie",null));

    }

}