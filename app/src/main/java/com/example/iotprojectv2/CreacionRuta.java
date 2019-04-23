package com.example.iotprojectv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CreacionRuta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creacion_ruta);
    }

    public void StartSecond (View view){
        Intent startSecond = new Intent(CreacionRuta.this,Second.class);
        startActivity(startSecond);
    }
}
