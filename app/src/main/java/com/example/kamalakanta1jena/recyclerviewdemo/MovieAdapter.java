package com.example.kamalakanta1jena.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kamalakanta1.Jena on 15-06-2017.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private List<Actor> movieList;
    private Context context;

    public MovieAdapter(List<Actor> movieList, Context context){
        this.movieList = movieList;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivpic;
        private TextView tvTitle,tvDesc;
        private LinearLayout llitem;
        public ViewHolder(View itemView) {
            super(itemView);
            ivpic = (ImageView) itemView.findViewById(R.id.ivpic);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvDesc = (TextView) itemView.findViewById(R.id.tvDesc);
            llitem = (LinearLayout) itemView.findViewById(R.id.llitem);
        }
    }

    @Override
    public MovieAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MovieAdapter.ViewHolder holder, final int position) {
        holder.tvTitle.setText(movieList.get(position).getName());
        holder.tvDesc.setText(movieList.get(position).getDob());

        Picasso.with(context).load(movieList.get(position).getImage()).into(holder.ivpic);

        holder.llitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Clicked at: " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }


}
