package edu.neu.cs5520firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "\r\r\r\r\r\r\r\r\r\r\r\r Haoyu Zhang \n zhang.hao.yu@foxmail.com", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 800);
                toast.show();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NewActivity.class);
                startActivity(intent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this,NewActivity2.class);
                startActivity(intent2);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this,RecycleActivity.class);
                startActivity(intent3);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this,LocaActivity.class);
                startActivity(intent4);

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this,video.class);
                startActivity(intent5);

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this,WebActivity.class);
                startActivity(intent5);

            }
        });





    }

    public boolean onCreateOptionsMenu(Menu menu) {
         getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.discover:
                Toast.makeText(this,"Find your Friends",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Message:
                Toast.makeText(this,"Type your Message",Toast.LENGTH_LONG).show();
                break;
            case R.id.Friends:
                Toast.makeText(this,"Friends",Toast.LENGTH_LONG).show();
                break;
            case R.id.Profile:
                Toast.makeText(this,"Haoyu Zhang",Toast.LENGTH_LONG).show();
                break;
            case R.id.Group:
                Toast.makeText(this,"Studying Group",Toast.LENGTH_LONG).show();
                break;
            case R.id.Notifications:
                Toast.makeText(this,"To Do Lists",Toast.LENGTH_LONG).show();
                break;
            case R.id.Menu:
                Toast.makeText(this,"Menu",Toast.LENGTH_LONG).show();
                break;
            default:
        }
        return true;
    }



}