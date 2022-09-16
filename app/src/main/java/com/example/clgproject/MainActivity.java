package com.example.clgproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=(Button)findViewById(R.id.Button1);
        Button b2=(Button)findViewById(R.id.Button2);
        Button b3=(Button)findViewById(R.id.Button3);
        Button b4=(Button)findViewById(R.id.Button4);
        Button b5=(Button)findViewById(R.id.Button5);
        Button b6=(Button)findViewById(R.id.Button6);
        Button b7=(Button)findViewById(R.id.Button7);
        Button b8=(Button)findViewById(R.id.Button8);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(MainActivity.this,medical.class);
                startActivity(int1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(MainActivity.this,bites.class);
                startActivity(int2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(MainActivity.this,accident.class);
                startActivity(int3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4=new Intent(MainActivity.this,nearby.class);
                startActivity(int4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5=new Intent(MainActivity.this,first.class);
                startActivity(int5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6=new Intent(MainActivity.this,disaster.class);
                startActivity(int6);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int7=new Intent(MainActivity.this,helpline.class);
                startActivity(int7);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int8=new Intent(MainActivity.this,otherapps.class);
                startActivity(int8);
            }
        });
    }
}