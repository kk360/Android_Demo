package com.example.kamalakanta1jena.recyclerviewdemo.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kamalakanta1jena.recyclerviewdemo.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by Kamalakanta1.Jena on 21-06-2017.
 */

public class DummyAdapter extends RecyclerView.Adapter<DummyAdapter.ViewHolder> {
    private ArrayList<String> dummydata;
    private Context context;

    public DummyAdapter(Context context, ArrayList<String> dummydata) {
        this.context = context;
        this.dummydata = dummydata;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvdata;
        public ViewHolder(View itemView) {
            super(itemView);
            tvdata = (TextView) itemView.findViewById(R.id.tvdata);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dummy_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvdata.setText(dummydata.get(position));
    }

    @Override
    public int getItemCount() {
        return dummydata.size();
    }

}
