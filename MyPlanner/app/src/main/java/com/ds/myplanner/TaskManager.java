package com.ds.myplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Date;

public class TaskManager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_manager);
    }

    public void goToTaskCreator(View view){
        Intent goToTaskCr = new Intent (this, TaskCreator.class);
        startActivity(goToTaskCr);
    }
}
