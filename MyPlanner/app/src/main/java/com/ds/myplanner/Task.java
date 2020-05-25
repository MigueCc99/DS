package com.ds.myplanner;

import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Date;

public class Task {
    private String name;
    private String description;
    private Date date;
    private Priority priority;

    Task (){
        this.name = new String();
        this.description = new String();
        this.date = new Date();
        this.priority = Priority.LOW;
    }

    Task (String name, String description, Date date, Priority priority){
        this.name = name;
        this.description = description;
        this.date = date;
        this.priority = priority;
    }

    public static Task createTask (View view, EditText name, EditText description, EditText date, Spinner priority){
        String name_String = name.getText().toString();
        String description_String = description.getText().toString();
        String selection = priority.getSelectedItem().toString();
        Date d = new Date();
        Priority prio;

        if(selection.equals("HIGH")){
            prio = Priority.HIGH;
        }
        else if(selection.equals("MEDIUM")){
            prio = Priority.MEDIUM;
        }
        else{
            prio = Priority.LOW;
        }

        Task task = new Task(name_String, description_String, d, prio);

        return task;
    }

    public void printTask (){
        System.out.println("Name: " + name + " Description:" + description + " Date:" + date.toString() + " Priority:" + priority.toString());
    }




}
