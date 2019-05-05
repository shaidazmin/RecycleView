package com.example.recycleview;


import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class MyClass extends RecyclerView.Adapter<MyClass.ViewHolder> {

    int[] flag;
    String [] country;

    public MyClass(int[] flag, String[] country) {
        this.flag = flag;
        this.country = country;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.custom_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int country_flag = flag[position];
        String country_name = country[position];

        holder.image.setImageResource(country_flag);
        holder.text.setText(country_name);

    }

    @Override
    public int getItemCount() {
        return country.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView text;

        public ViewHolder(View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image_view_id);
            text = itemView.findViewById(R.id.text_view_id);
        }
    }
}
