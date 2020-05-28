package com.ds.myplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TaskViewer extends AppCompatActivity {

    private TextView tv_name, tv_description, tv_date, tv_priority;
    private ListView lv;

    private ArrayList<String> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_viewer);
        init();
    }

    private void init(){
        tv_name = (TextView) findViewById(R.id.tv_name);
        tv_description = (TextView) findViewById(R.id.tv_description);
        tv_date = (TextView) findViewById(R.id.tv_date);
        tv_priority = (TextView) findViewById(R.id.tv_priority);
        lv = (ListView)findViewById(R.id.list_viewer);
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administration", null, 1);
        SQLiteDatabase database = admin.getWritableDatabase();

        Cursor column = database.rawQuery("select name from tasks", null);

        if(column.moveToFirst()){
            do{
                names.add(column.getString(0));
            }while(column.moveToNext());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item, names);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                searchTask(view, lv.getItemAtPosition(position).toString());
            }
        });
    }

    public void searchTask(View view, String name){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administration", null, 1);
        SQLiteDatabase database = admin.getWritableDatabase();
        if(!name.isEmpty()){
            Cursor row = database.rawQuery("select name, description, date, priority from tasks where name = '" + name + "'", null);

            if(row.moveToFirst()){
                tv_name.setText(row.getString(0));
                tv_description.setText(row.getString(1));
                tv_date.setText(row.getString(2));
                tv_priority.setText(row.getString(3));
                database.close();
            }else{
                Toast.makeText(this,"No existe ninguna tarea con ese nombre", Toast.LENGTH_SHORT).show();
                database.close();
            }
        }
    }
}
