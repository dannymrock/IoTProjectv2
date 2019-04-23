package com.example.iotprojectv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SeleccionRuta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_ruta);
    }

    public void RouteDeveloping (View view){
        Intent routeDeveloping = new Intent(SeleccionRuta.this,DesarrolloRuta.class);
        startActivity(routeDeveloping);
    }
}
