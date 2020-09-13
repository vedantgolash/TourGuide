package com.vedantgolash.tourguide;

public class Word {

    private int ImageResourceId=SET_IMAGE;
    private static final int SET_IMAGE=-1;
    private String mText;
    private String mCost;
    private String mdesc;



    public Word(String desc,String text,String cost,int image){
        ImageResourceId=image;
        mText=text;
        mCost=cost;
        mdesc=desc;
    }
    public Word(String text,String cost){

        mText=text;
        mCost=cost;
    }

    public int getimage(){return ImageResourceId;}
    public String getText(){return mText;}
    public String getCost(){return mCost;}
    public String getDesc(){return mdesc;}
    public boolean hasimage(){return ImageResourceId !=SET_IMAGE;}
}


