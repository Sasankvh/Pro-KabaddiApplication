package com.blogspot.drivetwist.www.kbid;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v4.app.Fragment;
import 	android.support.v4.app.FragmentManager;
import android.widget.ImageButton;

import static com.blogspot.drivetwist.www.kbid.R.id.score;


/**
 * A simple {@link Fragment} subclass.
 */
public class CoreFragment extends Fragment {

    Button b1;
    BlankFragment b;
    //ImageButton i;
    public CoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rtView = inflater.inflate(R.layout.fragment_core, container, false);
        //i=(ImageButton)rtView.findViewById(R.id.topb);
        b1=(Button)rtView.findViewById(R.id.bckbtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Intent i=new Intent(getActivity(),MainActivity.class);
                startActivity(i);*/
               b=new BlankFragment();
               //i=(ImageButton)v.findViewById(R.id.topb);
               //i.setImageResource(R.drawable.topbtn);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .add(R.id.fragmentscore, b).commit();


            }
        });

        return rtView;
    }



}
