package com.example.unknown.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter{

    public ListAdapter(@NonNull Context context, ArrayList<Image> pImages) {
        super(context, 0, pImages);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listview = convertView;
        Image currentimage = (Image) getItem(position);
        if(listview == null){
            listview = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false
            );
        }
        Image imageName = (Image) getItem(position);
        TextView name = (TextView) listview.findViewById(R.id.text_view);
        name.setText(imageName.getMitemName());
        ImageView image = (ImageView) listview.findViewById(R.id.img_view);
        image.setImageResource(currentimage.getMitemId());
        return listview;
    }
}
