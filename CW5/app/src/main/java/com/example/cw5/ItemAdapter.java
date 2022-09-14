package com.example.cw5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter {
    ArrayList<Items> List2 = new ArrayList<>();
    Context context;

    public ItemAdapter(ArrayList<Items> List2, Context context ) {
        this.List2 = List2 ;
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_item, parent,false );
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).textType.setText(List2.get(position).getItemName());
        ((ViewHolder)holder).textprice.setText(List2.get(position).getItemPrice()+"KD");
        ((ViewHolder)holder).img.setImageResource(List2.get(position).getItemImage());

    }

    @Override
    public int getItemCount() {
        return List2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView textType;
        TextView textprice;
        View v;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            v = itemView;
            img = v.findViewById(R.id.imageView);
            textType = v.findViewById(R.id.textViewtype);
            textprice = v.findViewById(R.id.textViewprice);


        }
    }
}
