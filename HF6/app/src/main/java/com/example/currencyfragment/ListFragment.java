package com.example.currencyfragment;


import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


public class ListFragment extends Fragment {

    protected static final String FRAGDET = "2";
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vw=inflater.inflate(R.layout.fragment_list, container, false);

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
        ListView currList = (ListView) vw.findViewById(R.id.curr_list);
        CurrencyListViewAdapter currAdapter=new CurrencyListViewAdapter(getActivity(),imageArray,shortNameArray,longNameArray,buyPriceArray,sellPriceArray);
        currList.setAdapter(currAdapter);
        final FragmentManager fragmentManager=getFragmentManager();
        currList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (fragmentManager.findFragmentByTag(FRAGDET)!=null){
                    TextView selectedcurr=(TextView) getActivity().findViewById(R.id.selectedcurr);
                    selectedcurr.setText(shortNameArray[i]);
                    TextView selectedcurrvalue=(TextView) getActivity().findViewById(R.id.selectedcurrvalue);
                    selectedcurrvalue.setText(Double.toString(buyPriceArray[i]));
                }
                else{
                    Intent intent=new Intent(getActivity().getApplicationContext(),ShowItem.class);
                    intent.putExtra("curr",shortNameArray[i]);
                    intent.putExtra("currvalue",Double.toString(buyPriceArray[i]));
                    startActivity(intent);
                }
            }
        });
        return vw;
    }
}