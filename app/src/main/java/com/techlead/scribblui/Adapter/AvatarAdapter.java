package com.techlead.scribblui.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.techlead.scribblui.Data.Avatar;
import com.techlead.scribblui.R;

import java.util.List;

public class AvatarAdapter extends RecyclerView.Adapter<AvatarAdapter.RecentViewHolder> {
    Context context;
    List<Avatar> recentDataList;

    public AvatarAdapter(Context context, List<Avatar> recentDataList) {
        this.context = context;
        this.recentDataList = recentDataList;
    }

    @NonNull
    @Override
    public AvatarAdapter.RecentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.name_items,parent,false);
        return new RecentViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull RecentViewHolder holder, int position) {
        holder.nameView.setText(recentDataList.get(position).getName());

        holder.avatarView.setImageResource(recentDataList.get(position).getImageUrl());

    }

    @Override
    public int getItemCount() {
        return recentDataList.size();
    }

    public static final class RecentViewHolder extends RecyclerView.ViewHolder{
        ImageView avatarView;
        TextView nameView;

        public RecentViewHolder(@NonNull View itemView) {
            super(itemView);
            avatarView = itemView.findViewById(R.id.avatar_image);
            nameView = itemView.findViewById(R.id.name_view);
        }
    }
}
