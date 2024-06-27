package com.example.schoolapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Profile extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5;
    AppCompatButton bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);
        ed1=(EditText) findViewById(R.id.Name);
        ed2=(EditText) findViewById(R.id.age);
        ed3=(EditText) findViewById(R.id.hname);
        ed4=(EditText) findViewById(R.id.pincd);
        ed5=(EditText) findViewById(R.id.mobno);
        bt1=(AppCompatButton) findViewById(R.id.updatebt);
        bt2=(AppCompatButton) findViewById(R.id.homebt);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), HomePage.class);
                startActivity(i);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"updated",Toast.LENGTH_LONG).show();
            }
        });
    }
}