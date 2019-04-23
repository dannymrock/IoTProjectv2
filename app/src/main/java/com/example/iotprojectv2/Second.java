package com.example.iotprojectv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void CreateRoute (View view){
        Intent createRoute = new Intent(Second.this,CreacionRuta.class);
        startActivity(createRoute);
    }

    public void RouteSelection (View view){
        Intent routeSelection = new Intent(Second.this,SeleccionRuta.class);
        startActivity(routeSelection);
    }

}
