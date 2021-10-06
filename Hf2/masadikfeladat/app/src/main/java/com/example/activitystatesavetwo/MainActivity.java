package com.example.activitystatesavetwo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        EditText modifiedbox=findViewById(R.id.editTextBox);
        outState.putString("edittextvalue",modifiedbox.getText().toString());
        CheckBox checkBox=findViewById(R.id.checkBox);
        outState.putBoolean("checkboxvalue",checkBox.isChecked());

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        TextView boxcontent=findViewById(R.id.editTextBox);
        CheckBox checkBox=findViewById(R.id.checkBox);
        if (savedInstanceState.getString("edittextvalue")!=null){
            boxcontent.setText(savedInstanceState.getString("edittextvalue"));
        }
        if(savedInstanceState.getBoolean("checkboxvalue")){
            checkBox.setChecked(savedInstanceState.getBoolean("checkboxvalue"));
        }
    }

}