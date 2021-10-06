package com.example.activitylifecyclemonitorhf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
    }
    public void startActivityTwo(View v){
        Intent intent=new Intent(this,ActivityTwo.class);
        startActivity(intent);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Statusz: ","activity three:on start lefutott**");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Statusz: ","activity three:on restart lefutott***");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Statusz: ","activity three:on resume lefutott****");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Statusz: ","activity three:on pause lefutott*****");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Statusz: ","activity three:on stop lefutott******");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Statusz: ","activity three:on destroy lefutott*******");
        Log.d("Statusz: ","----------------------------------------");


    }


}