package com.example.todos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ListView list;
    ArrayList<String>todos=new ArrayList<>();
    ArrayAdapter<String> adapter;
    boolean sorted=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todos.add("Takaritani");
        todos.add("Konyhaszekrény ajtót megjavitani");
        todos.add("Fürdőbe égőt cserélni");
        todos.add("Levinni a szemetet");
        todos.add("Autót mosni");

        list=findViewById(R.id.list);
        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,todos);
        registerForContextMenu(list);
        list.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.sort:
                if (!sorted){
                    Collections.sort(todos);
                    adapter.notifyDataSetChanged();
                    Toast.makeText(MainActivity.this, "Sorted A to Z", Toast.LENGTH_SHORT).show();
                    sorted=true;
                    return true;
                }
                else Collections.sort(todos,Collections.reverseOrder());
                adapter.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "Sorted Z to A", Toast.LENGTH_SHORT).show();
                sorted=false;
                return true;

            case R.id.delete:
                todos.clear();
                adapter.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "Deleted", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        TextView tv=(TextView)info.targetView;
        switch (item.getItemId()){
            case R.id.red:
                tv.setTextColor(Color.RED);
                adapter.notifyDataSetChanged();
                return true;
            case R.id.green:
                tv.setTextColor(Color.GREEN);
                adapter.notifyDataSetChanged();
                return true;
            case R.id.yellow:
                tv.setTextColor(Color.YELLOW);
                adapter.notifyDataSetChanged();
                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }
}