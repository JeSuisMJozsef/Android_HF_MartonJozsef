package com.example.hf1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText firstNum=(EditText) findViewById(R.id.firstNum);
        EditText lastNum=(EditText) findViewById(R.id.lastNum);
        Button addButt=(Button) findViewById(R.id.addButt);
        Button extractButt=(Button) findViewById(R.id.extractButt);
        Button multiplyButt=(Button) findViewById(R.id.multiplyButt);
        Button divisionButt=(Button) findViewById(R.id.divisionButt);

        TextView resultBox= (TextView) findViewById(R.id.resultBox);

        addButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float result =Float.valueOf(firstNum.getText().toString())+Float.valueOf(lastNum.getText().toString());
                    resultBox.setText(String.valueOf(result));

                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Adjon meg szamot", Toast.LENGTH_SHORT).show();
                }

            }

        });
        extractButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float result =Float.valueOf(firstNum.getText().toString())-Float.valueOf(lastNum.getText().toString());
                    resultBox.setText(String.valueOf(result));

                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Adjon meg szamot", Toast.LENGTH_SHORT).show();
                }
            }

        });
        multiplyButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float result =Float.valueOf(firstNum.getText().toString())*Float.valueOf(lastNum.getText().toString());
                    resultBox.setText(String.valueOf(result));

                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Adjon meg szamot", Toast.LENGTH_SHORT).show();
                }
            }

        });
        divisionButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float result =Float.valueOf(firstNum.getText().toString())/Float.valueOf(lastNum.getText().toString());
                    resultBox.setText(String.valueOf(result));

                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Adjon meg szamot", Toast.LENGTH_SHORT).show();
                }
            }

        });


    }

}