package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView register,forpass;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.editTextText);
        e2=(EditText) findViewById(R.id.editTextTextPassword);
        b1=(Button) findViewById(R.id.button);
        register=findViewById(R.id.textView3);
        forpass=findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=e1.getText().toString();
                String pass=e2.getText().toString();
                if(user.equals("Suyash")&& pass.equals("1234"))
                {
                    Intent i=new Intent(MainActivity.this, dashboard.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid Username & Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        register.setMovementMethod(LinkMovementMethod.getInstance());
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, registration.class);
                startActivity(intent);
            }
        });
        forpass.setMovementMethod(LinkMovementMethod.getInstance());
        forpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, forgot_password.class);
                startActivity(intent);
            }
        });

    }
}