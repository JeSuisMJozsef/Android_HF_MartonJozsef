package com.example.masadikfeladat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Product> products=new ArrayList<>();
    EditText code;
    EditText name;
    EditText price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        code=findViewById(R.id.productCodeInput);
        name=findViewById(R.id.productNameInput);
        price=findViewById(R.id.productPriceInput);
    }
    public void addProduct(View view){
        if (code.getText().toString().equals("")||name.getText().toString().equals("")||price.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "The above fields are required", Toast.LENGTH_SHORT).show();

        }
        else{
            Product product = new Product(code.getText().toString(), name.getText().toString(), price.getText().toString());
            products.add(product);
            Log.d("statt", "code "+ code.getText().toString());
        }
        code.setText("");
        name.setText("");
        price.setText("");
    }
    public void emptiesField(View view){
        code.setText("");
        name.setText("");
        price.setText("");
    }
    public void showProducts(View view){
        TextView prodList= (TextView) findViewById(R.id.prodList);
        prodList.setText("");
        for (Product product:
             products) {
            prodList.append(product.toString());
        }
    }
}