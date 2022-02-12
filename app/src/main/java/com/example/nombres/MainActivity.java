package com.example.nombres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        EditText nombre,apellido,edad,correo;
        TextView d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=(EditText)findViewById(R.id.txtnom);
        apellido=(EditText) findViewById(R.id.txtapellido);
        edad=(EditText)findViewById(R.id.txtedad);
        correo=(EditText)findViewById(R.id.txtcorreo);

    }

    public void enviar(View view){
        String nom=nombre.getText().toString();
        String ape=apellido.getText().toString();
        String ed=edad.getText().toString();
        String email=correo.getText().toString();

        if(!nom.isEmpty() && !ape.isEmpty() && !ed.isEmpty() && !email.isEmpty())
        {
            Intent datos=new Intent(this,Datos.class);
            datos.putExtra("archivos",nom);
            datos.putExtra("a",ape);
            datos.putExtra("e",ed);
            datos.putExtra("i",email);
            startActivity(datos);


        }else{
            Toast.makeText(this, "Llenar los campos vacios", Toast.LENGTH_SHORT).show();
        }

    }
}