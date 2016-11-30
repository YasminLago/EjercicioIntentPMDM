package com.example.yasmin.intent;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    Button btnHi;
    View fragmentoPrincipal;
    final static String FRASE = "Hi world!";

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        fragmentoPrincipal = inflater.inflate(R.layout.fragment_main, container, false);

        btnHi = (Button) fragmentoPrincipal.findViewById(R.id.btnHi);
        btnHi.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(getResources().getBoolean(R.bool.modoDosPantallas)){
                    //Toast toast = Toast.makeText(getActivity(),"Estoy en Landscape", Toast.LENGTH_SHORT);
                    //toast.show();
                    Intent intentSecundario = new Intent(getActivity(),SecondActivityFragment.class);
                    intentSecundario.putExtra(FRASE, "¿Qué tal mundo?");
                    startActivity(intentSecundario);

                }else {
                    Intent intentPrincipal = new Intent(getActivity(), SecondActivity.class);
                    startActivity(intentPrincipal);

                }
            }
        });
        return fragmentoPrincipal;
    }



    }
