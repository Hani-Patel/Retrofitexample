package com.hani.android.retrofitexample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hani.android.retrofitexample.R;
import com.hani.android.retrofitexample.model.User;
import com.hani.android.retrofitexample.viewholder.RecyclerViewholder;

import java.util.List;

/**
 * Created by SURBHI PATEL on 09-04-2017.
 */

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerViewholder> {
    private List<User> itemlist;

    public RecyclerviewAdapter(List<User> itemlist) {
        this.itemlist = itemlist;
    }

    @Override
    public RecyclerViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row,null);
        RecyclerViewholder recyclerViewholder=new RecyclerViewholder(view);
        return recyclerViewholder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewholder holder, int position) {
        holder.name.setText(itemlist.get(position).getName());
        holder.hobby.setText(itemlist.get(position).getHobby());

    }

    @Override
    public int getItemCount() {
        return itemlist.size();
    }
}
