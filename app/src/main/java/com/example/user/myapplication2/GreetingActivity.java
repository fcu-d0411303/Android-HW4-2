package com.example.user.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 2017/4/18.
 */

public class GreetingActivity extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView)findViewById(R.id.say_hello);
        Intent intent = getIntent();
        String hello = "Hello ";
        if(intent != null) {
            String name = intent.getStringExtra("Name");
            if(name != null) {
                hello = hello + name;
            }
        }
        tv.setText(hello);
    }
}
