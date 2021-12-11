package com.example.currency;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CurrencyListViewAdapter extends ArrayAdapter {
    private final Activity context;
    private final Integer[] imageIdArray;
    private final String[] shortNameArray;
    private final String[] nameArray;
    private final Double[] buyPriceArray;
    private final Double[] sellPriceArray;

    public CurrencyListViewAdapter(Activity context,
                                   Integer[] imageIdArrayParam,
                                   String[] shortNameArrayParam,
                                   String[] nameArrayParam,
                                   Double[] buyPriceArrayParam,
                                   Double[] sellPriceArrayParam){
        super(context,R.layout.listview,shortNameArrayParam);
        this.context=context;
        this.imageIdArray=imageIdArrayParam;
        this.shortNameArray=shortNameArrayParam;
        this.nameArray=nameArrayParam;
        this.buyPriceArray=buyPriceArrayParam;
        this.sellPriceArray=sellPriceArrayParam;

    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview,null,true);
        TextView shortName=rowView.findViewById(R.id.nameShort);
        TextView longName=rowView.findViewById(R.id.longName);
        TextView buyP=rowView.findViewById(R.id.buyPrice);
        TextView sellP=rowView.findViewById(R.id.sellPrice);
        ImageView image=rowView.findViewById(R.id.flag);

        shortName.setText(shortNameArray[position]);
        longName.setText(nameArray[position]);
        buyP.setText(Double.toString(buyPriceArray[position]));
        sellP.setText(Double.toString(sellPriceArray[position]));
        image.setImageResource(imageIdArray[position]);
        return rowView;
    }
}
