package com.example.number_system_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Binary_conversion extends AppCompatActivity {



    public String Removelast( String anyVal){


        int length = anyVal.length();
        String newvale="";


            for (int i = 0; i < length - 1; i++) {

                newvale += anyVal.charAt(i);

            }


return newvale;

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_conversion);


        final EditText edbn = (EditText) findViewById(R.id.binary_text);

        final EditText txt1 = (EditText)findViewById(R.id.decimal_text);

        final EditText txt2 = (EditText)findViewById(R.id.octal_text);

        final EditText txt3 = (EditText)findViewById(R.id.hexa_text);


        Button  btn1 = (Button)findViewById(R.id.btn_1);

        Button  btn2 = (Button)findViewById(R.id.btn_0);

        Button  btnd = (Button)findViewById(R.id.btn_clear);

        Button  btn3 = (Button)findViewById(R.id.btn_del);

        Button  btn5 = (Button)findViewById(R.id.convert_all);




            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { // API 21
                edbn.setShowSoftInputOnFocus(false);
            } else { // API 11-20
                edbn.setTextIsSelectable(true);
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { // API 21
                txt1.setShowSoftInputOnFocus(false);
            } else { // API 11-20
                txt1.setTextIsSelectable(true);
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { // API 21
                txt2.setShowSoftInputOnFocus(false);
            } else { // API 11-20
                txt2.setTextIsSelectable(true);
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { // API 21
                txt3.setShowSoftInputOnFocus(false);
            } else { // API 11-20
                txt3.setTextIsSelectable(true);
            }


edbn.setText("");


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String check;

               edbn.setText(edbn.getText()+"1");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                edbn.setText(edbn.getText()+"0");

                if(edbn.getText().toString()=="") {


                 //   txt1.setText("");

                }
                else {

                  //  double decimal = Integer.parseInt(edbn.getText().toString(), 2);

                    //txt1.setText(Double.toString(decimal));

                }

            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int len = edbn.getText().length();
                try {


                    if(edbn.getText().toString()=="") {


                        txt1.setText("");

                    }
                    else {
                        edbn.setText(Removelast(edbn.getText().toString()));
                     //   double decimal = Integer.parseInt(edbn.getText().toString(), 2);
                      //  txt1.setText(Double.toString(decimal));

                    }


                }


catch(Exception ex) {



    }


            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {


                    long decimal = Long.parseLong(edbn.getText().toString(), 2);


                    String HEX = Long.toHexString(decimal);

                    String ostr = Long.toOctalString(decimal);
                    String binaryString=edbn.getText().toString();

                    long decimal1=Long.parseLong(binaryString,2);

                    if (edbn.getText().toString().equals("")) {


                        txt1.setText("");

                        txt2.setText("");
                        txt3.setText("");
                    } else {
                        txt1.setText(String.valueOf(decimal1));
                        txt2.setText(ostr);
                        txt3.setText(HEX.toUpperCase());


                    }

                }

                catch (Exception ex){

                }

            }
        });

        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edbn.setText("");
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");

            }
        });

    }
    }

