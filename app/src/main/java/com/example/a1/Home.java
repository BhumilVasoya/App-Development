package com.example.a1;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.example.a1.R;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Home extends AppCompatActivity{
    ImageView m1,m2,m3,logout;
    SharedPreferences s,t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);


        m1=(ImageView) findViewById(R.id.movie1);
        m2=(ImageView) findViewById(R.id.movie2);
        m3=(ImageView) findViewById(R.id.movie3);
        logout=(ImageView) findViewById(R.id.logout);
        s = getSharedPreferences("user_details",MODE_PRIVATE);
        t = getSharedPreferences("movie_details",MODE_PRIVATE);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showLogoutDialog();
            }
        });

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this, Seat.class);
                SharedPreferences.Editor editor = t.edit();
                editor.putString("movie","Stree 2");
                editor.commit();
                startActivity(i);
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this, Seat.class);
                SharedPreferences.Editor editor = t.edit();
                editor.putString("movie","G.O.A.T");
                editor.commit();
                startActivity(i);
            }
        });

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this, Seat.class);
                SharedPreferences.Editor editor = t.edit();
                editor.putString("movie","Devara Part-1");
                editor.commit();
                startActivity(i);
            }
        });
    }
    private void showLogoutDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Logout");
        builder.setMessage("Are you sure you want to logout?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                SharedPreferences.Editor editor = s.edit();
                editor.clear();
                editor.commit();
                Intent L=new Intent(Home.this,MainActivity.class);
                startActivity(L);
            }
        });
        builder.setNegativeButton("No", null);
        builder.show();
    }
}