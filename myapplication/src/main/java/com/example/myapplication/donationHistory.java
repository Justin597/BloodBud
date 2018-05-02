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
        setContentView(R.layout.activity_donation_history);//sets content view to activity_donation_history.xml

        Button mProfileView = (Button) findViewById(R.id.profile2);//profile button on donation history xml id
        mProfileView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(donationHistory.this, Profile.class));//starts profile from donation history
            }
        });

        Button mDonationPageView = (Button) findViewById(R.id.donations5);//donation button id from donations history xml
        mDonationPageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(donationHistory.this, DonationPage.class));//starts donationPage activity
            }
        });

        Button mMapsView = (Button) findViewById(R.id.maps5);//map button's id on donation history xml
        mMapsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(donationHistory.this, Maps.class));//starts maps activity
            }
        });

        Button mMyBloodBudView = (Button) findViewById(R.id.bloodbud6);//bloodbud buttons id on donation history xml
        mMyBloodBudView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(donationHistory.this, MyBloodBud.class));//starts MyBloodBudactivity
            }
        });
    }
}
