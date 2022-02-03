package com.rushikeshnarkhede.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    String arr[]={"C","c++","Data Structure","java","python","kotlin","C#.net","DBMS","RDBMS","Networking","cloud computing","Ruby","golang","anguler","React"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        listview=findViewById(R.id.listview);
        // listview Using Built in Array Adapater

        ArrayAdapter ad =new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,arr);
        listview.setAdapter(ad);


        // Listener on ArrayAdapter Listview
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String txt=((TextView)view).getText().toString();
                Toast.makeText(MainActivity.this, "You Clicked on: " + txt, Toast.LENGTH_SHORT).show();
            }
        });

    }
}