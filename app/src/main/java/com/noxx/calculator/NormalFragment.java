package com.noxx.calculator;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class NormalFragment extends Fragment {

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonPlus;
    Button buttonMoins;
    Button buttonDiv;
    Button buttonMul;
    Button buttonClear;
    Button buttonPoint;

    private FragmentManagerListner fragmentManagerListner;


    public void setFragmentManagerListner(FragmentManagerListner fragmentManagerListner) {
        this.fragmentManagerListner = fragmentManagerListner;
    }

    public NormalFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_normal, container, false);

        button0 = (Button) view.findViewById(R.id.button0);
        button1 = (Button) view.findViewById(R.id.button1);
        button2 = (Button) view.findViewById(R.id.button2);
        button3 = (Button) view.findViewById(R.id.button3);
        button4 = (Button) view.findViewById(R.id.button4);
        button5 = (Button) view.findViewById(R.id.button5);
        button6 = (Button) view.findViewById(R.id.button6);
        button7 = (Button) view.findViewById(R.id.button7);
        button8 = (Button) view.findViewById(R.id.button8);
        button9 = (Button) view.findViewById(R.id.button9);
        buttonPoint = (Button) view.findViewById(R.id.buttonPoint);
        buttonPlus = (Button) view.findViewById(R.id.buttonPlus);
        buttonMoins = (Button) view.findViewById(R.id.buttonMoins);
        buttonDiv = (Button) view.findViewById(R.id.buttonDivision);
        buttonMul = (Button) view.findViewById(R.id.buttonMultiplier);
        buttonClear = (Button) view.findViewById(R.id.buttonClear);


        buttonPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fragmentManagerListner.onNormalButtonClick("plus");
            }
        });

        buttonMoins.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fragmentManagerListner.onNormalButtonClick("moins");
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fragmentManagerListner.onNormalButtonClick("division");
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fragmentManagerListner.onNormalButtonClick("multiplication");
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fragmentManagerListner.onNormalButtonClick("clear");
            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fragmentManagerListner.onNormalButtonClick("dot");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fragmentManagerListner.onNormalButtonClick("0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fragmentManagerListner.onNormalButtonClick("1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fragmentManagerListner.onNormalButtonClick("2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fragmentManagerListner.onNormalButtonClick("3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fragmentManagerListner.onNormalButtonClick("4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fragmentManagerListner.onNormalButtonClick("5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fragmentManagerListner.onNormalButtonClick("6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fragmentManagerListner.onNormalButtonClick("7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fragmentManagerListner.onNormalButtonClick("8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fragmentManagerListner.onNormalButtonClick("9");
            }
        });

        return view;
    }

}
