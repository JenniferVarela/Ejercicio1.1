package com.example.operacionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {

    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        resultado = (TextView) findViewById(R.id.txtResultadoR);

        String resultadoDiv = getIntent().getStringExtra("resultadodiv");
        String resultadoMul = getIntent().getStringExtra("resultadoMulti");
        String resultadoRes = getIntent().getStringExtra("resultadoresta");
        String resultados = getIntent().getStringExtra("resultadosuma");


        resultado.setText("La division es: " + resultadoDiv);
        resultado.setText("La multiplicacion es: "+ resultadoMul);
        resultado.setText("La resta es: " + resultadoRes);
        resultado.setText("La suma es: " + resultados);

        //System.out.println();

    }
}