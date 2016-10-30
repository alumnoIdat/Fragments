package com.example.chango.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Chango on 30/10/2016.
 */

public class Izquierda {

    private View rootView;
    private Button boton;
    private EditText campo;

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        rootView= inflater.inflate (R.layout.izquierda, container, false);
        campo = (EditText) rootView.findViewById(R.id.campotxt);
        boton= (Button) rootView.findViewById(R.id.button2);
        return rootView;
    }
}
