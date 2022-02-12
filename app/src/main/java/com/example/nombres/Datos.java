package com.example.nombres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Datos extends AppCompatActivity {
    EditText nomb,apelli,edad,correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        nomb=(EditText) findViewById(R.id.rnom);
        apelli=(EditText) findViewById(R.id.rape);
        edad=(EditText) findViewById(R.id.redad);
        correo=(EditText) findViewById(R.id.rcorreo);

        String dato=getIntent().getStringExtra("archivos");
        nomb.setText("Nombre:"+dato);
        String a=getIntent().getStringExtra("a");
        apelli.setText("Apellido:"+a);
        String e=getIntent().getStringExtra("e");
        edad.setText("Edad:"+e);
        String i=getIntent().getStringExtra("i");
        correo.setText("Correo:"+i);

    }

    public void regresar (View view)
    {
        Intent x =new Intent(this,MainActivity.class);
        startActivity(x);
    }
}