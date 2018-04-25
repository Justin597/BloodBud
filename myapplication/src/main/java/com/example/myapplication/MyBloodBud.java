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
        setContentView(R.layout.activity_my_blood_bud);//sets the content view to activity_my_blood_bud.xml

        Button mProfileView = (Button) findViewById(R.id.profile5);//profile buttons id from mybloodbud xml
        mProfileView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBloodBud.this, Profile.class));//starts profile activity
            }
        });

        Button mDonationPageView = (Button) findViewById(R.id.donations2);//donation buttons id from xml
        mDonationPageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBloodBud.this, DonationPage.class));//starts DonationPage
            }
        });

        Button mMapsView = (Button) findViewById(R.id.maps2);//maps buttons id from xml
        mMapsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBloodBud.this, Maps.class));//starts maps activity
            }
        });

        Button mMyBloodBudView = (Button) findViewById(R.id.bloodbud3);//bloodbud buttons id from xml
        mMyBloodBudView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBloodBud.this, MyBloodBud.class));//starts myBloodBud activity
            }
        });

        Button mDonationHistoryView = (Button) findViewById(R.id.DonationHistory);// donation history buttons id from xml
        mDonationHistoryView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MyBloodBud.this, donationHistory.class));//starts donation history activity
            }
        });
    }

}
