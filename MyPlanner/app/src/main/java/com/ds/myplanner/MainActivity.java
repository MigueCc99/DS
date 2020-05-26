package com.ds.myplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/*
    Class: MainActivity.
    Description: Main activity de nuestro programa. Enlazará con el creador de tareas y el manager de las mismas, que interactuará con la BD(database).
    Author: Miguel Ángel Campos Cubillas
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToTaskCreator(View view){
        Intent goToTaskCr = new Intent(this, TaskCreator.class);
        startActivity(goToTaskCr);
    }
/*
    public void goToTaskManager(View view){
        Intent goToTaskMg = new Intent(this, TaskManager.class);
        startActivity(goToTaskMg);
    }
 */
}
