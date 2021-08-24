package com.gavilan.actividad1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int contador = 0;
    private TextView txt_contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_contador = findViewById(R.id.txt_contador);
        // Alternativas de conversión de int a str
        //txt_contador.setText(contador+"");

        txt_contador.setText( String.valueOf(contador) );

    }

    public void MostrarTostada(View vista){
        Toast.makeText(MainActivity.this,
                "Presionaste el botón superior",
                Toast.LENGTH_LONG).show();
    }

    public void AumentarContador(View vista){

        // Aumenten la variable
        contador ++;
        // contador = contador + 1;

        // apliquen la variable al textview
        txt_contador.setText( String.valueOf(contador) );

        //txt_contador.setText(String.valueOf(++contador));
    }
}