package com.example.yasmin.intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements MainActivityFragment.Comunicador{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void mensaje(String texto) {
            SecondActivityFragment secondFragment = (SecondActivityFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentLand);
            if(secondFragment != null) {
                secondFragment.cambiarTexto(texto);
            }
    }

}



