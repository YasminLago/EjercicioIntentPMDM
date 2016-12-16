package com.example.yasmin.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView texto;
    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
                Intent intent = getIntent(); //Se recoge el intent creado en el fragmento principal
                nombre = intent.getStringExtra(MainActivityFragment.FRASE); // Se guarda el mensaje en un String
                texto = (TextView) findViewById(R.id.text);
                texto.setText(nombre); //Se envía el mensaje al TextView
    }
}
