package com.ds.myplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TaskManager extends AppCompatActivity {
    private Manager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_manager);
        init();
    }

    private void init(){
        Bundle objRecibido = getIntent().getExtras();
        this.manager = null;
        if(objRecibido != null){
            this.manager = (Manager)objRecibido.getSerializable("manager");
        }
    }

    public void goToTaskCreator(View view){
        Intent goToTaskCr = new Intent (this, TaskCreator.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("manager", manager);
        goToTaskCr.putExtras(bundle);
        startActivity(goToTaskCr);
    }
}
