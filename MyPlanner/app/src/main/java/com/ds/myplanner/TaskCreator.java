package com.ds.myplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class TaskCreator extends AppCompatActivity {

    private EditText et1, et2, et3;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_creator);
        init();
    }

    private void init (){
        et1 = (EditText)findViewById(R.id.cr_name);
        et2 = (EditText)findViewById(R.id.cr_description);
        et3 = (EditText)findViewById(R.id.cr_date);
        spinner = (Spinner)findViewById(R.id.spinner);

        String [] options = {"HIGH", "MEDIUM", "LOW"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, options
        );
        spinner.setAdapter(adapter);
    }
    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }

    public void create (View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administration",null,1);
        SQLiteDatabase database = admin.getWritableDatabase();

        if(isEmpty(et1) || isEmpty(et2) || isEmpty(et3)){
            Toast.makeText(this, "Debes ingresar datos válidos", Toast.LENGTH_LONG).show();
        }else {
            Task t = Task.createTask(view,et1,et2,et3,spinner);
            t.printTask();
            ContentValues register = new ContentValues();
            register.put("name", t.getName());
            register.put("description", t.getDescription());
            register.put("date", t.getDate());
            register.put("priority", t.getPriority().toString());
            database.insert("tasks", null, register);
            database.close();
            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_LONG).show();
        }
    }
}
