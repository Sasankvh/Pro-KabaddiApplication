package com.blogspot.drivetwist.www.kbid;

/**
 * Created by user on 8/22/2017.
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SasankVH on 8/20/2017.
 */

public class CustomAdapter extends ArrayAdapter{

    public CustomAdapter(Context context, ArrayList<String> Place) {
        super(context, R.layout.listrow_xml,Place);
    }

    public View getView(int position,View convertView,ViewGroup parent) {
        LayoutInflater EventInflate=LayoutInflater.from(getContext());
        View EventView=EventInflate.inflate(R.layout.listrow_xml,parent,false);

        String singleEvent= (String) getItem(position);
        TextView EventText=(TextView) EventView.findViewById(R.id.ListViewText);
        //ImageView EventImage=(ImageView) EventView.findViewById(R.id.ListImage);
        EventText.setText(singleEvent);
        // EventImage.setImageResource(R.drawable.haryanasteelers);
        return EventView;
    }

}
