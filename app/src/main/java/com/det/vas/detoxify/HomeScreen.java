package com.det.vas.detoxify;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import single.CustomDrawerAdapter;

public class HomeScreen extends Activity {

    String[] name_list = {"Profile","Blogs","Diet", "PHR", "Near By", "Consult"};
    Integer[] image_list = {R.drawable.eye, R.drawable.eye, R.drawable.eye, R.drawable.eye, R.drawable.eye, R.drawable.eye};
    ListView dra_list;
    //CustomDrawerAdapter custom;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        dra_list = (ListView) findViewById(R.id.left_drawer);

        LayoutInflater inflater = getLayoutInflater();
        ViewGroup header = (ViewGroup) inflater.inflate(R.layout.dra_header, dra_list,
                false);

        dra_list.addHeaderView(header, null, false);

       // custom = new CustomDrawerAdapter(HomeScreen.this, name_list, image_list);
        //dra_list.setAdapter(custom);

    }
}
