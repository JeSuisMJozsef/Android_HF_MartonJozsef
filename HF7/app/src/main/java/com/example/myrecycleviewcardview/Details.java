package com.example.myrecycleviewcardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView image=findViewById(R.id.detImage);
        TextView name=findViewById(R.id.detName);
        TextView age=findViewById(R.id.detAge);
        TextView info=findViewById(R.id.detInfo);

        Animal animal=(Animal) getIntent().getExtras().getSerializable("EXTRA_ANIMAL");

        image.setImageResource(animal.getmThumbnailDrawable());
        name.setText(animal.getName());
        age.setText(String.valueOf(animal.getAge()));
        info.setText(animal.getInfo());
    }
}