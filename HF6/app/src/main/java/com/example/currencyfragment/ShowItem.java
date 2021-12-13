package com.example.currencyfragment;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class ShowItem extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }
        setContentView(R.layout.fragment_details);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String selectedCurr = extras.getString("curr");
            String selectedCurrValue = extras.getString("currvalue");
            TextView curr = (TextView) findViewById(R.id.selectedcurr);
            TextView currvalue=(TextView) findViewById(R.id.selectedcurrvalue);
            curr.setText(selectedCurr);
            currvalue.setText(selectedCurrValue);
        }
    }
}
