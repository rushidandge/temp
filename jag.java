package com.example.jagdish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast T= Toast.makeText(MainActivity.this,"This is Top left button",Toast.LENGTH_SHORT);
                T.setGravity(Gravity.CENTER,0,0);
                T.show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast T= Toast.makeText(MainActivity.this,"This is Top right button",Toast.LENGTH_SHORT);
                T.setGravity(Gravity.CENTER,0,0);
                T.show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast T= Toast.makeText(MainActivity.this,"This is middle button",Toast.LENGTH_SHORT);
                T.setGravity(Gravity.CENTER,0,0);
                T.show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast T= Toast.makeText(MainActivity.this,"This is bottom left button",Toast.LENGTH_SHORT);
                T.setGravity(Gravity.CENTER,0,0);
                T.show();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast T= Toast.makeText(MainActivity.this,"This is bottom right button",Toast.LENGTH_SHORT);
                T.setGravity(Gravity.CENTER,0,0);
                T.show();
            }
        });


    }
}
