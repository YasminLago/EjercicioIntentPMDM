package com.example.yasmin.intent;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A placeholder fragment containing a simple view.
 */
public class SecondActivityFragment extends Fragment {

    TextView texto;
    View fragmentoSecundario;

    public SecondActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentoSecundario = inflater.inflate(R.layout.fragment_second, container,false);
        texto = (TextView) fragmentoSecundario.findViewById(R.id.text);
        return fragmentoSecundario;
    }

    /**
     * Recibe el texto que debe aparecer en el TextView y lo muestra en él
     * @param text
     */
    public void cambiarTexto(String text){
        texto.setText(text);
    }

}

