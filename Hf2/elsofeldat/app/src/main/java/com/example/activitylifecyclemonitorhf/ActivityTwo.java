package com.example.activitylifecyclemonitorhf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }
    public void startMainActivity(View v){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void startActivityThree(View v){
        Intent intent=new Intent(this,ActivityThree.class);
        startActivity(intent);
    }


}
