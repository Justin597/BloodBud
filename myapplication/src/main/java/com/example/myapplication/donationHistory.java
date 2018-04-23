package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class donationHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation_history);

        Button mProfileView = (Button) findViewById(R.id.profile4);
        mProfileView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(donationHistory.this, Profile.class));
            }
        });

        Button mDonationPageView = (Button) findViewById(R.id.donations3);
        mDonationPageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(donationHistory.this, DonationPage.class));
            }
        });

        Button mMapsView = (Button) findViewById(R.id.maps3);
        mMapsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(donationHistory.this, Maps.class));
            }
        });

        Button mMyBloodBudView = (Button) findViewById(R.id.bloodbud4);
        mMyBloodBudView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(donationHistory.this, MyBloodBud.class));
            }
        });
    }
}
