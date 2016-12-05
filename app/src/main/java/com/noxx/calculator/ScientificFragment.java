package com.noxx.calculator;

/**
 * Created by HB on 05/12/2016.
 */

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
public class ScientificFragment extends Fragment {

    Button buttonSIN;
    Button buttonCOS;
    Button buttonTAN;
    Button buttonX2;
    Button buttonSIN1;
    Button buttonCOS1;
    Button buttonTAN1;
    Button buttonX3;
    Button buttonEX;
    Button button10X;
    Button button1X;
    Button buttonXY;
    Button buttonLN;
    Button buttonLOG;
    Button buttonSQRL;
    Button buttonPlusDivMoins;

    private ScientificFragmentManagerListner scientificFragmentManagerListner;


    public void setScientificFragmentManagerListner(ScientificFragmentManagerListner scientificFragmentManagerListner) {
        this.scientificFragmentManagerListner = scientificFragmentManagerListner;
    }

    public ScientificFragment() {
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
        View view = inflater.inflate(R.layout.fragment_scientific, container, false);

        buttonSIN = (Button) view.findViewById(R.id.sinus);
        buttonCOS = (Button) view.findViewById(R.id.cosinus);
        buttonTAN = (Button) view.findViewById(R.id.tangante);
        buttonX2 = (Button) view.findViewById(R.id.x2);
        buttonSIN1 = (Button) view.findViewById(R.id.sinus_1);
        buttonCOS1 = (Button) view.findViewById(R.id.cosinus_1);
        buttonTAN1 = (Button) view.findViewById(R.id.tangante_1);
        buttonX3 = (Button) view.findViewById(R.id.x3);
        buttonEX = (Button) view.findViewById(R.id.e_x);
        button10X = (Button) view.findViewById(R.id.ten_x);
        button1X = (Button) view.findViewById(R.id.one_div_x);
        buttonXY = (Button) view.findViewById(R.id.x_y);
        buttonLN = (Button) view.findViewById(R.id.ln);
        buttonLOG = (Button) view.findViewById(R.id.log);
        buttonSQRL = (Button) view.findViewById(R.id.sqrl);
        buttonPlusDivMoins = (Button) view.findViewById(R.id.plus_div_moins);


        buttonSIN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scientificFragmentManagerListner.onScientificButtonClick("SIN");
            }
        });

        buttonCOS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scientificFragmentManagerListner.onScientificButtonClick("COS");
            }
        });

        buttonTAN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scientificFragmentManagerListner.onScientificButtonClick("TAN");
            }
        });

        buttonX2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scientificFragmentManagerListner.onScientificButtonClick("X^2");
            }
        });

        buttonSIN1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scientificFragmentManagerListner.onScientificButtonClick("SIN-1");
            }
        });

        buttonCOS1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scientificFragmentManagerListner.onScientificButtonClick("COS-1");
            }
        });

        buttonTAN1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scientificFragmentManagerListner.onScientificButtonClick("TAN-1");
            }
        });

        buttonX3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scientificFragmentManagerListner.onScientificButtonClick("X3");
            }
        });

        buttonEX.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scientificFragmentManagerListner.onScientificButtonClick("E^X");
            }
        });

        button10X.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scientificFragmentManagerListner.onScientificButtonClick("10^X");
            }
        });

        button1X.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scientificFragmentManagerListner.onScientificButtonClick("1/X");
            }
        });

        buttonXY.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scientificFragmentManagerListner.onScientificButtonClick("X^Y");
            }
        });

        buttonLN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scientificFragmentManagerListner.onScientificButtonClick("LN");
            }
        });

        buttonLOG.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scientificFragmentManagerListner.onScientificButtonClick("LOG");
            }
        });

        buttonSQRL.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scientificFragmentManagerListner.onScientificButtonClick("SQRL");
            }
        });

        buttonPlusDivMoins.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scientificFragmentManagerListner.onScientificButtonClick("+/-");
            }
        });

        return view;
    }

}
