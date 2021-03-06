package com.noxx.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




import android.app.Activity;




public class MainActivity extends AppCompatActivity implements FragmentManagerListner {




    Button buttonEgal;
    TextView screen;

    private double chiffre1;
    private boolean clicOperateur = false;
    private boolean update = false;
    private String operateur = "";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        screen = (TextView) findViewById(R.id.text_field);

        buttonEgal = (Button) findViewById(R.id.buttonEgal);

        buttonEgal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                egalClick();
            }
        });

        getSupportActionBar().hide();



    }public void chiffreClick(String string) {
        if(update){
            update = false;
        }else{
            if(!screen.getText().equals("0"))
                string = screen.getText() + string;
        }
        screen.setText(string);
    }

    @Override
    protected void onStart() {
        super.onStart();
        NormalFragment normalFragment = (NormalFragment) getSupportFragmentManager().findFragmentById(R.id.normal_fragment);
        normalFragment.setFragmentManagerListner(this);
    }

    public void plusClick(){

        if(clicOperateur){
            calcul();
            screen.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(screen.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "+";
        update = true;
    }


    public void moinsClick(){
        if(clicOperateur){
            calcul();
            screen.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(screen.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "-";
        update = true;
    }


    public void mulClick(){
        if(clicOperateur){
            calcul();
            screen.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(screen.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "*";
        update = true;
    }


    public void divClick(){
        if(clicOperateur){
            calcul();
            screen.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(screen.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "/";
        update = true;
    }


    public void egalClick(){
        calcul();
        update = true;
        clicOperateur = false;
    }


    public void resetClick(){
        clicOperateur = false;
        update = true;
        chiffre1 = 0;
        operateur = "";
        screen.setText("");
    }



    protected void calcul(){
        if(operateur.equals("+")){
            chiffre1 = chiffre1 + Double.valueOf(screen.getText().toString()).doubleValue();
            screen.setText(String.valueOf(chiffre1));
        }

        if(operateur.equals("-")){
            chiffre1 = chiffre1 - Double.valueOf(screen.getText().toString()).doubleValue();
            screen.setText(String.valueOf(chiffre1));
        }

        if(operateur.equals("*")){
            chiffre1 = chiffre1 * Double.valueOf(screen.getText().toString()).doubleValue();
            screen.setText(String.valueOf(chiffre1));
        }

        if(operateur.equals("/")){
            try{
                chiffre1 = chiffre1 / Double.valueOf(screen.getText().toString()).doubleValue();
                screen.setText(String.valueOf(chiffre1));
            }catch(ArithmeticException e){
                screen.setText("0");
            }
        }
    }

    @Override
    public void onNormalButtonClick(String string) {
        switch (string){
            case "plus":
                plusClick();
                break;
            case "moins":
                moinsClick();
                break;
            case "multiplication":
                mulClick();
                break;
            case "division":
                divClick();
                break;
            case "clear":
                resetClick();
                break;
            case "dot":
                chiffreClick(".");
                break;
            case "0":
                chiffreClick("0");
                break;
            case "1":
                chiffreClick("1");
                break;
            case "2":
                chiffreClick("2");
                break;
            case "3":
                chiffreClick("3");
                break;
            case "4":
                chiffreClick("4");
                break;
            case "5":
                chiffreClick("5");
                break;
            case "6":
                chiffreClick("6");
                break;
            case "7":
                chiffreClick("7");
                break;
            case "8":
                chiffreClick("8");
                break;
            case "9":
                chiffreClick("9");
                break;



        }
    }
}/*public class MainActivity extends AppCompatActivity {


    private TextView screen;
    private boolean initialise=false;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final CalculatorManager cm = new CalculatorManager();

        final TextView screen = (TextView) findViewById(R.id.text_field);
        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button buttonPoint = (Button) findViewById(R.id.buttonPoint);
        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        Button buttonMoins = (Button) findViewById(R.id.buttonMoins);
        Button buttonDiv = (Button) findViewById(R.id.buttonDivision);
        Button buttonMul = (Button) findViewById(R.id.buttonMultiplier);
        Button buttonClear = (Button) findViewById(R.id.buttonClear);
        Button buttonEgal = (Button) findViewById(R.id.buttonEgal);


        buttonPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen.setText(cm.calcul("+", screen.getText().toString()));
            }
        });

        buttonMoins.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //moinsClick();
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //divClick();
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //mulClick();
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resetClick();
            }
        });

        buttonEgal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                egalClick();
            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen.setText(dotClick(".",screen.getText().toString()));
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen.setText(typedNumber("0",screen.getText().toString()));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen.setText(typedNumber("1",screen.getText().toString()));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen.setText(typedNumber("2",screen.getText().toString()));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen.setText(typedNumber("3",screen.getText().toString()));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen.setText(typedNumber("4",screen.getText().toString()));
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen.setText(typedNumber("5",screen.getText().toString()));
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen.setText(typedNumber("6",screen.getText().toString()));
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen.setText(typedNumber("7",screen.getText().toString()));
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen.setText(typedNumber("8",screen.getText().toString()));
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen.setText(typedNumber("9",screen.getText().toString()));
            }
        });



    }


    public String typedNumber (String number, String display) {
        if (display.equals("0")){
            display=number;
        }else{
            display+=number;
        }return display;
    }

    public String dotClick(String point, String display) {
        if (!display.equals("0")){
            display+=point;
        }return display;
    }



    public void resetClick() {

        screen.setText("0");

    }

    public void egalClick() {

    }

    public void initButtons (View view) {
        int[] ids = {R.id.button0,R.id.button1,R.id.button2,R.id.button3,R.id.button0,R.id.button0,R.id.button0,R.id.button0,R.id.button0,R.id.button0
                R.id.button0,R.id.button0,R.id.button0,R.id.button0}
                for(int id : ids){
                    view.findViewById(id).setOnClickListener(this);
                }
    }



}*/


