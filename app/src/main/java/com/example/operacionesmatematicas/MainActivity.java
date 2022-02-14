package com.example.operacionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.operacionesmatematicas.tablas.Dividir;
import com.example.operacionesmatematicas.tablas.Multiplicar;
import com.example.operacionesmatematicas.tablas.Resta;
import com.example.operacionesmatematicas.tablas.Suma;

public class MainActivity extends AppCompatActivity {
    EditText numero1,numero2;

    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnsuma,btnresta,btnmultiplicar,btndividir;

        numero1 = (EditText) findViewById(R.id.txtNum1);
        numero2 = (EditText) findViewById(R.id.txtNum2);
        btnsuma = (Button) findViewById(R.id.btnSuma);
        btnresta = (Button) findViewById(R.id.btnResta);
        btndividir = (Button) findViewById(R.id.btnDividir);
        btnmultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        //resultado = (TextView) findViewById(R.id.txtResultadoR);
        //final TextView resultado = (TextView) findViewById(R.id.txtResultado);

        btndividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dividir();
                limpiar();
            }
        });

        btnmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Multiplicar();
                limpiar();
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Restar();
                limpiar();
            }
        });

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sumar();
                limpiar();
            }
        });
    }

    private void dividir() {
        Dividir div = null;
        div = new Dividir();

        Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);

        div.setNum1(Integer.valueOf(numero1.getText().toString()));
        div.setNum2(Integer.valueOf(numero2.getText().toString()));
        div.setResultado(div.getNum1()/div.getNum2());

        intent.putExtra("resultado","La division es: "+div.getResultado());

        startActivity(intent);
    }

    private void Multiplicar() {
        Multiplicar multi = null;
        multi = new Multiplicar();

        Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);

        multi.setNum1(Integer.valueOf(numero1.getText().toString()));
        multi.setNum2(Integer.valueOf(numero2.getText().toString()));
        multi.setResultado(multi.getNum1() * multi.getNum2());

        intent.putExtra("resultado", "La multiplicacion es: "+multi.getResultado());

        startActivity(intent);
    }

    private void Restar() {
        Resta res = null;
        res = new Resta();

        Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);

        res.setNum1(Integer.valueOf(numero1.getText().toString()));
        res.setNum2(Integer.valueOf(numero2.getText().toString()));
        res.setResultado(res.getNum1()-res.getNum2());

        intent.putExtra("resultado","La reta es: "+res.getResultado());

        startActivity(intent);

    }

    private void Sumar() {

        Suma sum = null;
        sum = new Suma();

        Intent intent= new Intent(getApplicationContext(),ActivityResultado.class);

        sum.setNum1(Integer.valueOf(numero1.getText().toString()));
        sum.setNum2(Integer.valueOf(numero2.getText().toString()));
        sum.setResultado(sum.getNum1()+sum.getNum2());

        //int num1 = Integer.valueOf(numero1.getText().toString());
        //int num2 = Integer.valueOf(numero2.getText().toString());
        //int resul = num1+num2;

        //intent.putExtra("resultado",resul+"");
        intent.putExtra("resultado","La suma es: "+sum.getResultado());
        startActivity(intent);

    }

    private void limpiar() {
        numero1.setText("");
        numero2.setText("");
    }

}