package com.blogspot.drivetwist.www.kbid;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Bundle ScheduleData=getIntent().getExtras();
        ArrayList<String> places= ScheduleData.getStringArrayList("PlacesDetails");
        ListAdapter adapter=new CustomAdapter(this,places);
        ListView List_View=(ListView)findViewById(R.id.List_View);
        List_View.setAdapter(adapter);
    }
}
