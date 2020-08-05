package com.example.number_system_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


Button btn1 = (Button) findViewById(R.id.btn_binary);
        Button btn2 = (Button) findViewById(R.id.btn_dec);
        Button btn3 = (Button) findViewById(R.id.btn_hex);
        Button btn4 = (Button) findViewById(R.id.btn_oct);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(getApplicationContext(), Binary_conversion.class);

                startActivity(i);

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(getApplicationContext(), Decimal_Conversion.class);

                startActivity(i);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(getApplicationContext(), Hexa_conversion.class);

                startActivity(i);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(getApplicationContext(), Octal_conversion.class);

                startActivity(i);

            }
        });












    }
}




