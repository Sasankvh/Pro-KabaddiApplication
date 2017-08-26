package com.blogspot.drivetwist.www.kbid;

/**
 * Created by Bhargav on 18-08-2017.
 */


public class Word {
    private String name;
    private String position;
    private int image;
    private String tpoint;
    public Word(String sname,String sposition,int mimage,String rpoints){
        name=sname;
        tpoint=rpoints;
        position=sposition;
        image=mimage;
    }
    public int getImage(){
        return image;
    }
    public String getpoints(){return tpoint;}

    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
}
