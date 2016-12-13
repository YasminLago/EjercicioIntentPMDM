package com.example.yasmin.intent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment{

    Comunicador comunicador;

    public interface Comunicador{
        public void mensaje(String texto);
    }

    public void onAttach(Context contexto){
        super.onAttach(contexto);
        comunicador = (Comunicador)contexto;
    }


    Button btnHi;
    View fragmentoPrincipal;
    final static String FRASE = "Hi world!";

    public MainActivityFragment(){
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
                    comunicador.mensaje("Adiós mundo");

                }else {
                   // Intent intentPrincipal = new Intent(getActivity(), SecondActivity.class);
                   // startActivity(intentPrincipal);
                    Intent intentPrincipal = new Intent(getActivity(),SecondActivity.class);
                    intentPrincipal.putExtra(MainActivityFragment.FRASE, "Adiós mundo");
                    startActivity(intentPrincipal);
                }
            }
        });
        return fragmentoPrincipal;
    }












}
