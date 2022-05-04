package com.melvin.uberclone;

import static android.location.LocationManager.GPS_PROVIDER;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Switch;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoogleMap extends AppCompatActivity implements OnMapReadyCallback{

    private SupportMapFragment mapFragment;
    private com.google.android.gms.maps.GoogleMap google_Map;
    private FusedLocationProviderClient fusedLocationClient;
    public Location myLocation;

    protected LocationManager locationManager;
    protected LocationListener locationListener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_map);



        //we cast our fragment into the SupportMapFragment
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.fgm_googlemaps_id);
        mapFragment.getMapAsync((OnMapReadyCallback) this);





    }


    @SuppressLint("MissingPermission")
    @Override
    public void onMapReady(@NonNull com.google.android.gms.maps.GoogleMap googleMap) {



    }
}

