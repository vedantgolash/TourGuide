package com.vedantgolash.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class hotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("1) THE LEELA PALACE, NEW DELHI ","Located in New Delhi's Diplomatic" +
                " Enclave, The Leela Palace New Delhi is a blend of Lutyen's architecture and the royal " +
                "Indian culture","Avg Cost Per Night is Rs.12,500",R.drawable.leela));

        words.add(new Word("2) THE OBEROI, NEW DELHI","Overlooking Delhi's Golf Club and located in Central Delhi, " +
                "newly renovated The Oberoi, New Delhi is 9.9 mi from the Indira " +
                "Gandhi International Airport.","Avg Cost Per Night is Rs.12,000",R.drawable.oberoi));

        words.add(new Word("3) THE TAJ PALACE, NEW DELHI","Spread over six acres of lush gardens, offering an outdoor swimming pool and " +
                "panoramic city views, Taj Palace New Delhi is located in New Delhi." +
                " WiFi access is available","Avg Cost Per Night is Rs.5,500",R.drawable.tajpalace));








        WordAdapter wordAdapter = new WordAdapter(this,words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(wordAdapter);






    }
}