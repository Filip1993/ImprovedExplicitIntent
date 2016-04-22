package com.filipkesteli.improvedexplicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText etReceivedMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initWidgets();
        handleIntent();
    }

    private void initWidgets() {
        etReceivedMessage = (EditText) findViewById(R.id.etReceivedMessage);
    }

    private void handleIntent() {
        Intent intent = getIntent();
        if (intent.hasExtra(MainActivity.PARAMETER_NAME)) {
            String message = intent.getStringExtra(MainActivity.PARAMETER_NAME);
            etReceivedMessage.setText(message);
        }
    }
}
