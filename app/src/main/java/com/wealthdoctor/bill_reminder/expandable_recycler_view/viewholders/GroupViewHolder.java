package com.wealthdoctor.bill_reminder.expandable_recycler_view.viewholders;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;


import com.wealthdoctor.R;
import com.wealthdoctor.bill_reminder.expandable_recycler_view.listeners.OnGroupClickListener;


public abstract class GroupViewHolder extends RecyclerView.ViewHolder implements OnClickListener {

    private OnGroupClickListener listener;

    public GroupViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {
        if (listener != null) {
            listener.onGroupClick(getAdapterPosition());
        }
    }

    public void setOnGroupClickListener(OnGroupClickListener listener) {
        this.listener = listener;
    }

    public void expand() {
    }

    public void collapse() {
    }
}
