package com.example.a1;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Home extends AppCompatActivity{
    ImageView m1,m2,m3,logout;
    SharedPreferences t;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        mAuth=FirebaseAuth.getInstance();

        m1=(ImageView) findViewById(R.id.movie1);
        m2=(ImageView) findViewById(R.id.movie2);
        m3=(ImageView) findViewById(R.id.movie3);
        logout=(ImageView) findViewById(R.id.logout);

        t = getSharedPreferences("movie_details",MODE_PRIVATE);

        FirebaseUser currentUser=mAuth.getCurrentUser();
        if(currentUser==null)
        {
            Intent J = new Intent(Home.this, MainActivity2.class);
            startActivity(J);
            finish();
        }

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showLogoutDialog();
            }
        });

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this, Date_Time.class);
                SharedPreferences.Editor editor = t.edit();
                editor.putString("movie","Stree 2");
                editor.commit();
                startActivity(i);
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this, Date_Time.class);
                SharedPreferences.Editor editor = t.edit();
                editor.putString("movie","G.O.A.T");
                editor.commit();
                startActivity(i);
            }
        });

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this, Date_Time.class);
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
                FirebaseAuth.getInstance().signOut();
                Intent L=new Intent(Home.this, MainActivity.class);
                startActivity(L);
            }
        });
        builder.setNegativeButton("No", null);
        builder.show();
    }
}