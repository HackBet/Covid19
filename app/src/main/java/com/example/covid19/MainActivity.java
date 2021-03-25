package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Timer time;
    Button b1;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar =(ProgressBar)findViewById(R.id.progressBar);
        b1 = (Button)findViewById(R.id.button);

        time = new Timer();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                time.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        Intent intent = new Intent( MainActivity.this,Main2Activity.class);
                        startActivity(intent);

                        finish();

                    }
                },3000);
            }
        });



    }
}
