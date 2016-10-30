package com.example.chango.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Chango on 30/10/2016.
 */

public class Derecha {
    private View rootView;
    private TextView txt;

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate (R.layout.derecha, container, false);
        txt = (TextView) rootView.findViewById(R.id.txt);
        return rootView;
    }
    public void obtenerDatos(String mensaje){
        txt.setText(mensaje);
    }

}
