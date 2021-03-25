package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button b6,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

  b6 =(Button)findViewById(R.id.button6);
  b2 =(Button)findViewById(R.id.button2);
  b3 =(Button)findViewById(R.id.button3);
  b4 =(Button)findViewById(R.id.button4);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(),Main6Activity.class ));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(),Main7Activity.class ));
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

          startActivity(new Intent(getApplicationContext(),Main3Activity.class ));
           }
  });
  b2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          startActivity(new Intent(getApplicationContext(),Main5Activity.class ));
      }
  });

    }


}
