package ru.startandroid.relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RelativeLayout layout;
    private Button red;
    private Button orenge;
    private Button yellow;
    private Button green;
    private Button blue;
    private Button indigo;
    private Button violet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.layout);
        red = findViewById(R.id.red);
        orenge = findViewById(R.id.orange);
        yellow = findViewById(R.id.yellow);
        green = findViewById(R.id.green);
        blue = findViewById(R.id.blue);
        indigo = findViewById(R.id.indigo);
        violet = findViewById(R.id.violet);
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(R.id.red);
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(R.id.yellow);
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(R.id.green);
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(R.id.blue);
            }
        });
        indigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(R.id.indigo);
            }
        });
        violet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(R.id.violet);
            }
        });
        orenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(R.id.orange);
            }
        });
    }

    //es chashxatec ese knayes eli
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.red:
                layout.setBackgroundColor(R.id.red);
                break;
            case R.id.orange:
                layout.setBackgroundColor(R.id.orange);
                break;
            case R.id.yellow:
                layout.setBackgroundColor(R.id.yellow);
                break;
            case R.id.green:
                layout.setBackgroundColor(R.id.green);
                break;
            case R.id.blue:
                layout.setBackgroundColor(R.id.blue);
                break;
            case R.id.indigo:
                layout.setBackgroundColor(R.id.indigo);
                break;
            case R.id.violet:
                layout.setBackgroundColor(R.id.violet);
                break;
        }
    }
}
