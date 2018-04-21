package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Maps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        Button mProfileView = (Button) findViewById(R.id.profile);
        mProfileView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Maps.this, Profile.class));
            }
        });

        Button mDonationPageView = (Button) findViewById(R.id.donations);
        mDonationPageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Maps.this, DonationPage.class));
            }
        });

        Button mMapsView = (Button) findViewById(R.id.maps);
        mMapsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Maps.this, Maps.class));
            }
        });

        Button mMyBloodBudView = (Button) findViewById(R.id.bloodbud2);
        mMyBloodBudView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Maps.this, MyBloodBud.class));
            }
        });

    }

}
