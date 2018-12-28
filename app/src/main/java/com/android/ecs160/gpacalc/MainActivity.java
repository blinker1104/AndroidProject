package com.android.ecs160.gpacalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
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

        EditText editText1  = (EditText) findViewById(R.id.editText1);
        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //Not using
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                final String printVal = (EditText)findViewById(R.id.editText1).getText();
                Toast.makeText(getApplicationContext(), "Value = " + printVal, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}
