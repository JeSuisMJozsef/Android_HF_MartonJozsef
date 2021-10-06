package com.example.activitylifecyclemonitorhf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Statusz: ","----------------------------------------");
        Log.d("Statusz: ","main activity:on create lefutott*");


        Button toActivityTwo = findViewById(R.id.tosecondactivity);
        toActivityTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent( MainActivity.this, ActivityTwo.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Statusz: ","main activity:on start lefutott**");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Statusz: ","main activity:on restart lefutott***");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Statusz: ","main activity:on resume lefutott****");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Statusz: ","main activity:on pause lefutott*****");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Statusz: ","main activity:on stop lefutott******");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Statusz: ","main activity:on destroy lefutott*******");
        Log.d("Statusz: ","----------------------------------------");


    }



}