package com.vedantgolash.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.UserDictionary;
import android.widget.ListView;

import java.util.ArrayList;

public class malls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("1) SELECT CITYWALK, SAKET","Vibrant, upscale retail center with eye " +
                "catching decor, " + "brand-name stores, a food court & a cinema.","Timing: Opens Everyday\n" +
                "From 11AM-9PM",R.drawable.select));

        words.add(new Word("2) PACIFIC MALL, TAGORE GARDEN","Its convenient location and " +
                "excellent connectivity, both by public and private transport, make Pacific Mall, " +
                "Delhi a popular shopping destination in the city. The mall has more than " +
                "130 outlets of Indian and international labels.","Opens Everyday\nFrom 11AM-9PM",R.drawable.pacific));

        words.add(new Word("3) AMBIENCE MALL, VASANT KUNJ","Ambience Mall is one of the most " +
                "popular shopping malls in Vasant Kunj. The mall is replete with several not-so-expensive retail outlets" +
                " such as Biba, Big Bazar, Bata, Reliance Digital, And, Lifestyle, Global Desi, Home Centre and many more."
                ,"Opens Everyday\nFrom 10AM-10PM",R.drawable.ambience));








        WordAdapter wordAdapter = new WordAdapter(this,words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(wordAdapter);






    }
}