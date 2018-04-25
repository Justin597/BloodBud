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
        setContentView(R.layout.activity_profile);//sets content view to activity_profile.xml

        Button mProfileView = (Button) findViewById(R.id.profile6);//profile buttons id form xml
        mProfileView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Profile.this, Profile.class));//starts profile activity
            }
        });

        Button mDonationPageView = (Button) findViewById(R.id.donations4);//donation buttons id from xml
        mDonationPageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Profile.this, DonationPage.class));//starts donationpage activity
            }
        });

        Button mMapsView = (Button) findViewById(R.id.maps4);//map buttons id from xml
        mMapsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Profile.this, Maps.class));//starts map activity
            }
        });

        Button mMyBloodBudView = (Button) findViewById(R.id.bloodbud5);//bloodbud buttons id from xml
        mMyBloodBudView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Profile.this, MyBloodBud.class));//starts MyBloodBud activity
            }
        });
    }

}
