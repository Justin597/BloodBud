package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MyBloodBud extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_blood_bud);

        Button mProfileView = (Button) findViewById(R.id.profile5);
        mProfileView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBloodBud.this, Profile.class));
            }
        });

        Button mDonationPageView = (Button) findViewById(R.id.donations2);
        mDonationPageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBloodBud.this, DonationPage.class));
            }
        });

        Button mMapsView = (Button) findViewById(R.id.maps2);
        mMapsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBloodBud.this, Maps.class));
            }
        });

        Button mMyBloodBudView = (Button) findViewById(R.id.bloodbud3);
        mMyBloodBudView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBloodBud.this, MyBloodBud.class));
            }
        });
    }

}
