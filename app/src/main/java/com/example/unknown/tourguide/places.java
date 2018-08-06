package com.example.unknown.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        final ArrayList<Image> list = new ArrayList<>();
        list.add(new Image("Godavari Bridge", R.drawable.bridge));
        list.add(new Image("Godavari Bridge", R.drawable.bridge));
        list.add(new Image("Godavari Bridge", R.drawable.bridge));

        ListAdapter adapter = new ListAdapter(this, list);
        ListView view = (ListView) findViewById(R.id.list_item);
        view.setAdapter(adapter);

    }
}
