package com.underground.DogRescue.Adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.underground.DogRescue.Interfaces.PostItemClickListener;
import com.underground.DogRescue.R;
import com.borjabravo.readmoretextview.ReadMoreTextView;

public class AchievementAdapter extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView postT;
    public ReadMoreTextView postDesc;
    public ImageView image;
    public PostItemClickListener listener;
    private Context context;

    public AchievementAdapter(@NonNull View itemView) {
        super(itemView);
        context = itemView.getContext();
        postT = (TextView)itemView.findViewById(R.id.row_post_title);
        postDesc = (ReadMoreTextView)itemView.findViewById(R.id.row_post_description);
        image = (ImageView)itemView.findViewById(R.id.row_post_img);
    }

    public void setItemClickListener(PostItemClickListener listener){
     this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        listener.onClick(view, getAdapterPosition(), false);
    }
}
