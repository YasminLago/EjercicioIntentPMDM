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
    View fragmentoSecundario;
    boolean tipoPantalla;

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
                if(fragmentoPrincipal.findViewById(R.id.fragment)==null){
                    Intent intentPrincipal = new Intent(getActivity(), SecondActivity.class);
                    startActivity(intentPrincipal);
                }
                if(fragmentoPrincipal.findViewById(R.id.fragmentLand)==null) {

                    Toast toast = Toast.makeText(getApplicationContext(), "Abre una ventana", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        return fragmentoPrincipal;
    }



    }
