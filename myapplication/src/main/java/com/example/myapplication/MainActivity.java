package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//sets where we are getting the content from (ie which xml file)

        Button mProfileView = (Button) findViewById(R.id.Profile); //id is related to the id set by the xml file for the object
        mProfileView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//on click
                startActivity(new Intent(MainActivity.this, Profile.class));//starts the new activity profile
            }
        });

        Button mDonationPageView = (Button) findViewById(R.id.Donations);//id for donation button on main activity
        mDonationPageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DonationPage.class));//starts donationPage
            }
        });

        Button mMapsView = (Button) findViewById(R.id.Maps);//id for maps button on main activity
        mMapsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Maps.class));// starts map activity
            }
        });

        Button mMyBloodBudView = (Button) findViewById(R.id.bloodbud);//bloodbud button id
        mMyBloodBudView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MyBloodBud.class));//starts mybloodbud activity
            }
        });
    }


    //default stuff that we havent used
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
