package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.contentcapture.ContentCaptureCondition;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class F_RecyclerViewAdapter extends RecyclerView.Adapter<F_RecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<FitnessModel> fitnessModels;

    public F_RecyclerViewAdapter(Context context, ArrayList<FitnessModel> fitnessModels) {
        this.context = context;
        this.fitnessModels = fitnessModels;

    }

    @NonNull
    @Override
    public F_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // This is where you inflate the layout (Giving a look to the rows)
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);

        return new F_RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull F_RecyclerViewAdapter.MyViewHolder holder, int position) {
        // assigning values to the views we created in the recycler_view_row layout file
        // bases on the position of the recycler view
        holder.tvName.setText(fitnessModels.get(position).getNombre());
        holder.tv3Letter.setText(fitnessModels.get(position).getNombreAbr());
        holder.tv1Letter.setText(fitnessModels.get(position).nombreLetra);
        holder.imageView.setImageResource(fitnessModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        // the recycler view just wants to know the number of items you want displayed
        return fitnessModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // grab the views from our recycler_view_row layout file
        // kinda like in the onCreate method

        ImageView imageView;
        TextView tvName, tv3Letter, tv1Letter;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.tvName);
            tv3Letter = itemView.findViewById(R.id.tvAbr);
            tv1Letter = itemView.findViewById(R.id.tvLetra);

        }
    }

}
