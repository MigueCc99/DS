package com.ds.myplanner;

import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Date;

public class Manager {
    private ArrayList<Task> tasks;

    public Manager (){
        this.tasks = new ArrayList<Task>();
    }

    public void addTask (Task t){
        this.tasks.add(t);
    }

    public void deleteTask(Task t){
        this.tasks.remove(t);
    }

}