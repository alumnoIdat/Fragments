package com.example.chango.fragments;

import android.support.v4.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements EnviarMensaje {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarDatos (String mensaje){
        Derecha derecha = (Derecha) getSupportFragmentManager().findFragmentById(R.id.derecha);
        derecha.obtenerDatos(mensaje);
    }

}
