package com.creation.anindya.uiautomatorsample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * An {@link Activity} that gets a text string from the user and displays it back when the user
 * clicks on one of the two buttons. The first one shows it in the same activity and the second
 * one opens another activity and displays the message.
 */
public class MainActivity extends AppCompatActivity {

    // The TextView used to display the message inside the Activity.
    private TextView mTextView;

    // The EditText where the user types the message.
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mTextView = (TextView) findViewById(R.id.textToBeChanged);
        mEditText = (EditText) findViewById(R.id.editTextUserInput);

        findViewById(R.id.changeTextBt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String text = mEditText.getText().toString();
                mTextView.setText(text);

            }
        });

        findViewById(R.id.activityChangeTextBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String text = mEditText.getText().toString();
/*                Intent intent = new Intent(MainActivity.this, ShowTextActivity.class);
                intent.putExtra(text, text);
                startActivity(intent);*/
                Intent intent = ShowTextActivity.newStartIntent(MainActivity.this, text);
                startActivity(intent);
            }
        });
    }

}
