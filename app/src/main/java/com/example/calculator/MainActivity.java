package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText calculation, result;
    private String curr, out;

    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot, btnAC, btnSave, btnDel, btnPlus, btnEqual, btnDiv, btnMinus, btnX, btnInsert;

    private boolean dot_inserted, operator_inserted;

    private String saved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculation = (EditText) findViewById(R.id.calc);
        result = (EditText) findViewById(R.id.res);

        curr = "";
        out = "";
        saved = "";

        dot_inserted = false;
        operator_inserted = false;

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnAC = (Button) findViewById(R.id.btnAC);
        btnDel = (Button) findViewById(R.id.btnDel);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnX = (Button) findViewById(R.id.btnX);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnInsert = (Button) findViewById(R.id.btnInsert);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               curr = curr + "0";
               displayOne();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "1";
                displayOne();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "2";
                displayOne();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "3";
                displayOne();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "4";
                displayOne();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "5";
                displayOne();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "6";
                displayOne();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "7";
                displayOne();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "8";
                displayOne();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "9";
                displayOne();
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curr.isEmpty())
                {
                    curr = "0.";
                    dot_inserted = true;
                }

                if (dot_inserted == false)
                {
                    curr = curr + ".";
                    dot_inserted = true;
                }

                displayOne();
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "/";
                displayOne();
            }
        });

        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "x";
                displayOne();
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "-";
                displayOne();
            }
        });


        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "+";
                displayOne();
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                displayOne();
                displayTwo();
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backspace();
                displayOne();
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted = false;
                if (!curr.isEmpty())
                {
                    if(curr.substring(curr.length()-1, curr.length()).equals("."))
                    {
                        backspace();
                        displayOne();
                    }
                    if(operator_inserted == false)
                    {
                        curr = curr + " / ";
                        operator_inserted = true;
                        displayOne();
                    }
                }
                displayOne();
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted = false;
                if (!curr.isEmpty())
                {
                    if(curr.substring(curr.length()-1, curr.length()).equals("."))
                    {
                        backspace();
                        displayOne();
                    }
                    if(operator_inserted == false)
                    {
                        curr = curr + " + ";
                        operator_inserted = true;
                        displayOne();
                    }
                }
                displayOne();
            }
        });

        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted = false;
                if (!curr.isEmpty())
                {
                    if(curr.substring(curr.length()-1, curr.length()).equals("."))
                    {
                        backspace();
                        displayOne();
                    }
                    if(operator_inserted == false)
                    {
                        curr = curr + " x ";
                        operator_inserted = true;
                        displayOne();
                    }
                }
                displayOne();
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted = false;
                if (!curr.isEmpty())
                {
                    if(curr.substring(curr.length()-1, curr.length()).equals("."))
                    {
                        backspace();
                        displayOne();
                    }
                    if(operator_inserted == false)
                    {
                        curr = curr + " - ";
                        operator_inserted = true;
                        displayOne();
                    }
                }
                displayOne();
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator_inserted == true && !curr.substring(curr.length()-1, curr.length()).equals(" "))
                {
                    String[]  tokens = curr.split(" ");
                    switch (tokens[1].charAt(0))
                    {
                        case '+':
                            out = Double.toString(Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]));
                            break;
                        case '/':
                            out = Double.toString(Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
                            break;
                        case 'x':
                            out = Double.toString(Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
                            break;
                        case '-':
                            out = Double.toString(Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                            break;
                    }
                    displayTwo();
                }
            }
        });
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!out.isEmpty())
                {
                    saved = out;
                }
            }
        });

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!saved.isEmpty())
                {
                    if (curr.isEmpty()) {
                        curr = saved;
                        displayOne();
                    }
                    if(operator_inserted == true)
                    {
                        curr = curr + " " + saved;
                        displayOne();
                    }
                }
            }
        });
    }

    public void displayOne()
    {

        calculation.setText(curr);
    }

    public void displayTwo()
    {

        result.setText(out);
    }

    public void clear()
    {
        curr = "";
        out = "";
        operator_inserted = false;
        dot_inserted = false;
    }

    public void backspace()
    {
        if (!curr.isEmpty())
        {
            if (curr.substring(curr.length()-1, curr.length()).equals("."))
            {
                dot_inserted = false;
            }
            if (curr.substring(curr.length()-1, curr.length()).equals(" "))
            {
                curr = curr.substring(0, curr.length()-3);
                operator_inserted = false;
            } else
            {
                curr = curr.substring(0, curr.length()-1);
            }
            curr = curr.substring(0, curr.length()-1);
        }
    }
}