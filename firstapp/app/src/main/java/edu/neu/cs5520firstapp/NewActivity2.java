package edu.neu.cs5520firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NewActivity2 extends AppCompatActivity {
    private String[] data = {"Alex","Bid","Belle","Justin","Lili","Peter","James","Yaoming","Ming","Haoyu","Angie","Anne","Betty","Ellie","Erica","Eva","Eliza","Dora","Elva"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(NewActivity2.this, android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }
}