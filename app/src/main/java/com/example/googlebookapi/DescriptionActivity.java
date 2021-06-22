package com.example.googlebookapi;

import android.content.Intent;
import android.os.Bundle;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DescriptionActivity extends AppCompatActivity {

    // Declare TextViw, description of the book
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        // Get the description of the book
        Intent intent = getIntent();
        String desc = intent.getStringExtra(MainActivity.DESC);
        // Initialize the TextView
        description = (TextView) findViewById(R.id.desc);
        // If there is no description
        if(desc.equals("")){
            description.setText(getString(R.string.noDescription));
        }else {
            description.setText(desc);
        }
    }
}
