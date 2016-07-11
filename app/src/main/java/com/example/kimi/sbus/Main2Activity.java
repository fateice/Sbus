package com.example.kimi.sbus;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView _listv = (ListView) findViewById(R.id.list2);
        List<String> _data = new ArrayList<String>();

        SimpleAdapter adapter = new SimpleAdapter(this,getData(),R.layout.row,
                new String[]{"text3","text4","text5"},
                new int[]{R.id.textView3,R.id.textView4,R.id.textView5});
        _listv.setAdapter(adapter);

        _listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                adapterView.getChildAt(i);
                Toast.makeText(Main2Activity.this, String.valueOf(i), Toast.LENGTH_SHORT).show();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("text3", "G1");
        map.put("text4", "google 1");
        map.put("text5", "2");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("text3", "");
        map.put("text4", "google 2");
        map.put("text5", "2");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("text3", "G3");
        map.put("text4", "google 3");
        map.put("text5", "3");
        list.add(map);

        return list;
    }


}
