package com.vedantgolash.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("1) JAIN CHAWAL WALE,CP","It's Located In Connaught Place" +
                "food quality here is just amazing , you can give it a try","Avg Cost: 100Rs Per Person\n" +
                "It opens everyday",R.drawable.jainchawal));

        words.add(new Word("2) SITARAM CHOLE BHATURE, PAHARGANJ","Sitaram is famous for its chole bhature" +
                "Its near New delhi railway station","Avg Cost: 80Rs Per Person\n" +
                "It opens everyday from 8AM-5PM",R.drawable.sitaram));

        words.add(new Word("3) PARATHE WALI GALI , CHANDNI CHOWK","Gali Paranthe Wali or Paranthe wali" +
                " Gali is a narrow street in the Chandni Chowk area of Delhi, India, noted for its series of shops" +
                " selling paratha, an Indian flatbread","Avg Cost: 70-80 rs per Paratha\n" +
                "It opens everyday",R.drawable.parathe));











        WordAdapter wordAdapter = new WordAdapter(this,words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(wordAdapter);






    }
}