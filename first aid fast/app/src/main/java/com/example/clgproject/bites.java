package com.example.clgproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bites);


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
                Intent int1=new Intent(bites.this,strings.class);
                startActivity(int1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(bites.this,bedbug.class);
                startActivity(int2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(bites.this,bee.class);
                startActivity(int3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4=new Intent(bites.this,snake.class);
                startActivity(int4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5=new Intent(bites.this,centipede.class);
                startActivity(int5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6=new Intent(bites.this,dog.class);
                startActivity(int6);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int7=new Intent(bites.this,scor.class);
                startActivity(int7);
            }
        });

    }
}