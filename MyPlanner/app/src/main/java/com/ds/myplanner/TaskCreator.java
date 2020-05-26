package com.ds.myplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class TaskCreator extends AppCompatActivity {

    private Spinner spinner;
    private EditText et1, et2, et3;
    private Manager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_creator);
        init();
    }

    private void init(){
        et1 = (EditText)findViewById(R.id.cr_name);
        et2 = (EditText)findViewById(R.id.cr_description);
        et3 = (EditText)findViewById(R.id.cr_date);
        spinner = (Spinner)findViewById(R.id.spinner);

        String [] options = {"HIGH", "MEDIUM", "LOW"};

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, options);
        spinner.setAdapter(adapter);

        receive();
    }

    private void receive(){
        Bundle objRecibido = getIntent().getExtras();
        this.manager = null;
        if(objRecibido != null){
            this.manager = (Manager)objRecibido.getSerializable("manager");
        }
    }


    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }

    public void create (View view){
        if(isEmpty(et1) || isEmpty(et2) || isEmpty(et3)){
            Toast.makeText(this, "Debes ingresar datos válidos", Toast.LENGTH_LONG).show();
        }else {
            manager.createTask(view, et1, et2, et3, spinner);
        }
    }
}
