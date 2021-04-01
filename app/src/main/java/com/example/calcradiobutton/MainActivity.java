package com.example.calcradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ed1, ed2;
    private TextView tv1;
    private RadioButton rb1, rb2, rb3, rb4;

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
        Toast.makeText(this, "Calculadora con las 4 operaciones basicas",Toast.LENGTH_SHORT).show();
    }
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
            Toast.makeText(this,"dividiendo...", Toast.LENGTH_SHORT).show();
            double div = num1 / num2;
            String divis = String.valueOf(div);
            tv1.setText("la division es: " + divis);
        }
    }

}