package com.filipkesteli.improvedexplicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etMessage;
    private Button btnSend;

    //KLJUC za INTENT:
    public static final String PARAMETER_NAME = "com.filipkesteli.improvedexplicitintent.intentparam";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setupListeners();
    }

    private void initWidgets() {
        etMessage = (EditText) findViewById(R.id.etMessage);
        btnSend = (Button) findViewById(R.id.btnSend);
    }

    private void setupListeners() {
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendIntent();
            }
        });
    }

    private void sendIntent() {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(PARAMETER_NAME, etMessage.getText().toString());
        startActivity(intent);
    }
}
