package com.ds.myplanner;

import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import java.io.Serializable;
import java.util.ArrayList;

public class Manager implements Serializable {
    private ArrayList<Task> tasks;

    public Manager (){
        this.tasks = new ArrayList<Task>();
    }

    public void createTask (View view, EditText name, EditText description, EditText date, Spinner priority){
        Task t = Task.createTask(view, name, description, date, priority);
        addTask(t);
        t.printTask();
    }

    public void addTask (Task t){
        this.tasks.add(t);
    }

    public void deleteTask(Task t){
        this.tasks.remove(t);
    }
}