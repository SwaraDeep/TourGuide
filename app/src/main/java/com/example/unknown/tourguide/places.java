package com.example.unknown.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        final ArrayList<Image> a = new ArrayList<>();
        a.add(new Image("Godavari Bridge", R.drawable.bridge));
        a.add(new Image("Godavari Bridge", R.drawable.bridge));
        a.add(new Image("Godavari Bridge", R.drawable.bridge));

        ListAdapter adapter = new ListAdapter(this, a);
        ListView view = (ListView) findViewById(R.id.list_item);
        view.setAdapter(adapter);

    }
}
