package com.example.a1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a1.DateItemAdapter;
import com.example.a1.R;

import java.util.ArrayList;
import java.util.List;

public class Date_Time extends AppCompatActivity {

    private RecyclerView dateRecyclerView;
    private GridLayout timeSlotGridLayout;
    private DateItemAdapter dateItemAdapter;
    private List<String> dateList;
    private TextView selectedDateTimeTextView;

    private String selectedDate = "";
    private String selectedTime = "";
    SharedPreferences t;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);

        dateRecyclerView = findViewById(R.id.dateRecyclerView);
        dateRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        dateList = new ArrayList<>();
        dateList.add("23");
        dateList.add("24");
        dateList.add("25");
        dateList.add("26");
        dateList.add("27");

        dateItemAdapter = new DateItemAdapter(this, dateList, new DateItemAdapter.OnDateClickListener() {
            @Override
            public void onDateClick(String date) {
                selectedDate = date;
            }
        });
        dateRecyclerView.setAdapter(dateItemAdapter);

        timeSlotGridLayout = findViewById(R.id.timeSlotGridLayout);

        Button button1 = findViewById(R.id.timeSlotButton1);
        Button button2 = findViewById(R.id.timeSlotButton2);
        Button button3 = findViewById(R.id.timeSlotButton3);
        Button button4 = findViewById(R.id.timeSlotButton4);
        Button button5 = findViewById(R.id.timeSlotButton5);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTime = "11:10 AM";
                if (!selectedDate.isEmpty())
                {
                    t = getSharedPreferences("movie_details", MODE_PRIVATE);
                    SharedPreferences.Editor editor = t.edit();
                    editor.putString("date",selectedDate);
                    editor.putString("time",selectedTime);
                    editor.commit();
                    Intent i=new Intent(Date_Time.this,Seat.class);
                    startActivity(i);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTime = "02:15 PM";
                if (!selectedDate.isEmpty())
                {
                    t = getSharedPreferences("movie_details", MODE_PRIVATE);
                    SharedPreferences.Editor editor = t.edit();
                    editor.putString("date",selectedDate);
                    editor.putString("time",selectedTime);
                    editor.commit();
                    Intent i=new Intent(Date_Time.this,Seat.class);
                    startActivity(i);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTime = "06:30 PM";
                if (!selectedDate.isEmpty())
                {
                    t = getSharedPreferences("movie_details", MODE_PRIVATE);
                    SharedPreferences.Editor editor = t.edit();
                    editor.putString("date",selectedDate);
                    editor.putString("time",selectedTime);
                    editor.commit();
                    Intent i=new Intent(Date_Time.this,Seat.class);
                    startActivity(i);
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTime = "09:30 PM";
                if (!selectedDate.isEmpty())
                {
                    t = getSharedPreferences("movie_details", MODE_PRIVATE);
                    SharedPreferences.Editor editor = t.edit();
                    editor.putString("date",selectedDate);
                    editor.putString("time",selectedTime);
                    editor.commit();
                    Intent i=new Intent(Date_Time.this,Seat.class);
                    startActivity(i);
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTime = "11:50 PM";
                if (!selectedDate.isEmpty())
                {
                    t = getSharedPreferences("movie_details", MODE_PRIVATE);
                    SharedPreferences.Editor editor = t.edit();
                    editor.putString("date",selectedDate);
                    editor.putString("time",selectedTime);
                    editor.commit();
                    Intent i=new Intent(Date_Time.this,Seat.class);
                    startActivity(i);
                }
            }
        });
    }

}
