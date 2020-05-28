package com.ds.myplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class TaskManager extends AppCompatActivity {

    private EditText et_name, et_description, et_date;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_manager);
        init();
    }

    private void init (){
        et_name = (EditText)findViewById(R.id.cr_name);
        et_description = (EditText)findViewById(R.id.cr_description);
        et_date = (EditText)findViewById(R.id.cr_date);
        spinner = (Spinner)findViewById(R.id.spinner);

        String [] options = {"HIGH", "MEDIUM", "LOW"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, options
        );
        spinner.setAdapter(adapter);
    }

    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }

    public void create(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administration", null, 1);
        SQLiteDatabase database = admin.getWritableDatabase();

        if(!isEmpty(et_name) && !isEmpty(et_description) && !isEmpty(et_date)){
            Task t = Task.createTask(view, et_name, et_description, et_date, spinner);
            System.out.println(t.getName());

            ContentValues register = new ContentValues();

            register.put("name", t.getName());
            register.put("description", t.getDescription());
            register.put("date", t.getDate());
            register.put("priority", t.getPriority().toString());

            database.insert("tasks", null, register);

            database.close();
            et_name.setText("");
            et_description.setText("");
            et_date.setText("");

            Toast.makeText(this,"Tarea registrada exitosamente", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Debes completar toda la información", Toast.LENGTH_SHORT).show();
        }
    }

    public void search(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administration", null, 1);
        SQLiteDatabase database = admin.getWritableDatabase();

        String name = et_name.getText().toString();

        if(!isEmpty(et_name)){
            Cursor row = database.rawQuery("select description, date from tasks where name = '" + name + "'", null);

            if(row.moveToFirst()){
                et_description.setText(row.getString(0));
                et_date.setText(row.getString(1));
                database.close();
            }else{
                Toast.makeText(this,"No existe ninguna tarea con ese nombre", Toast.LENGTH_SHORT).show();
                database.close();
            }
        }else{
            Toast.makeText(this,"Debes introducir el nombre de la tarea", Toast.LENGTH_SHORT).show();
        }
    }

    public void delete(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administration", null, 1);
        SQLiteDatabase database = admin.getWritableDatabase();

        String name = et_name.getText().toString();

        if(!isEmpty(et_date)){
            int output = database.delete("tasks", "name = '" + name + "'", null);
            database.close();

            et_name.setText("");
            et_description.setText("");
            et_date.setText("");

            if(output == 1){
                Toast.makeText(this,"Tarea eliminada exitosamente", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this,"La tarea no existe", Toast.LENGTH_SHORT).show();
            }


        }else{
            Toast.makeText(this,"Debes introducir el nombre de la tarea", Toast.LENGTH_SHORT).show();
        }

    }
    public void modify(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administration", null, 1);
        SQLiteDatabase database = admin.getWritableDatabase();

        String name = et_name.getText().toString();
        String description = et_description.getText().toString();
        String date = et_date.getText().toString();
        String priority = spinner.getSelectedItem().toString();

        if(!name.isEmpty() && !description.isEmpty() && !date.isEmpty() && !priority.isEmpty()){
            ContentValues register = new ContentValues();
            register.put("name", name);
            register.put("description", description);
            register.put("date", date);
            register.put("priority", date);

            int output = (int) database.update("tasks", register, "name = '" + name + "'", null);
            database.close();

            if(output == 1){
                Toast.makeText(this,"Tarea modificada exitosamente", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this,"La tarea no existe", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this,"Debes introducir el nombre de la tarea", Toast.LENGTH_SHORT).show();
        }
    }
}
