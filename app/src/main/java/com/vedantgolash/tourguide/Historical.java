package com.vedantgolash.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Historical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("1) QUTUB MINAR, NEW DELHI","Qutab Minar, is a minaret and " +
                "victory tower that forms part of the Qutb complex" +
                "Height of Qutub Minar is 72.5m","Timing: Opens Everyday\n" +
                "From 7AM-5PM",R.drawable.qutubminar));

        words.add(new Word("2) INDIA GATE, NEW DELHI","The India Gate is a war memorial " +
                "located astride the Rajpath, on the eastern edge of the ceremonial axis of New Delhi," +
                " formerly called Kingsway.","Timing: Opens Everyday\n" +
                "24 Hrs ",R.drawable.indiagate));

        words.add(new Word("3) RED FORT ","The Red Fort is a historic fort in the " +
                "city of Delhi in India that served as the main residence of the Mughal Emperors",
                "Timing: All days of the week except Monday\n" +
                        "9:30 AM - 4:30 PM",R.drawable.redfort));









        WordAdapter wordAdapter = new WordAdapter(this,words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(wordAdapter);






    }
}