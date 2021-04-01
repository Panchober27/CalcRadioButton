package com.example.calcradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * App de 1 activity que realiza las 4 operaciones basicas matematicas a dos valores.
 *  3 metodos ->  cada uno de estos metodos trabaja con distintos componentes de la vista
 *  para probar los distintos metodos => cambiar el metodo que activa el botton
 *  desde la vista design o en el archivo main.xml el atributo: android:onClick=?
 */

public class MainActivity extends AppCompatActivity {

    private EditText ed1, ed2;
    private TextView tv1;
    private RadioButton rb1, rb2, rb3, rb4;
    private CheckBox chk1, chk2;
    private Spinner spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // parto yo
        ed1 = (EditText)findViewById(R.id.txt_num1);
        ed2 = (EditText)findViewById(R.id.txt_num2);
        tv1 = (TextView)findViewById(R.id.txt_result);
        rb1 = (RadioButton)findViewById(R.id.rb_sumar);
        rb2 = (RadioButton)findViewById(R.id.rb_restar);
        rb3 = (RadioButton)findViewById(R.id.rb_multiplicar);
        rb4 = (RadioButton)findViewById(R.id.rb_dividir);
        chk1 = (CheckBox)findViewById(R.id.chk_sum);
        chk2 = (CheckBox)findViewById(R.id.chk_resta);
        spinner1 = (Spinner)findViewById(R.id.spinner);
        String[] opciones = {"Sumar","Restar","Multiplicar","Dividir"};
        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opciones);
        spinner1.setAdapter(arrayAdapter);
        Toast.makeText(this, "Calculadora con las 4 operaciones basicas",Toast.LENGTH_SHORT).show();
    }

    /**
    public void calcular(View view){
        String v1 = ed1.getText().toString();
        String v2 = ed2.getText().toString();
        int num1 = Integer.parseInt(v1);
        int num2 = Integer.parseInt(v2);
        if(rb1.isChecked() == true){
            Toast.makeText(this,"sumando...", Toast.LENGTH_SHORT).show();
            int suma = num1 + num2;
            String result = String.valueOf(suma);
            tv1.setText("La suma es: " + result);
        } else if(rb2.isChecked() == true){
            Toast.makeText(this,"restando...", Toast.LENGTH_SHORT).show();
            int resta = num1 - num2;
            String result = String.valueOf(resta);
            tv1.setText("La resta es: " + result);
        } else if(rb3.isChecked() == true){
            Toast.makeText(this,"multiplicando...", Toast.LENGTH_SHORT).show();
            int mult = num1 * num2;
            String multi = String.valueOf(mult);
            tv1.setText("la multiplicacion es: " + multi);
        } else if(rb4.isChecked() == true){
            if(num2 <= 0){
                Toast.makeText(this,"El segundo valor no puede ser cero!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this,"dividiendo...", Toast.LENGTH_SHORT).show();
                double div = num1 / num2;
                String divis = String.valueOf(div);
                tv1.setText("la division es: " + divis);
            }
        }
    }
     **/

    /**
     * Metodo para usar los checlbox (seleccionando 2 a la vez.)
     * @param

    //public void calculos2(View view){
        // Recibo y transformo los valores ingresados.
        String v1 = ed1.getText().toString();
        String v2 = ed2.getText().toString();
        int num1 = Integer.parseInt(v1);
        int num2 = Integer.parseInt(v2);

        if(chk1.isChecked() == true && chk2.isChecked() == false){
            // Suma y msje
            int sum = num1 + num2;
            String res = String.valueOf(sum);
            tv1.setText("La suma es: " + res + " /");
        } else if(chk1.isChecked() == false && chk2.isChecked() == true){
            // Restar y msje
            int rest = num1 - num2;
            String res = String.valueOf(rest);
            tv1.setText("La resta es: " + res + " /");
        } else if(chk1.isChecked() == false && chk2.isChecked() == false){
            Toast.makeText(this, "No seleccionaste que hacer pavaroti",Toast.LENGTH_SHORT).show();
        } else if(chk1.isChecked() == true && chk2.isChecked() == true){
            int suma = num1 + num2;
            int resta = num1 - num2;
            String result1 = String.valueOf(suma);
            String result2 = String.valueOf(resta);
            tv1.setText("Suma: " + result1 + " / Resta: " + result2);
        }



    }
    **/

    /**
     * Metodo para usar la logica del spinner.
     * @param
     */
    public void calcSpinner(View view){
        String v1 = ed1.getText().toString();
        String v2 = ed2.getText().toString();
        int n1 = Integer.parseInt(v1);
        int n2 = Integer.parseInt(v2);
        String spinSelectedItem = spinner1.getSelectedItem().toString();

        if(spinSelectedItem.equals("Sumar")){
            int op = n1 + n2;
            String resp = String.valueOf(op);
            tv1.setText("Suma: " + resp);
        } else if(spinSelectedItem.equals("Restar")){
            int op = n1 - n2;
            String resp = String.valueOf(op);
            tv1.setText("Resta: " + resp);
        } else if(spinSelectedItem.equals("Multiplicar")){
            int op = n1 * n2;
            String resp = String.valueOf(op);
            tv1.setText("Multiplicación: " + resp);
        } else if(spinSelectedItem.equals("Dividir")){
            if(n2 == 0){
                Toast.makeText(this,"No se puede dividir por 0!",Toast.LENGTH_SHORT).show();
            } else {
                int op = n1 / n2;
                String resp = String.valueOf(op);
                tv1.setText("División: " + resp);
            }

        }

    }



}