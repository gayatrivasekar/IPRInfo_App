package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dashboard extends AppCompatActivity {
ImageView copy,trade,trade_sec,patent,intellectual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        intellectual=findViewById(R.id.imageView2);
        copy=findViewById(R.id.imageView3);
        trade=findViewById(R.id.imageView4);
        trade_sec=findViewById(R.id.imageView5);
        patent=findViewById(R.id.imageView6);

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(dashboard.this,copyright_dash.class);
                startActivity(i);
            }
        });
        intellectual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(dashboard.this,intellectual.class);
                startActivity(i);
            }
        });
patent.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(dashboard.this,patent_dashboard.class);
        startActivity(i);
    }
});
trade.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(dashboard.this,trademark_dash.class);
        startActivity(i);
    }
});
        trade_sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(dashboard.this,tradesecret_dash.class);
                startActivity(i);
            }
        });
    }
}