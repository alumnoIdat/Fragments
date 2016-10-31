package com.example.chango.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;
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

public class Izquierda extends Fragment {

    private View rootView;
    private Button boton;
    private EditText campo;

    private EnviarMensaje EM;

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        rootView= inflater.inflate (R.layout.izquierda, container, false);
        campo = (EditText) rootView.findViewById(R.id.campotxt);
        boton= (Button) rootView.findViewById(R.id.button2);
        return rootView;
    }

    public void onClick(View view){
        String mensaje;
        mensaje = campo.getText().toString();
        EM.enviarDatos(mensaje);
    }

    public void onAttach(Activity activity){
        super.onAttach(activity);
        try{
            EM = (EnviarMensaje) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException ("Necesitas implementar mensaje");
        }
    }

}
