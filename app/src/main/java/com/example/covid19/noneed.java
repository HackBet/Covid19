package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class noneed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noneed);
        TextView textView = new TextView(this);
        textView.setWidth(RelativeLayout.LayoutParams.MATCH_PARENT);
        textView.setHeight(RelativeLayout.LayoutParams.WRAP_CONTENT);
        textView.setText(R.string.app_name);


    }
}