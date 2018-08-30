package com.example.android.detailactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("key");
        TextView textView = (TextView)findViewById(R.id.joke_text_view);
        textView.setText(joke);
    }
}
