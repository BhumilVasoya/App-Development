package com.example.a1;

import static com.example.a1.R.color.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.transition.TransitionValues;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Seat extends AppCompatActivity implements View.OnClickListener {
    Button a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10;
    Button Confirm;
    ImageButton back;
    TextView TC,seatid,PriceView;
    int seatCount=0;

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_seat);

        TC=(TextView) findViewById(R.id.textView6);
        seatid=(TextView) findViewById(R.id.textView7);
        PriceView=(TextView) findViewById(R.id.textView8);
        Confirm=(Button) findViewById(R.id.button2);
        back=(ImageButton) findViewById(R.id.imageButton);

        a1=(Button) findViewById(R.id.A1);
        a2=(Button) findViewById(R.id.A2);
        a3=(Button) findViewById(R.id.A3);
        a4=(Button) findViewById(R.id.A4);
        a5=(Button) findViewById(R.id.A5);
        a6=(Button) findViewById(R.id.A6);
        a7=(Button) findViewById(R.id.A7);
        a8=(Button) findViewById(R.id.A8);
        a9=(Button) findViewById(R.id.A9);
        a10=(Button) findViewById(R.id.A10);

        b1=(Button) findViewById(R.id.B1);
        b2=(Button) findViewById(R.id.B2);
        b3=(Button) findViewById(R.id.B3);
        b4=(Button) findViewById(R.id.B4);
        b5=(Button) findViewById(R.id.B5);
        b6=(Button) findViewById(R.id.B6);
        b7=(Button) findViewById(R.id.B7);
        b8=(Button) findViewById(R.id.B8);
        b9=(Button) findViewById(R.id.B9);
        b10=(Button) findViewById(R.id.B10);

        c1=(Button) findViewById(R.id.C1);
        c2=(Button) findViewById(R.id.C2);
        c3=(Button) findViewById(R.id.C3);
        c4=(Button) findViewById(R.id.C4);
        c5=(Button) findViewById(R.id.C5);
        c6=(Button) findViewById(R.id.C6);
        c7=(Button) findViewById(R.id.C7);
        c8=(Button) findViewById(R.id.C8);
        c9=(Button) findViewById(R.id.C9);
        c10=(Button) findViewById(R.id.C10);

        d1=(Button) findViewById(R.id.D1);
        d2=(Button) findViewById(R.id.D2);
        d3=(Button) findViewById(R.id.D3);
        d4=(Button) findViewById(R.id.D4);
        d5=(Button) findViewById(R.id.D5);
        d6=(Button) findViewById(R.id.D6);
        d7=(Button) findViewById(R.id.D7);
        d8=(Button) findViewById(R.id.D8);
        d9=(Button) findViewById(R.id.D9);
        d10=(Button) findViewById(R.id.D10);

        e1=(Button) findViewById(R.id.E1);
        e2=(Button) findViewById(R.id.E2);
        e3=(Button) findViewById(R.id.E3);
        e4=(Button) findViewById(R.id.E4);
        e5=(Button) findViewById(R.id.E5);
        e6=(Button) findViewById(R.id.E6);
        e7=(Button) findViewById(R.id.E7);
        e8=(Button) findViewById(R.id.E8);
        e9=(Button) findViewById(R.id.E9);
        e10=(Button) findViewById(R.id.E10);

        f1=(Button) findViewById(R.id.F1);
        f2=(Button) findViewById(R.id.F2);
        f3=(Button) findViewById(R.id.F3);
        f4=(Button) findViewById(R.id.F4);
        f5=(Button) findViewById(R.id.F5);
        f6=(Button) findViewById(R.id.F6);
        f7=(Button) findViewById(R.id.F7);
        f8=(Button) findViewById(R.id.F8);
        f9=(Button) findViewById(R.id.F9);
        f10=(Button) findViewById(R.id.F10);


        a1.setOnClickListener(this);
        a2.setOnClickListener(this);
        a3.setOnClickListener(this);
        a4.setOnClickListener(this);
        a5.setOnClickListener(this);
        a6.setOnClickListener(this);
        a7.setOnClickListener(this);
        a8.setOnClickListener(this);
        a9.setOnClickListener(this);
        a10.setOnClickListener(this);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
        c7.setOnClickListener(this);
        c8.setOnClickListener(this);
        c9.setOnClickListener(this);
        c10.setOnClickListener(this);

        d1.setOnClickListener(this);
        d2.setOnClickListener(this);
        d3.setOnClickListener(this);
        d4.setOnClickListener(this);
        d5.setOnClickListener(this);
        d6.setOnClickListener(this);
        d7.setOnClickListener(this);
        d8.setOnClickListener(this);
        d9.setOnClickListener(this);
        d10.setOnClickListener(this);

        e1.setOnClickListener(this);
        e2.setOnClickListener(this);
        e3.setOnClickListener(this);
        e4.setOnClickListener(this);
        e5.setOnClickListener(this);
        e6.setOnClickListener(this);
        e7.setOnClickListener(this);
        e8.setOnClickListener(this);
        e9.setOnClickListener(this);
        e10.setOnClickListener(this);

        f1.setOnClickListener(this);
        f2.setOnClickListener(this);
        f3.setOnClickListener(this);
        f4.setOnClickListener(this);
        f5.setOnClickListener(this);
        f6.setOnClickListener(this);
        f7.setOnClickListener(this);
        f8.setOnClickListener(this);
        f9.setOnClickListener(this);
        f10.setOnClickListener(this);

        Confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(seatCount==0)
                {
                    Confirm.setClickable(false);
                }
                else
                {
                    Confirm.setClickable(true);
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


    @Override
    public void onClick(View view) {
        int id=view.getId();
        seatCount++;
        TC.setText(seatCount+" Seat Selected");
        PriceView.setText(seatCount*200+" RS");

        if(id==R.id.A1)
        {
            a1.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"A1,");
            a1.setClickable(false);

        } else if (id==R.id.A2) {
            a2.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"A2,");
            a2.setClickable(false);
        }
        else if (id==R.id.A3) {
            a3.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"A3,");
            a3.setClickable(false);
        }
        else if (id==R.id.A4) {
            a4.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"A4,");
            a4.setClickable(false);
        }
        else if (id==R.id.A5) {
            a5.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"A5,");
            a5.setClickable(false);
        }
        else if (id==R.id.A6) {
            a6.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"A6,");
            a6.setClickable(false);
        }
        else if (id==R.id.A7) {
            a7.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"A7,");
            a7.setClickable(false);
        }
        else if (id==R.id.A8) {
            a8.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"A8,");
            a8.setClickable(false);
        }
        else if (id==R.id.A9) {
            a9.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"A9,");
            a9.setClickable(false);
        }
        else if (id==R.id.A10) {
            a10.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"A10,");
            a10.setClickable(false);
        }
        else if(id==R.id.B1)
        {
            b1.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"B1,");
            b1.setClickable(false);

        } else if (id==R.id.B2) {
            b2.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"B2,");
            b2.setClickable(false);
        }
        else if (id==R.id.B3) {
            b3.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"B3,");
            b3.setClickable(false);
        }
        else if (id==R.id.B4) {
            b4.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"B4,");
            b4.setClickable(false);
        }
        else if (id==R.id.B5) {
            b5.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"B5,");
            b5.setClickable(false);
        }
        else if (id==R.id.B6) {
            b6.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"B6,");
            b6.setClickable(false);
        }
        else if (id==R.id.B7) {
            b7.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"B7,");
            b7.setClickable(false);
        }
        else if (id==R.id.B8) {
            b8.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"B8,");
            b8.setClickable(false);
        }
        else if (id==R.id.B9) {
            b9.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"B9,");
            b9.setClickable(false);
        }
        else if (id==R.id.B10) {
            b10.setBackgroundColor(Color.parseColor("#006FFD"));
            seatid.setText(seatid.getText()+"B10,");
            b10.setClickable(false);
        }
        else if(id==R.id.C1)
        {
            c1.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"C1,");
            c1.setClickable(false);
            
        } else if (id==R.id.C2) {
            c2.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"C2,");
            c2.setClickable(false);
        }
        else if (id==R.id.C3) {
            c3.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"C3,");
            c3.setClickable(false);
        }
        else if (id==R.id.C4) {
            c4.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"C4,");
            c4.setClickable(false);
        }
        else if (id==R.id.C5) {
            c5.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"C5,");
            c5.setClickable(false);
        }
        else if (id==R.id.C6) {
            c6.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"C6,");
            c6.setClickable(false);
        }
        else if (id==R.id.C7) {
            c7.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"C7,");
            c7.setClickable(false);
        }
        else if (id==R.id.C8) {
            c8.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"C8,");
            c8.setClickable(false);
        }
        else if (id==R.id.C9) {
            c9.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"C9,");
            c9.setClickable(false);
        }
        else if (id==R.id.C10) {
            c10.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"C10,");
            c10.setClickable(false);
        }
        else if(id==R.id.D1)
        {
            d1.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"D1,");
            d1.setClickable(false);

        } else if (id==R.id.D2) {
            d2.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"D2,");
            d2.setClickable(false);
        }
        else if (id==R.id.D3) {
            d3.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"D3,");
            d3.setClickable(false);
        }
        else if (id==R.id.D4) {
            d4.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"D4,");
            d4.setClickable(false);
        }
        else if (id==R.id.D5) {
            d5.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"D5,");
            d5.setClickable(false);
        }
        else if (id==R.id.D6) {
            d6.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"D6,");
            d6.setClickable(false);
        }
        else if (id==R.id.D7) {
            d7.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"D7,");
            d7.setClickable(false);
        }
        else if (id==R.id.D8) {
            d8.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"D8,");
            d8.setClickable(false);
        }
        else if (id==R.id.D9) {
            d9.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"D9,");
            d9.setClickable(false);
        }
        else if (id==R.id.D10) {
            d10.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"D10,");
            d10.setClickable(false);
        }
        else if(id==R.id.E1)
        {
            e1.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"E1,");
            e1.setClickable(false);

        } else if (id==R.id.E2) {
            e2.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"E2,");
            e2.setClickable(false);
        }
        else if (id==R.id.E3) {
            e3.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"E3,");
            e3.setClickable(false);
        }
        else if (id==R.id.E4) {
            e4.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"E4,");
            e4.setClickable(false);
        }
        else if (id==R.id.E5) {
            e5.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"E5,");
            e5.setClickable(false);
        }
        else if (id==R.id.E6) {
            e6.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"E6,");
            e6.setClickable(false);
        }
        else if (id==R.id.E7) {
            e7.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"E7,");
            e7.setClickable(false);
        }
        else if (id==R.id.E8) {
            e8.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"E8,");
            e8.setClickable(false);
        }
        else if (id==R.id.E9) {
            e9.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"E9,");
            e9.setClickable(false);
        }
        else if (id==R.id.E10) {
            e10.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"E10,");
            e10.setClickable(false);
        }
        else if(id==R.id.F1)
        {
            f1.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"F1,");
            f1.setClickable(false);

        } else if (id==R.id.F2) {
            f2.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"F2,");
            f2.setClickable(false);
        }
        else if (id==R.id.F3) {
            f3.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"F3");
            f3.setClickable(false);
        }
        else if (id==R.id.F4) {
            f4.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"F4,");
            f4.setClickable(false);
        }
        else if (id==R.id.F5) {
            f5.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"F5,");
            f5.setClickable(false);
        }
        else if (id==R.id.F6) {
            f6.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"F6,");
            f6.setClickable(false);
        }
        else if (id==R.id.F7) {
            f7.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"F7,");
            f7.setClickable(false);
        }
        else if (id==R.id.F8) {
            f8.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"F8,");
            f8.setClickable(false);
        }
        else if (id==R.id.F9) {
            f9.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"F9,");
            f9.setClickable(false);
        }
        else if (id==R.id.F10) {
            f10.setBackgroundColor(Color.parseColor("#006FFD"));seatid.setText(seatid.getText()+"F10,");
            f10.setClickable(false);
        }


    }
}