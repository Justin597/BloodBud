package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Maps extends MapsActivity {//pulling information from maps activity which has the map working

    private GoogleMap mMap;//google maps class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);//sets the content view from activity_maps.xml
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);//gets the fragment from the mapView id from xml
        mapFragment.getMapAsync(this);//syncs the map to the fragment

        Button mProfileView = (Button) findViewById(R.id.profile);//profile buttons id from xml
        mProfileView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Maps.this, Profile.class));//starts profile activity
            }
        });

        Button mDonationPageView = (Button) findViewById(R.id.donations);//donations button id from xml
        mDonationPageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Maps.this, DonationPage.class));//starts donationPage activity
            }
        });

        Button mMapsView = (Button) findViewById(R.id.maps);//map button id from xml
        mMapsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Maps.this, Maps.class));//starts maps activity
            }
        });

        Button mMyBloodBudView = (Button) findViewById(R.id.bloodbud2);//bloodbud button id from xml
        mMyBloodBudView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Maps.this, MyBloodBud.class));//starts MyBloodBud activity
            }
        });

    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;//sets the google map

        // Add a marker in Sydney and move the camera
        LatLng cuse = new LatLng(43.028627, -76.122447);//sets the maps location
        mMap.addMarker(new MarkerOptions().position(cuse).title("Marker in CUSE"));//names the marker
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cuse));//moves the cammera to location set by cuse
    }
}
