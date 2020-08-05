package com.example.number_system_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Octal_conversion extends AppCompatActivity {




    public String Removelast( String anyVal){


        int length = anyVal.length();
        String newvale="";


        for (int i = 0; i < length - 1; i++) {

            newvale += anyVal.charAt(i);

        }


        return newvale;

    }


    public  long convertOctalToBinary(long octalNumber)
    {
        long decimalNumber = 0, i = 0;
        long binaryNumber = 0;
        while(octalNumber != 0)
        {
            decimalNumber += (octalNumber % 10) * Math.pow(8, i);
            ++i;
            octalNumber/=10;
        }
        i = 1;
        while (decimalNumber != 0)
        {
            binaryNumber += (decimalNumber % 2) * i;
            decimalNumber /= 2;
            i *= 10;
        }
        return binaryNumber;
    }







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octal_conversion);











            final EditText txt1 = (EditText) findViewById(R.id.binary_text_oct);

            final EditText txt2 = (EditText) findViewById(R.id.decimal_text_oct);

            final EditText edbn = (EditText) findViewById(R.id.octal_text_oct);

            final EditText txt3 = (EditText) findViewById(R.id.hexa_text_oct);


            Button btn1 = (Button) findViewById(R.id.btn_1_oct);
            Button btn0 = (Button) findViewById(R.id.btn_0_oct);
            Button btn2 = (Button) findViewById(R.id.btn_2_oct);

            Button btn3 = (Button) findViewById(R.id.btn_3_oct);
            Button btn4 = (Button) findViewById(R.id.btn_4_oct);
            Button btn5 = (Button) findViewById(R.id.btn_5_oct);
            Button btn6 = (Button) findViewById(R.id.btn_6_oct);
            Button btn7 = (Button) findViewById(R.id.btn_7_oct2);
            Button btn10 = (Button) findViewById(R.id.btn_clear_oct);
            Button btn11 = (Button) findViewById(R.id.btn_del_oct);
            Button btn12 = (Button) findViewById(R.id.convert_all3);

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


                    edbn.setText(edbn.getText()+"1");






                }
            });


        try {



            btn0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    edbn.setText(edbn.getText()+"0");






                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                    edbn.setText(edbn.getText()+"2");






                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                    edbn.setText(edbn.getText()+"3");






                }
            });



            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                    edbn.setText(edbn.getText()+"4");






                }
            });


            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                    edbn.setText(edbn.getText()+"5");






                }
            });


            btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                    edbn.setText(edbn.getText()+"6");






                }
            });


            btn7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                    edbn.setText(edbn.getText()+"7");






                }
            });


            btn11.setOnClickListener(new View.OnClickListener() {
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


            btn10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {




                    edbn.setText("");
                    txt1.setText("");
                    txt2.setText("");
                    txt3.setText("");






                }
            });

            btn12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    try {


                    //    int dec = Integer.parseInt(edbn.getText().toString());

                     //   String bin = Integer.toBinaryString(dec);

                       // String Hex = Integer.toHexString(dec);

                   //     String octal = Integer.toOctalString(dec);

                        String octalString= edbn.getText().toString();
                       // long binary=Long.parseLong(octalString,2);
                        long decimal=Long.parseLong(octalString,8);
                        String Hex=Long.toHexString(decimal);
                        String binary = Long.toBinaryString(decimal);
                        //  int  Hexa=Integer.parseInt(edbn.getText().toString(),16);
                       // int  binary=Integer.parseInt(edbn.getText().toString(),2);

                        if(edbn.getText().toString().equals("")) {



                            txt1.setText("");

                            txt2.setText("");
                            txt3.setText("");
                        }
                        else {
                               txt1.setText(binary);
                            txt2.setText(String.valueOf(decimal));
                           txt3.setText(Hex.toUpperCase());



                         //   txt2.setText(String.valueOf(decimal));

                           // txt3.setText(String.valueOf(Hexa));
                        }


                    }
                    catch (Exception ex){


                    }





                }
            });



        }

        catch (Exception ex){


        }











    }
}
