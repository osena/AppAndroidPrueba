package com.example.osena.appandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static com.example.osena.appandroid.R.id.list_item_component;

public class MainActivityPrueba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.pruebalist);
        ListView listView = (ListView) findViewById(list_item_component);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(Integer.toString(i + 1));        }
        listView.setAdapter(new ArrayAdapter<>(this, R.layout.textprueba, list));

    }
}
