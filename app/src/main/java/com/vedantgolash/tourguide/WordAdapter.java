package com.vedantgolash.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.zip.Inflater;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context,0,words);

    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listitemview = convertView;
        if(listitemview==null){
            listitemview= LayoutInflater.from(getContext()).inflate(R.layout.file,parent,false);
        }

        Word currentword = getItem(position);
        TextView textView = (TextView)listitemview.findViewById(R.id.description_view);
        textView.setText(currentword.getText());

        TextView textView1 = (TextView)listitemview.findViewById(R.id.cost_view);
        textView1.setText(currentword.getCost());

        TextView textView2 = (TextView)listitemview.findViewById(R.id.desc_view);
        textView2.setText(currentword.getDesc());



        ImageView imageView = (ImageView)listitemview.findViewById(R.id.image_view);
        if(currentword.hasimage()){
            imageView.setImageResource(currentword.getimage());
            imageView.setVisibility(View.VISIBLE);

        }
        else{
            imageView.setVisibility(View.GONE);
        }

        return listitemview;
    }
}
