package com.ds.myplanner;

import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

/*
    Class: Task.
    Description: Representa el tipo de dato Tarea.
    Author: Miguel Ángel Campos Cubillas
 */

public class Task {
    private String name;
    private String description;
    private String date;
    private Priority priority;

    Task (){
        this.name = new String();
        this.description = new String();
        this.date = new String();
        this.priority = Priority.LOW;
    }

    Task (String name, String description, String date, Priority priority){
        super();
        this.name = name;
        this.description = description;
        this.date = date;

        this.priority = priority;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public String getDate(){
        return this.date;
    }

    public Priority getPriority(){
        return this.priority;
    }

    public static Task createTask (View view, EditText name, EditText description, EditText date, Spinner priority){
        String name_String = name.getText().toString();
        String description_String = description.getText().toString();
        String date_String = date.getText().toString();
        String selection = priority.getSelectedItem().toString();
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

        Task task = new Task(name_String, description_String, date_String, prio);

        return task;
    }

    public void printTask (){
        System.out.println("Name:" + name + " Description:" + description + " Date:" + date + " Priority:" + priority.toString());
    }


}
