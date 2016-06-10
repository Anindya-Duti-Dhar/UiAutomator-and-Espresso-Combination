package com.creation.anindya.uiautomatorsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;


public class DisplayNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_name);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        String text = getIntent().getStringExtra(EnterNameActivity.NAME);
        TextView greetingTextView = (TextView) findViewById(R.id.greeting_message);
        greetingTextView.setText("Hello "  + text + "!");

    }
}
