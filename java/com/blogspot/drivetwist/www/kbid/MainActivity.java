package com.blogspot.drivetwist.www.kbid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;

import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener ,View.OnClickListener{

    //TextView tv;
    BlankFragment score;
    CoreFragment core;
    Button b_left,b_right,b_all;
    private String[] mNavigationDrawerItemTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    Toolbar toolbar;
    private CharSequence mDrawerTitle;
    private CharSequence mTitle;
    android.support.v7.app.ActionBarDrawerToggle mDrawerToggle;
    ListView list;
    private ArrayList<String> users=new ArrayList<>();

    String[] web = {
            "UP Yoddha struggle at home,go down 29-36 against Haryana ",
            "Telugu Titans fightback,beat U Mumba 37-32",
            "Raina's,wife Priyanka cheer for UP Yoddha",
            "Pink Panthers Edge Bulls 30-28",
            "UMumba Beat UP Yoddha 37-34",
            "Gujarat Fortunegiants Hold Bengal Warriors to a Tie",
            "Dabang Beat Thalaivas"
    } ;
    Integer[] imageId = {
            R.drawable.news1,
            R.drawable.news2,
            R.drawable.news3,
            R.drawable.news4,
            R.drawable.news5,
            R.drawable.news6,
            R.drawable.news7

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //INIT COMPONENTS
        //tv = (TextView)findViewById(R.id.textView);
        //tv.setText("");
        b_left = (Button)findViewById(R.id.button);
        b_right = (Button)findViewById(R.id.button2);
        b_all = (Button)findViewById(R.id.button3);
        b_left.setOnClickListener(this);
        b_right.setOnClickListener(this);
        b_all.setOnClickListener(this);


        //INIT NAVIGATIONS
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        NavigationView navigationViewRight = (NavigationView) findViewById(R.id.nav_view_right);
        navigationViewRight.setNavigationItemSelectedListener(this);
        CustomList adapter = new
                CustomList(MainActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });
        score = new BlankFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragmentscore, score).commit();

    }

    @Override
    public void onBackPressed() {
        //CLOSE DRAWER IF IS VISIBLE
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if(!drawer.isDrawerOpen(GravityCompat.START) && !drawer.isDrawerOpen(GravityCompat.END)) {
            super.onBackPressed();
        }
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        if (drawer.isDrawerOpen(GravityCompat.END)){
            drawer.closeDrawer(GravityCompat.END);
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
            //tv.setText("IMPORT ACTIVITY");
            Intent t=new Intent(this,Team.class);
            startActivity(t);
            Toast.makeText(this,"Team",Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_gallery) {
            Intent s=new Intent(this,Schedule.class);
            startActivity(s);
            //tv.setText("Schedule");
            Toast.makeText(this,"SCHEDULE ACTIVITY",Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_slideshow) {
            Intent pt=new Intent(this,PointsTable.class);
            startActivity(pt);
            //tv.setText("PointsTable");
            Toast.makeText(this,"Pointstable ACTIVITY",Toast.LENGTH_LONG).show();
        }
         else if (id == R.id.nav_share) {
            //tv.setText("SHARE ACTIVITY");
            Toast.makeText(this,"SHARE ACTIVITY",Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_send) {
            //tv.setText("SEND ACTIVITY");
            Toast.makeText(this,"SEND ACTIVITY",Toast.LENGTH_LONG).show();
        } else if (id==R.id.nav_Food){
            //tv.setText("Food");
            Intent fo=new Intent(this,FoodOrder.class);
            startActivity(fo);
            Toast.makeText(this,"Food Activity",Toast.LENGTH_LONG).show();
        }
        else if (id == R.id.nav_taxi) {
            Intent bt=new Intent(this,BookTaxi.class);
            startActivity(bt);
            //tv.setText("Book A Taxi");
            Toast.makeText(this,"Book Taxi",Toast.LENGTH_LONG).show();
        }else if (id==R.id.nav_login){
            Intent lo=new Intent(this,LoginActivity.class);
            startActivity(lo);
            //tv.setText("Login");
            Toast.makeText(this,"Login",Toast.LENGTH_LONG).show();
        }

        //CLOSE ALL DRAWER
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        DrawerLayout drawer_right = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer_right.closeDrawer(GravityCompat.END);
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button:
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.openDrawer(GravityCompat.START);
                break;
            case R.id.button2:
                DrawerLayout drawer2 = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer2.openDrawer(GravityCompat.END);
                break;
            case R.id.button3:
                drawer2 = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer2.openDrawer(GravityCompat.END);
                drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.openDrawer(GravityCompat.START);
                break;
        }


    }
    public void schdle(View view){
        Intent sd=new Intent(this,Schedule.class);
        startActivity(sd);
    }
    public void strtfrag(View view){
        ImageButton i=(ImageButton)findViewById(R.id.topb);
        i.setImageResource(R.drawable.topcnclbtn);
        core = new CoreFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragmentscore,core).commit();
    }
    public void navdrwer(View niew){
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.openDrawer(GravityCompat.START);

    }
}
