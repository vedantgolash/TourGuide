package com.vedantgolash.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openHistorical(View view){
        Intent intent = new Intent(this,Historical.class);
        startActivity(intent);
    }

    public void openFood(View view){
        Intent intent = new Intent(this,food.class);
        startActivity(intent);
    }

    public void openHotels(View view){
        Intent intent = new Intent(this,hotel.class);
        startActivity(intent);
    }

    public void openMalls(View view){
        Intent intent = new Intent(this,malls.class);
        startActivity(intent);
    }


}