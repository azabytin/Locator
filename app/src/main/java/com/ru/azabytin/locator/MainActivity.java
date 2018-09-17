package com.ru.azabytin.locator;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private LocationManager locationManager = (LocationManager)
            getSystemService(Context.LOCATION_SERVICE);

    LocationListener locationListener = new MyLocationListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locationManager.requestLocationUpdates (
                LocationManager.GPS_PROVIDER,
                5000,
                10,
                locationListener);
    }
}
