package com.example.number_system_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Hexa_conversion extends AppCompatActivity {




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
        setContentView(R.layout.activity_hexa_conversion);


        final EditText txt3 = (EditText) findViewById(R.id.binary_text_hex);

        final EditText txt1 = (EditText)findViewById(R.id.Decimal_text_hex);

        final EditText txt2 = (EditText)findViewById(R.id.octal_text_hex);

        final EditText edbn = (EditText)findViewById(R.id.hexa_text_hex);


        Button btn1 = (Button) findViewById(R.id.btn1_hex);
        Button btn0 = (Button) findViewById(R.id.btn_0_hex);
        Button btn2 = (Button) findViewById(R.id.btn_2_hex);
        Button btn3 = (Button) findViewById(R.id.btn_3_hex);
        Button btn4 = (Button) findViewById(R.id.btn_4_hex);
        Button btn5 = (Button) findViewById(R.id.btn_5_hex);
        Button btn6 = (Button) findViewById(R.id.btn_6_hex);
        Button btn7 = (Button) findViewById(R.id.btn_7_hex);
        Button btn8 = (Button) findViewById(R.id.btn_8_hex);
        Button btn9 = (Button) findViewById(R.id.btn_9_hex);
        Button btnA = (Button) findViewById(R.id.btn_A_hex);
        Button btnB = (Button) findViewById(R.id.btn_B_hex);
        Button btnC = (Button) findViewById(R.id.btn_C_Hex);
        Button btnD = (Button) findViewById(R.id.btn_D_hex);
        Button btnE = (Button) findViewById(R.id.btn_E_hex);
        Button btnF = (Button) findViewById(R.id.btn_F_hex);
        Button btn10 = (Button) findViewById(R.id.btn_clear_hex);
        Button btn11 = (Button) findViewById(R.id.btn_del_hex);
        Button btn12 = (Button) findViewById(R.id.btn_Convert_hex);









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
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                edbn.setText(edbn.getText()+"8");






            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                edbn.setText(edbn.getText()+"9");






            }
        });



        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                edbn.setText(edbn.getText()+"A");






            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                edbn.setText(edbn.getText()+"B");






            }
        });


        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                edbn.setText(edbn.getText()+"C");






            }
        });

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                edbn.setText(edbn.getText()+"D");






            }
        });

        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                edbn.setText(edbn.getText()+"E");






            }
        });
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                edbn.setText(edbn.getText()+"F");






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
                    String hexadecimal = edbn.getText().toString();

                    long decimal = Long.parseLong(hexadecimal, 16);

                    String binary = Long.toBinaryString(decimal);
                    String octal = Long.toOctalString(decimal);

                    if(edbn.getText().toString().equals("")) {



                        txt1.setText("");

                        txt2.setText("");
                        txt3.setText("");
                    }
                    else {


                        txt1.setText(String.valueOf(decimal));
                        txt2.setText(octal);
                        txt3.setText(binary);

                    }


                }
                catch (Exception ex){


                }





            }
        });
















    }
}
