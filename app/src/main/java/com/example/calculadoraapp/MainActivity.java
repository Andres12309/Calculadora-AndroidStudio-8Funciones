package com.example.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    boolean decimal=false;
    boolean parentesisOpen=false;
    boolean parentesisClose=false;
    boolean restar=false;
    boolean suma=false;
    boolean division=false;
    boolean multiplicacion=false;
    boolean potencia=false;
    boolean porcentaje=false;
    boolean sen=false;
    boolean raiz=false;
    boolean log=false;

    Double[] numeros = new Double[10];
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}