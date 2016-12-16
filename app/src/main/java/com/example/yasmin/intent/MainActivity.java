package com.example.yasmin.intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements MainActivityFragment.Comunicador{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Recibe el texto que debe aparecer en el TextView del segundo fragment
     * y se lo envía al método que mostrará dicho mensaje
     * @param texto
     */
    @Override
    public void mensaje(String texto) {
            //FragmentManager: clase que permite interactuar con un Fragment dentro de una Activity.
            SecondActivityFragment secondFragment = (SecondActivityFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentLand);
            if(secondFragment != null) { //Si el fragmento secundario es distinto de null (existe) se ejecutará el método que muestra el mensaje en el TextView
                secondFragment.cambiarTexto(texto);
            }
    }

}



