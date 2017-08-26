package com.blogspot.drivetwist.www.kbid;

/**
 * Created by user on 8/22/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bhargav on 18-08-2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Context context, int hi, ArrayList<Word> words) {
        super(context, 0, words);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_team, parent, false);
        }
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView p_name = (TextView) listItemView.findViewById(R.id.player);
        TextView p_position = (TextView) listItemView.findViewById(R.id.position);
        p_name.setText(currentWord.getName());
        p_position.setText(currentWord.getPosition());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getImage());
        TextView tpoints=(TextView)listItemView.findViewById(R.id.points);
        tpoints.setText(currentWord.getpoints());
        return  listItemView;
    }
}

