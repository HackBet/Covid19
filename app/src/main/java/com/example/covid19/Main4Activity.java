package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main4Activity extends AppCompatActivity {
ImageButton b1,b22;
Button b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

b1 = (ImageButton)findViewById(R.id.imageButton);
b22 = (ImageButton)findViewById(R.id.imageButton2);
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:8335"));
        startActivity(intent);
    }
});
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0112765340"));
                startActivity(intent);
            }
        });
        b2 =(Button)findViewById(R.id.button2);
        b3 =(Button)findViewById(R.id.button3);
        b4 =(Button)findViewById(R.id.button4);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(),Main11Activity.class ));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(),Main12Activity.class ));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(),Main13Activity.class ));
            }
        });

    }
}
