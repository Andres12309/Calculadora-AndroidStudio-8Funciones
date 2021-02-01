package com.example.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
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

        //numeros
        Button cero=(Button)findViewById(R.id.cero);
        cero.setOnClickListener(this);
        Button uno=(Button)findViewById(R.id.uno);
        uno.setOnClickListener(this);
        Button dos=(Button)findViewById(R.id.dos);
        dos.setOnClickListener(this);
        Button tres=(Button)findViewById(R.id.tres);
        tres.setOnClickListener(this);
        Button cuatro=(Button)findViewById(R.id.cuatro);
        cuatro.setOnClickListener(this);
        Button cinco=(Button)findViewById(R.id.cinco);
        cinco.setOnClickListener(this);
        Button seis=(Button)findViewById(R.id.seis);
        seis.setOnClickListener(this);
        Button siete=(Button)findViewById(R.id.siete);
        siete.setOnClickListener(this);
        Button ocho=(Button)findViewById(R.id.ocho);
        ocho.setOnClickListener(this);
        Button nueve=(Button)findViewById(R.id.nueve);
        nueve.setOnClickListener(this);
        Button punto=(Button)findViewById(R.id.decimal);
        punto.setOnClickListener(this);

        //operaciones
        Button suma=(Button)findViewById(R.id.suma);
        suma.setOnClickListener(this);
        Button resta=(Button)findViewById(R.id.resta);
        resta.setOnClickListener(this);
        Button multipli=(Button)findViewById(R.id.multiplicacion);
        multipli.setOnClickListener(this);
        Button divi=(Button)findViewById(R.id.dividir);
        divi.setOnClickListener(this);
        Button porcent=(Button)findViewById(R.id.porcentaje);
        porcent.setOnClickListener(this);
        Button parentesis1=(Button)findViewById(R.id.parentesisAbrir);
        parentesis1.setOnClickListener(this);
        Button parentesis2=(Button)findViewById(R.id.CerrarParentesis);
        parentesis2.setOnClickListener(this);
        Button raiz=(Button)findViewById(R.id.raiz);
        raiz.setOnClickListener(this);
        Button potencia=(Button)findViewById(R.id.potencia);
        potencia.setOnClickListener(this);
        Button logaritmo=(Button)findViewById(R.id.logaritmo);
        logaritmo.setOnClickListener(this);
        Button seno=(Button)findViewById(R.id.seno);
        seno.setOnClickListener(this);
        Button igual=(Button)findViewById(R.id.igual);
        igual.setOnClickListener(this);

        //clear
        Button clear=(Button)findViewById(R.id.limpiar);
        clear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView display= (TextView)findViewById(R.id.TxtViewDisplay);
        int selected=v.getId();

        String displayView = display.getText().toString();

        try {
            switch (selected){
                case R.id.cero:
                    display.setText(displayView+"0");
                    break;
                case R.id.uno:
                    display.setText(displayView+"1");
                    break;
                case R.id.dos:
                    display.setText(displayView+"2");
                    break;
                case R.id.tres:
                    display.setText(displayView+"3");
                    break;
                case R.id.cuatro:
                    display.setText(displayView+"4");
                    break;
                case R.id.cinco:
                    display.setText(displayView+"5");
                    break;
                case R.id.seis:
                    display.setText(displayView+"6");
                    break;
                case R.id.siete:
                    display.setText(displayView+"7");
                    break;
                case R.id.ocho:
                    display.setText(displayView+"8");
                    break;
                case R.id.nueve:
                    display.setText(displayView+"9");
                    break;
                case R.id.decimal:
                    if(decimal==false){
                        display.setText(displayView+".");
                        decimal=true;
                    }else{
                        return;
                    }
                    break;
                case R.id.parentesisAbrir:
                    if(parentesisOpen==false){
                        display.setText(displayView+"(");
                        parentesisOpen=true;
                    }else{
                        return;
                    }
                    break;
                case R.id.CerrarParentesis:
                    if(parentesisClose==false){
                        display.setText(displayView+")");
                        parentesisClose=true;
                    }else{
                        return;
                    }
                    break;
                case R.id.resta:
                    restar=true;
                    numeros[0]=Double.parseDouble(displayView);
                    display.setText("");
                    decimal=false;
                    parentesisOpen=false;
                    parentesisClose=false;
                    break;
                case R.id.suma:
                    suma=true;
                    numeros[0]=Double.parseDouble(displayView);
                    display.setText("");
                    decimal=false;
                    parentesisOpen=false;
                    parentesisClose=false;
                    break;
                case R.id.dividir:
                    division=true;
                    numeros[0]=Double.parseDouble(displayView);
                    display.setText("");
                    decimal=false;
                    parentesisOpen=false;
                    parentesisClose=false;
                    break;
                case R.id.multiplicacion:
                    multiplicacion=true;
                    numeros[0]=Double.parseDouble(displayView);
                    display.setText("");
                    decimal=false;
                    parentesisOpen=false;
                    parentesisClose=false;
                    break;
                case R.id.potencia:
                    potencia=true;
                    numeros[0]=Double.parseDouble(displayView);
                    numeros[1]=Double.parseDouble(displayView);
                    display.setText("");
                    result = Math.pow(numeros[0],numeros[1]);
                    display.setText(String.valueOf(result));
                    decimal=false;
                    parentesisOpen=false;
                    parentesisClose=false;
                    break;
                case R.id.raiz:
                    raiz=true;
                    numeros[0]=Double.parseDouble(displayView);
                    display.setText("");
                    result=Math.sqrt(numeros[0]);
                    display.setText(String.valueOf(result));
                    decimal=false;
                    parentesisOpen=false;
                    parentesisClose=false;
                    break;
                case R.id.seno:
                    sen=true;
                    numeros[0]=Double.parseDouble(displayView);
                    display.setText("");
                    result=Math.sin(numeros[0]*Math.PI/180);
                    display.setText(String.valueOf(result));
                    decimal=false;
                    parentesisOpen=false;
                    parentesisClose=false;
                    break;
                case R.id.logaritmo:
                    log=true;
                    numeros[0]=Double.parseDouble(displayView);
                    display.setText("");
                    result=Math.log(numeros[0]);
                    display.setText(String.valueOf(result));
                    decimal=false;
                    parentesisOpen=false;
                    parentesisClose=false;
                    break;
                case R.id.porcentaje:
                    porcentaje=true;
                    numeros[0]=Double.parseDouble(displayView);
                    display.setText("");
                    result=numeros[0]*100/numeros[1];
                    display.setText(String.valueOf(result));
                    decimal=false;
                    parentesisOpen=false;
                    parentesisClose=false;
                    break;
                case R.id.igual:
                    numeros[1]=Double.parseDouble(displayView);
                    if(restar=true){
                        result=numeros[1]-numeros[2];
                        display.setText(String.valueOf(result));
                    }
                    else if(suma==true){
                        result = numeros[0]+numeros[1];
                        display.setText(String.valueOf(result));
                    }
                    else if(multiplicacion==true){
                        result = numeros[0]*numeros[1];
                        display.setText(String.valueOf(result));
                    }
                    else if(division==true){
                        result = numeros[0]/numeros[1];
                        display.setText(String.valueOf(result));
                    }
                    decimal=false;
                    parentesisOpen=false;
                    parentesisClose=false;
                    restar=false;
                    suma=false;
                    division=false;
                    multiplicacion=false;
                    potencia=false;
                    porcentaje=false;
                    sen=false;
                    raiz=false;
                    log=false;
                    break;
                case R.id.limpiar:
                    display.setText("");
                    decimal=false;
                    parentesisOpen=false;
                    parentesisClose=false;
                    break;
            }
        }catch (Exception e){
            display.setText("ERROR");
        }
    }
}