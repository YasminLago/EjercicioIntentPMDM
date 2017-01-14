package com.example.yasmin.intent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import static android.app.Activity.RESULT_OK;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment{

    Comunicador comunicador;

    /**
     * Se crea la interfaz que conectará los dos fragments
     */
    public interface Comunicador{
        public void mensaje(String texto);
    }

    /**
     * Conecta el fragmento con la actividad
     * @param contexto
     */
    public void onAttach(Context contexto){
        super.onAttach(contexto);
        comunicador = (Comunicador)contexto;
    }


    Button btnHi;
    View fragmentoPrincipal;
    TextView textoRecibido;
    final static String FRASE = "Hi world!";
    final static int MENSAJE = 1; //Identifica la petición realizada

    public MainActivityFragment(){
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragmentoPrincipal = inflater.inflate(R.layout.fragment_main, container, false);
        textoRecibido = (TextView) fragmentoPrincipal.findViewById(R.id.textoRecibido);
        btnHi = (Button) fragmentoPrincipal.findViewById(R.id.btnHi);
        btnHi.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // Devuelve true si la propiedad existe y es igual a true.
                // Por lo tanto, se indica que si la pantalla está en modo landscape
                // se ejecutará el codigo contenido en el if
                if(getResources().getBoolean(R.bool.modoDosPantallas)){
                    //Toast toast = Toast.makeText(getActivity(),"Estoy en Landscape", Toast.LENGTH_SHORT);
                    //toast.show();
                    comunicador.mensaje("Adiós mundo");

                }else {
                   // Intent intentPrincipal = new Intent(getActivity(), SecondActivity.class);
                   // startActivity(intentPrincipal);
                        Intent intentPrincipal = new Intent(getActivity(),SecondActivity.class); //Se crea el intent que llamará a la segunda actividad
                        intentPrincipal.putExtra(MainActivityFragment.FRASE, "Adiós mundo"); // Se envía el mensaje que aparecerá en el TextView
                        startActivityForResult(intentPrincipal, MENSAJE); //Se llama a la segunda actividad esperando un resultado


                }
            }
        });
        return fragmentoPrincipal;
    }

    /**
     * Permite usar los datos obtenidos de la actividad que ha sido llamada (SecondActivity)
     * @param requestCode Indentifica que Activity está proporcionando los resultados
     * @param resultCode Valor retornado por la Activity que ha sido llamada (SecondActivity)
     * @param data Retorna datos a la Activity que ha realizado la llamada (MAinActivityFragment)
     */
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == MENSAJE && resultCode == RESULT_OK){
            //String resultado = String.valueOf(RESULT_OK);
            String textoDevuelto = data.getStringExtra("TEXTO");
            //Log.d("blblabla","TEXTO SALIDA"+ "MENSAJE"+ MENSAJE + "requestCode"+requestCode);
            textoRecibido.setText(textoDevuelto);


        }
    }










    }
