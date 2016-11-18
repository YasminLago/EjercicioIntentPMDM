package com.example.yasmin.intent;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    Button btnHi;
    View fragmentoPricipal;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        fragmentoPricipal = inflater.inflate(R.layout.fragment_main, container, false);

        btnHi = (Button)fragmentoPricipal.findViewById(R.id.btnHi);
        btnHi.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(fragmentoPricipal.findViewById(R.id.fragment)==null){
                    Intent intentPrincipal = new Intent(getActivity(), SecondActivity.class);
                startActivity(intentPrincipal);
                }
                if(fragmentoPricipal.findViewById(R.id.fragmentLand)==null) {
                    Intent intentSecundario = new Intent(getActivity(), SecondActivity.class);
                    startActivity(intentSecundario);
                }
            }
        });
        return fragmentoPricipal;
    }



    }
