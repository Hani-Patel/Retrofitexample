package com.hani.android.retrofitexample.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.hani.android.retrofitexample.R;

/**
 * Created by SURBHI PATEL on 09-04-2017.
 */

public class RecyclerViewholder extends RecyclerView.ViewHolder implements View.OnClickListener {
     public TextView name,hobby;

    public RecyclerViewholder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        name=(TextView)itemView.findViewById(R.id.name);
        hobby=(TextView)itemView.findViewById(R.id.hobby);
    }

    @Override
    public void onClick(View view) {

    }
}
