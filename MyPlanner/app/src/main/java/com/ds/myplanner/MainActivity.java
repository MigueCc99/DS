package com.ds.myplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Manager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init (){
        this.manager = new Manager();
    }

    public void goToTaskManager(View view){
        Intent goToTaskMg = new Intent (this, TaskManager.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("manager", manager);
        goToTaskMg.putExtras(bundle);
        startActivity(goToTaskMg);
    }
}
