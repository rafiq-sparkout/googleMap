package com.example.googlemaps.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.googlemaps.R;

public class MainActivity extends AppCompatActivity {
private Button mGoogleMapBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGoogleMapBtn = (Button)findViewById(R.id.mMapBtn);
        mGoogleMapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MapNavigationActivity.class);
                startActivity(intent);
            }
        });
    }
}