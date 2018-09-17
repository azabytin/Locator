package com.ru.azabytin.locator;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

/*---------- Listener class to get coordinates ------------- */
class MyLocationListener implements LocationListener {

    @Override
    public void onLocationChanged(Location loc) {

        String longitude = "Longitude: " + loc.getLongitude();
        Log.v("MyLocationListener", longitude);
        String latitude = "Latitude: " + loc.getLatitude();
        Log.v("MyLocationListener", latitude);
    }

    @Override
    public void onProviderDisabled(String provider) {}

    @Override
    public void onProviderEnabled(String provider) {}

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {}
}