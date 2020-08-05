package com.example.number_system_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Decimal_Conversion extends AppCompatActivity {




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
        setContentView(R.layout.activity_decimal__conversion);









try {


    final EditText txt1 = (EditText) findViewById(R.id.binary_text2);

    final EditText edbn = (EditText) findViewById(R.id.decimal_text2);

    final EditText txt2 = (EditText) findViewById(R.id.octal_text2);

    final EditText txt3 = (EditText) findViewById(R.id.hexa_text2);


    Button btn1 = (Button) findViewById(R.id.btn_1_1_1);
    Button btn0 = (Button) findViewById(R.id.btn_0_0_0);
    Button btn2 = (Button) findViewById(R.id.btn_2);
    Button btn3 = (Button) findViewById(R.id.btn_3);
    Button btn4 = (Button) findViewById(R.id.btn_4);
    Button btn5 = (Button) findViewById(R.id.btn_5);
    Button btn6 = (Button) findViewById(R.id.btn_6);
    Button btn7 = (Button) findViewById(R.id.btn_7);
    Button btn8 = (Button) findViewById(R.id.btn_8);
    Button btn9 = (Button) findViewById(R.id.btn_9);
    Button btn10 = (Button) findViewById(R.id.btn_clear1);
    Button btn11 = (Button) findViewById(R.id.btn_del1);
    Button btn12 = (Button) findViewById(R.id.convert_all2);


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


long dec = Long.parseLong(edbn.getText().toString());

                    String bin = Long.toBinaryString(dec);

                    String Hex = Long.toHexString(dec);

                    String octal = Long.toOctalString(dec);


                    if(edbn.getText().toString().equals("")) {



                        txt1.setText("");

                        txt2.setText("");
                        txt3.setText("");
                    }
                    else {

                        txt1.setText(bin);

                        txt2.setText(octal);

                        txt3.setText(Hex.toUpperCase());
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
