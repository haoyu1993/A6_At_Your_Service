package edu.neu.cs5520firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }
    public void onBtnClick(View view) {
        TextView button10 = findViewById(R.id.textView3);
        button10.setText("Pressed: A");

    }
    public void onBtnClick1(View view) {
        TextView button2 = findViewById(R.id.textView3);
        button2.setText("Pressed: B");

    }
    public void onBtnClick2(View view) {
        TextView button3 = findViewById(R.id.textView3);
        button3.setText("Pressed: C");

    }
    public void onBtnClick3(View view) {
        TextView button7 = findViewById(R.id.textView3);
        button7.setText("Pressed: D");

    }
    public void onBtnClick4(View view) {
        TextView button8 = findViewById(R.id.textView3);
        button8.setText("Pressed: E");

    }
    public void onBtnClick5(View view) {
        TextView button9 = findViewById(R.id.textView3);
        button9.setText("Pressed: F");

    }
    public void onBtnClick6(View view) {
        TextView textView4 = findViewById(R.id.textView3);
        textView4.setText("Pressed: - ");

    }
}