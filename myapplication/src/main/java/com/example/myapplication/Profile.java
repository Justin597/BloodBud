package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button mProfileView = (Button) findViewById(R.id.profile6);
        mProfileView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Profile.this, Profile.class));
            }
        });

        Button mDonationPageView = (Button) findViewById(R.id.donations4);
        mDonationPageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Profile.this, DonationPage.class));
            }
        });

        Button mMapsView = (Button) findViewById(R.id.maps4);
        mMapsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Profile.this, Maps.class));
            }
        });

        Button mMyBloodBudView = (Button) findViewById(R.id.bloodbud5);
        mMyBloodBudView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Profile.this, MyBloodBud.class));
            }
        });
    }

}
