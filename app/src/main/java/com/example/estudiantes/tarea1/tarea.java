package com.example.estudiantes.tarea1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class tarea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea);
    }
    public void sumar (View vista) {
        EditText numeroA1 = (EditText) findViewById(R.id.numeroA);
        EditText numeroB1 = (EditText) findViewById(R.id.numeroB);
        Button suma = (Button) findViewById(R.id.botonSumar);
        TextView resultado = (TextView) findViewById(R.id.mostradorR);
        double n1= Double.parseDouble(numeroA1.getText().toString());
        double n2= Double.parseDouble(numeroB1.getText().toString());

        double r = n1 + n2;
        resultado.setText("" + r);

    }
    public void restar (View vista) {
        EditText numeroA1 = (EditText) findViewById(R.id.numeroA);
        EditText numeroB1 = (EditText) findViewById(R.id.numeroB);
        Button resta = (Button) findViewById(R.id.botonRestar);
        TextView resultado = (TextView) findViewById(R.id.mostradorR);
        double n1= Double.parseDouble(numeroA1.getText().toString());
        double n2= Double.parseDouble(numeroB1.getText().toString());

        double r = n1 - n2;
        resultado.setText("" + r);
    }
    public void convertir (View vista) {
        EditText numeroA1 = (EditText) findViewById(R.id.numeroA);

        Button convertidor = (Button) findViewById(R.id.botonConvertir);
        TextView conversión =(TextView) findViewById(R.id.mostradorC);
        double n1= Double.parseDouble(numeroA1.getText().toString());
        double c = n1 *1.8 +32;
        conversión.setText(""+ c);
     }
}
