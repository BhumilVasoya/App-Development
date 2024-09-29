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

    TextView seat,movie,date,time;
    SharedPreferences t;
    ImageView home1;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        seat=(TextView) findViewById(R.id.seatview);
        movie=(TextView) findViewById(R.id.movietitle);
        home1=(ImageView) findViewById(R.id.imageView3);
        date=(TextView) findViewById(R.id.dateview);
        time=(TextView) findViewById(R.id.timeview);

        t = getSharedPreferences("movie_details", MODE_PRIVATE);
        seat.setText(t.getString("seat",null));
        movie.setText(t.getString("movie",null));
        date.setText(t.getString("date",null));
        time.setText(t.getString("time",null));

        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ticket.this,Home.class);
                startActivity(i1);
            }
        });

    }

}