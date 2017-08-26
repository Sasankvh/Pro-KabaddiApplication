package com.blogspot.drivetwist.www.kbid;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment{

    TextView m,t1,t2,t1p,t2p;
    private DatabaseReference mDatabase;
    private DatabaseReference tDatabase;
    private DatabaseReference t1Database;
    private DatabaseReference t2Database;
    private DatabaseReference t2pDatabase;
    private ArrayList<String> scores=new ArrayList<>();
    Date currentTime = Calendar.getInstance().getTime();
    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mDatabase= FirebaseDatabase.getInstance().getReference().child("Match");
        tDatabase=FirebaseDatabase.getInstance().getReference().child("Team");
        t1Database=FirebaseDatabase.getInstance().getReference().child("Team1p");
        t2Database=FirebaseDatabase.getInstance().getReference().child("Team2");
        t2pDatabase=FirebaseDatabase.getInstance().getReference().child("Team2p");
        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);
        m=(TextView)rootView.findViewById(R.id.match);
        t1=(TextView)rootView.findViewById(R.id.team1);
        t1p=(TextView)rootView.findViewById(R.id.team1p);
        t2=(TextView)rootView.findViewById(R.id.team2);
        t2p=(TextView)rootView.findViewById(R.id.team2p);
        /*m.setText("Match Not Yet Started");
        t1.setText("");
        t1p.setText("");
        t2.setText("");
        t2p.setText("");*/
        mDatabase.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String mtch=dataSnapshot.getValue(String.class);
                m.setText(mtch);



            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                String mtch=dataSnapshot.getValue(String.class);
                m.setText(mtch);
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        t1Database.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String tm1=dataSnapshot.getValue(String.class);
                t1p.setText(tm1);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                String tm1=dataSnapshot.getValue(String.class);
                t1p.setText(tm1);
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        tDatabase.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String tm=dataSnapshot.getValue(String.class);
                t1.setText(tm);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                String tm=dataSnapshot.getValue(String.class);
                t1.setText(tm);
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        t2Database.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String tm2=dataSnapshot.getValue(String.class);
                t2.setText(tm2);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                String tm2=dataSnapshot.getValue(String.class);
                t2.setText(tm2);
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        t2pDatabase.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String tm2p=dataSnapshot.getValue(String.class);
                t2p.setText(tm2p);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                String tm2p=dataSnapshot.getValue(String.class);
                t2p.setText(tm2p);
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });














        return rootView;

    }


}
