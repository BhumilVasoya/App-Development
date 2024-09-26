package com.example.a1;

import static com.example.a1.R.color.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.transition.TransitionValues;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.ColorRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Seat extends AppCompatActivity implements SeatAdapter.OnSeatSelectedListener{
    Button Confirm;
    ImageView back;
    TextView TC, seatid, PriceView;
    int seatCount = 0;

    SharedPreferences t;

    private RecyclerView recyclerViewSeats;
    private SeatAdapter seatAdapter;
    private List<SeatModel> seatList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_seat);


        TC = (TextView) findViewById(R.id.textView6);
        seatid = (TextView) findViewById(R.id.textView7);
        PriceView = (TextView) findViewById(R.id.textView8);
        Confirm = (Button) findViewById(R.id.confirm);
        back = (ImageView) findViewById(R.id.imageButton);

        Confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (seatCount == 0) {
                    Toast.makeText(getApplicationContext(), "Please choose the seats", Toast.LENGTH_LONG).show();
                } else {
                    Intent T = new Intent(Seat.this, ticket.class);
                    t = getSharedPreferences("movie_details", MODE_PRIVATE);
                    SharedPreferences.Editor editor = t.edit();
                    editor.putString("seat", seatid.getText().toString());
                    editor.commit();
                    startActivity(T);
                }

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent H = new Intent(Seat.this, Home.class);
                startActivity(H);
            }
        });

        recyclerViewSeats = findViewById(R.id.recyclerViewSeats);
        recyclerViewSeats.setLayoutManager(new GridLayoutManager(this, 8));

        seatList = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            boolean isUnavailable = false;
            seatList.add(new SeatModel("A" + i, false, isUnavailable));
        }
        for (int i = 1; i <= 8; i++) {
            boolean isUnavailable = false;
            seatList.add(new SeatModel("B" + i, false, isUnavailable));
        }
        for (int i = 1; i <= 8; i++) {
            boolean isUnavailable = false;
            seatList.add(new SeatModel("C" + i, false, isUnavailable));
        }
        for (int i = 1; i <= 8; i++) {
            boolean isUnavailable = false;
            seatList.add(new SeatModel("D" + i, false, isUnavailable));
        }
        for (int i = 1; i <= 8; i++) {
            boolean isUnavailable = false;
            seatList.add(new SeatModel("E" + i, false, isUnavailable));
        }
        for (int i = 1; i <= 8; i++) {
            boolean isUnavailable = false;
            seatList.add(new SeatModel("F" + i, false, isUnavailable));
        }
        for (int i = 1; i <= 8; i++) {
            boolean isUnavailable = false;
            seatList.add(new SeatModel("G" + i, false, isUnavailable));
        }

        seatAdapter = new SeatAdapter(seatList,this);
        recyclerViewSeats.setAdapter(seatAdapter);

    }

    @Override
    public void onSeatSelected() {
        seatCount = 0;
        StringBuilder selectedSeatNumbers = new StringBuilder("");
        for (SeatModel seat : seatList) {
            if (seat.isSelected()) {
                seatCount++;
                selectedSeatNumbers.append(seat.getSeatNumber()).append(" ");
            }
        }
        TC.setText(seatCount+" Seat Selected");
        seatid.setText(selectedSeatNumbers.toString());
        PriceView.setText(seatCount*200+"");
    }
}