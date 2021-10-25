package edu.neu.cs5520firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecycleActivity extends AppCompatActivity {



    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_view);



        recyclerView = findViewById(R.id.recycle_view);

        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("Google","www.google.com",R.drawable.pic_gmail_01);
        Person person2 = new Person("youtube","www.youtube.com",R.drawable.pic_youtube_01);
        personList.add(person1);
        personList.add(person2);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        MyAdapter myAdapter = new MyAdapter(personList);

        recyclerView.setAdapter(myAdapter);
    }







    public void onRegisterBtnClick (View view){

        TextView textView5 = findViewById(R.id.textView5);
        TextView textView6 = findViewById(R.id.textView6);


        EditText editTextTextName = findViewById(R.id.editTextTextName);
        EditText editTextTextURL= findViewById(R.id.editTextTextURL);

        textView5.setText("Name: " + editTextTextName.getText().toString());

        textView6.setText("URL: " + editTextTextURL.getText().toString());


    }
}