package com.blogspot.drivetwist.www.kbid;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.data;

public class Team extends AppCompatActivity {
    ViewPager viewPager;
    int images[] = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4};
    MyCustomPagerAdapter myCustomPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bulls);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        myCustomPagerAdapter = new MyCustomPagerAdapter(Team.this, images);
        viewPager.setAdapter(myCustomPagerAdapter);
        Toast.makeText(Team.this, "Slide images for more", Toast.LENGTH_LONG).show();
    }

    public void hello1(View v){
        Button b1=(Button)findViewById(R.id.ban);
        Button b2=(Button)findViewById(R.id.guj);
        b2.setBackgroundResource(R.drawable.buttonstyle);
        b1.setBackgroundColor(getResources().getColor(R.color.back));
        TextView tv=(TextView)findViewById(R.id.textteam);
        tv.setText("Banguluru Bulls");
        final ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("Rohit Kumar(C)","Raider",R.raw.kumar,"83"));
        words.add(new Word("Ajay Kumar","Raider",R.raw.jay_umar,"32"));
        words.add(new Word("Gurvinder Singh","Raider",R.raw.urvinder,"9"));
        words.add(new Word("Harish Naik","Raider",R.raw.arish_ayak,"6"));
        words.add(new Word("Sinotharan Kanesharajah","Raider",R.raw.sinotharan,"6"));
        words.add(new Word("Rohit","Raider",R.raw.ohit,"0"));
        words.add(new Word("Sumit Singh","Raider",R.raw.sumitsingh,"0"));
        words.add(new Word("Sunil Jaipal","Raider",R.raw.sunil,"0"));
        words.add(new Word("Amit Sheoran","Defender,Left corner",R.raw.smit_heoran,"0"));
        words.add(new Word("Kuldeep Singh","Defender,Left corner",R.raw.uldeep_ingh,"8"));
        words.add(new Word("Sachin Kumar","Defender,Left corner",R.raw.sachinkumar,"8"));
        words.add(new Word("Mahender Singh","Defender,Left cover",R.raw.singh,"20"));
        words.add(new Word("Pardeep Kondola","Defender,Right corner",R.raw.pardeep,"0"));
        words.add(new Word("Ravinder Pahal","Defender,Right corner",R.raw.avinder_ahal,"21"));
        words.add(new Word("Amit","All Rounder",R.raw.mit,"0"));
        words.add(new Word("Ankit Sagwan","All Rounder",R.raw.ankit32,"0"));
        words.add(new Word("Ashish Kumar","All Rounder",R.raw.ashish4,"27"));
        words.add(new Word("Preetam Chhillar","All Rounder",R.raw.preet7,"2"));
        words.add(new Word("Sanjay Shresta","All Rounder",R.raw.sanjay85,"0"));
        WordAdapter adapter = new WordAdapter(this,0, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
    public void hello(View view){
        Button b1=(Button)findViewById(R.id.ban);
        Button b2=(Button)findViewById(R.id.guj);
        b2.setBackgroundColor(getResources().getColor(R.color.back));
        b1.setBackgroundResource(R.drawable.buttonstyle);
        TextView tv=(TextView)findViewById(R.id.textteam);
        tv.setText("Gujarat Fortunegiants");
        final ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("Sukesh Hegde(C)","Raider",R.raw.a1a,"33"));
        words.add(new Word("Amit Rathi","Raider",R.raw.b2b,"0"));
        words.add(new Word("Chandran Ranjit","Raider",R.raw.c3c,"0"));
        words.add(new Word("Mahendra Rajput","Raider",R.raw.d4d,"20"));
        words.add(new Word("Rakesh Narwal","Raider",R.raw.e5e,"5"));
        words.add(new Word("Pawan Kumar","Raider",R.raw.pawan48,"1"));
        words.add(new Word("Sachin","Raider",R.raw.sac45,"60"));
        words.add(new Word("Sultan Dange","Raider",R.raw.f6f,"0"));
        words.add(new Word("Amit","Defender,Right cover",R.raw.ami475,"0"));
        words.add(new Word("Abhozar MOhajer","Defender,Right cover",R.raw.abo001,"26"));
        words.add(new Word("C Kalai Arasan","Defender,Left corner",R.raw.g7g,"0"));
        words.add(new Word("Fazel Atrachali","Defender,Left corner",R.raw.h8h,"0"));
        words.add(new Word("Manoj Kumar","Defender,Left cover",R.raw.i9i,"17"));
        words.add(new Word("Parvesh Bhainswal","Defender,Left cover",R.raw.parves52,"15"));
        words.add(new Word("Sunil Kumar","Defender,Right cover",R.raw.j10j,"15"));
        words.add(new Word("Vikas kale","Defender,Right cover",R.raw.k11k,"21"));
        words.add(new Word("Rohit Gulia","All Rounder",R.raw.l12l,"20"));
        words.add(new Word("Mahipal Narwal","All Rounder",R.raw.mahi75,"0"));
        words.add(new Word("Seong Ryeol Kim","All Rounder",R.raw.kim89,"14"));
        WordAdapter adapter1 = new WordAdapter(this,0, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter1);
    }
}
