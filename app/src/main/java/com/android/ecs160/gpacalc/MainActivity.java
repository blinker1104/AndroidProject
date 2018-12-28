package com.android.ecs160.gpacalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn;
        btn = (Button) findViewById(R.id.btnClick);
        btn.setText("Text Changed!");

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Application", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
