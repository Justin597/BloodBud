package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class DonationPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation_page);//sets content view to activity_donation_page.xml

        Button mProfileView = (Button) findViewById(R.id.profile4);//profile button's id from donation page xml
        mProfileView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DonationPage.this, Profile.class));//starts profile activity
            }
        });

        Button mDonationPageView = (Button) findViewById(R.id.donations3);//donation buttons id form donation page xml
        mDonationPageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DonationPage.this, DonationPage.class));//starts donationPage activity
            }
        });

        Button mMapsView = (Button) findViewById(R.id.maps3);//map buttons id from donation page xml
        mMapsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DonationPage.this, Maps.class));//starts maps activity
            }
        });

        Button mMyBloodBudView = (Button) findViewById(R.id.bloodbud4);//bloodbud buttons id
        mMyBloodBudView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DonationPage.this, MyBloodBud.class));//starts bloodbud activity
            }
        });
    }

}
