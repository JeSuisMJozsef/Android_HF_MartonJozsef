package com.example.currencyfragment;

import androidx.appcompat.app.AppCompatActivity;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String FRAGLIST = "1";
    private static final String FRAGDET = "2";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            fragmentTransaction.add(R.id.listfrag,new ListFragment(),FRAGLIST);
            fragmentTransaction.add(R.id.detfrag, new DetailsFragment(), FRAGDET);
        }
        else{
            if (fragmentManager.findFragmentByTag(FRAGDET) != null){
                fragmentTransaction.remove(fragmentManager.findFragmentByTag(FRAGDET));
            }
            fragmentTransaction.add(R.id.listfrag,new ListFragment(),FRAGLIST);
        }
        fragmentTransaction.commit();
    }
}