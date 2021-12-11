package com.example.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] shortNameArray={"EUR","USD","GBP","AUD","CAD","CHF","DKK","HUF"};
    String[] longNameArray={"Euro","Dolar american","Lira sterlina","Dolar australian","Dolar canadian","Franc elvetian","Coroana Daneza","Forint"};
    Double[] buyPriceArray={4.4100,3.9750,6.1250,2.9600,3.0950,4.2300,0.5850,0.0136};
    Double[] sellPriceArray={4.5500,4.1450,6.3550,3.0600,3.2650,4.3300,0.6150,0.0146};
    Integer[] imageArray={
            R.drawable.eur,
            R.drawable.usa,
            R.drawable.uk,
            R.drawable.aud,
            R.drawable.can,
            R.drawable.chf,
            R.drawable.dkk,
            R.drawable.huf,
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=findViewById(R.id.currencyList);
        CurrencyListViewAdapter currAdapter=new CurrencyListViewAdapter(this,imageArray,shortNameArray,longNameArray,buyPriceArray,sellPriceArray);
        list.setAdapter(currAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String curr=shortNameArray[i];
                Double buy=buyPriceArray[i];
                Toast.makeText(MainActivity.this, curr+" : "+buy, Toast.LENGTH_SHORT).show();
            }
        });
    }
}