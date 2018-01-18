package com.wealthdoctor.bill_reminder.expandable_recycler_view.expand;

import android.view.View;
import android.widget.TextView;

import com.wealthdoctor.R;
import com.wealthdoctor.bill_reminder.expandable_recycler_view.viewholders.ChildViewHolder;


public class ArtistViewHolder extends ChildViewHolder {

  private TextView childTextView;

  public ArtistViewHolder(View itemView) {
    super(itemView);
    childTextView = (TextView) itemView.findViewById(R.id.list_item_artist_name);
  }

  public void setArtistName(String name) {
    childTextView.setText(name);
  }
}
