package com.example.kimi.sbus;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView _listv = (ListView) findViewById(R.id.list);
        List<String> _data = new ArrayList<String>();
        _data.add("ch1");
        _data.add("ch2");
        _data.add("ch3");
        _data.add("ch4");

        ssave();

        ArrayAdapter<String> _adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,_data);
        _listv.setAdapter(_adapter);

        _listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                adapterView.getChildAt(i);
                Toast.makeText(MainActivity.this, String.valueOf(i), Toast.LENGTH_SHORT).show();
                if (i==0)
                {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
                }
                if(i==1)
                {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,Main3Activity.class);
                    startActivity(intent);
                }
                if(i==2)
                {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,Main4Activity.class);
                    startActivity(intent);
                }
                if(i==3)
                {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,Main5Activity.class);
                    startActivity(intent);
                }
            }
        });

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//
//            }
//        });
        //FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.club_home_fa_settings);
//        FloatingActionButton linesea = (FloatingActionButton)findViewById(R.id.linesea);
//        linesea.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent();
//                intent.setClass(MainActivity.this,Main5Activity.class);
//                startActivity(intent);
//            }
//        });



    }


    public void ssave(){
        SharedPreferences sharedPreferences = getSharedPreferences("ussss", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Kimi","哈尔滨");
        editor.commit();
    }

    public String sget(String name){
        SharedPreferences sharedPreferences = getSharedPreferences("ussss",Context.MODE_PRIVATE);
        String city = sharedPreferences.getString(name,"");
        return city;
    }

    public void fabline (View view)
    {
        String city="";
        city = sget("Kimi");
        Intent intent = new Intent();
        intent.putExtra("extra",city);
        intent.setClass(MainActivity.this,Main5Activity.class);
        startActivity(intent);
    }


    @Override
    public SharedPreferences getPreferences(int mode) {
        return super.getPreferences(mode);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
