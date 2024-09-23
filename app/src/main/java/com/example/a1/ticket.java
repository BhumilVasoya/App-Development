package com.example.a1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ticket extends AppCompatActivity {

    TextView seat,movie;
    SharedPreferences t;
    ImageView home1;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        seat=(TextView) findViewById(R.id.seatview);
        movie=(TextView) findViewById(R.id.movietitle);
        home1=(ImageView) findViewById(R.id.imageView3);

        t = getSharedPreferences("movie_details", MODE_PRIVATE);
        seat.setText(t.getString("seat",null));
        movie.setText(t.getString("movie",null));

        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ticket.this,Home.class);
                startActivity(i1);
            }
        });

    }

}