package edu.neu.cs5520firstapp;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LocaActivity extends AppCompatActivity {




    TextView tv;
    VideoView videoView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loca);
        tv =findViewById(R.id.tv);






        videoView = findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.box);


        videoView.setVideoURI(uri);

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);

            }

        });

        videoView.start();
        getLocation();
    }






    @RequiresApi(api = Build.VERSION_CODES.M)
    private void getLocation() {
        ArrayList<String> permissions = new ArrayList<>();
        if (ActivityCompat.checkSelfPermission(LocaActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            permissions.add(Manifest.permission.ACCESS_COARSE_LOCATION);
        }
        if (ActivityCompat.checkSelfPermission(LocaActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            permissions.add(Manifest.permission.ACCESS_FINE_LOCATION);
        }


        //判断
        if (permissions.size() == 0) {
            getLocationLL();
        } else {
            requestPermissions(permissions.toArray(new String[permissions.size()]), 2);


        }
    }

    private void getLocationLL() {


        Location location = getLastKnownLocation();
        if (location != null) {

            String result = "{code: '0',type:'4',data: {longitude: '" + location.getLongitude() + "',latitude: '" + location.getLatitude() + "',Accuracy: '" +location.getAccuracy() +  "',Altitude: '" +location.getAltitude() +"'}}";
//            tex.loadUrl("javascript:callback(" + result + ");");


            String locationStr = "Latitude：" + location.getLatitude() + "\n"
                    + "Longitude：" + location.getLongitude() +"\n" +"Accuracy: " +  location.getAccuracy()+"\n" +"Altitude: " +  location.getAltitude();
            tv.setText(  "Your Location：\n" + "\n" + locationStr);
        } else {
            Toast.makeText(this, "Failed to obtain location information", Toast.LENGTH_SHORT).show();
            tv.setText(  "Obtaining location Rights" + "Location acquisition failure");

            String address = "Address: Could not find address :( ";


        }
    }


    private Location getLastKnownLocation() {

        LocationManager mLocationManager = (LocationManager) getApplicationContext().getSystemService(LOCATION_SERVICE);
        List<String> providers = mLocationManager.getProviders(true);
        Location bestLocation = null;
        for (String provider : providers) {
            @SuppressLint("MissingPermission") Location l = mLocationManager.getLastKnownLocation(provider);
            if (l == null) {
                continue;
            }
            if (bestLocation == null || l.getAccuracy() < bestLocation.getAccuracy()) {

                bestLocation = l;
            }
        }
        return bestLocation;
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case 2:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    tv.setText(   "Agree location permission");
                    getLocationLL();
                } else {
                    Toast.makeText(this, "The location permission is not granted", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
        }
    }


}
