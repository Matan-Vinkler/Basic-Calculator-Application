package com.matan.matancalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnAdd, btnSub, btnMult, btnDiv, btnDot, btnEnter, btnClear;
    TextView txtDisplay;

    double firstNum, secondNum, resultNum;
    String actionType;
    boolean new_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new_input = false;

        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btnAdd = findViewById(R.id.btn_add);
        btnSub = findViewById(R.id.btn_sub);
        btnMult = findViewById(R.id.btn_multiply);
        btnDiv = findViewById(R.id.btn_divide);
        btnDot = findViewById(R.id.btn_dot);
        btnEnter = findViewById(R.id.btn_enter);
        btnClear = findViewById(R.id.btn_clear);
        txtDisplay = findViewById(R.id.txt_out);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(new_input) {
                    txtDisplay.setText("");
                    new_input = false;
                }

                txtDisplay.setText(txtDisplay.getText().toString() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(new_input) {
                    txtDisplay.setText("");
                    new_input = false;
                }

                txtDisplay.setText(txtDisplay.getText().toString() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(new_input) {
                    txtDisplay.setText("");
                    new_input = false;
                }

                txtDisplay.setText(txtDisplay.getText().toString() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(new_input) {
                    txtDisplay.setText("");
                    new_input = false;
                }

                txtDisplay.setText(txtDisplay.getText().toString() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(new_input) {
                    txtDisplay.setText("");
                    new_input = false;
                }

                txtDisplay.setText(txtDisplay.getText().toString() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(new_input) {
                    txtDisplay.setText("");
                    new_input = false;
                }

                txtDisplay.setText(txtDisplay.getText().toString() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(new_input) {
                    txtDisplay.setText("");
                    new_input = false;
                }

                txtDisplay.setText(txtDisplay.getText().toString() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(new_input) {
                    txtDisplay.setText("");
                    new_input = false;
                }

                txtDisplay.setText(txtDisplay.getText().toString() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(new_input) {
                    txtDisplay.setText("");
                    new_input = false;
                }

                txtDisplay.setText(txtDisplay.getText().toString() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(new_input) {
                    txtDisplay.setText("");
                    new_input = false;
                }

                txtDisplay.setText(txtDisplay.getText().toString() + "9");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(new_input) {
                    txtDisplay.setText("");
                    new_input = false;
                }

                txtDisplay.setText(txtDisplay.getText().toString() + "+");
                actionType = "\\+";
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(new_input) {
                    txtDisplay.setText("");
                    new_input = false;
                }

                txtDisplay.setText(txtDisplay.getText().toString() + "-");
                actionType = "-";
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(new_input) {
                    txtDisplay.setText("");
                    new_input = false;
                }

                txtDisplay.setText(txtDisplay.getText().toString() + "*");
                actionType = "\\*";
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(new_input) {
                    txtDisplay.setText("");
                    new_input = false;
                }

                txtDisplay.setText(txtDisplay.getText().toString() + " / ");
                actionType = "/";
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(new_input) {
                    txtDisplay.setText("");
                    new_input = false;
                }

                txtDisplay.setText(txtDisplay.getText().toString() + ".");
            }
        });

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String[] ops = txtDisplay.getText().toString().split(actionType);

                    firstNum = Double.parseDouble(ops[0]);
                    secondNum = Double.parseDouble(ops[1]);

                    switch (actionType) {
                        case "\\+":
                            resultNum = add(firstNum, secondNum);
                            break;
                        case "-":
                            resultNum = sub(firstNum, secondNum);
                            break;
                        case "\\*":
                            resultNum = mult(firstNum, secondNum);
                            break;
                        case "/":
                            resultNum = div(firstNum, secondNum);
                            break;
                        default:
                            throw new Exception();
                    }

                    if(resultNum % 1 == 0) {
                        txtDisplay.setText(String.valueOf((int)resultNum));
                    }
                    else {
                        txtDisplay.setText(String.valueOf(resultNum));
                    }
                }
                catch (Exception e) {
                    txtDisplay.setText("Error");
                }
                finally {
                    new_input = true;
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setText("");
            }
        });
    }

    double add(double a, double b) {
        return a + b;
    }

    double sub(double a, double b) {
        return a - b;
    }

    double mult(double a, double b) {
        return a * b;
    }

    double div(double a, double b) {
        if(b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}