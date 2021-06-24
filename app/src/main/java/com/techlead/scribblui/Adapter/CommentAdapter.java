package com.techlead.scribblui.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.techlead.scribblui.Data.Comment;
import com.techlead.scribblui.R;

import java.util.List;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.RecentViewHolder> {
    Context context;
    List<Comment> commentDataList;

    public CommentAdapter(Context context, List<Comment> commentDataList) {
        this.context = context;
        this.commentDataList = commentDataList;
    }

    @NonNull
    @Override
    public CommentAdapter.RecentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.comment_item,parent,false);
        return new CommentAdapter.RecentViewHolder(view);
    }




    @Override
    public void onBindViewHolder(@NonNull CommentAdapter.RecentViewHolder holder, int position) {
        holder.nameView.setText(commentDataList.get(position).getName());
        holder.guessTextView.setText(commentDataList.get(position).getComment());

    }

    @Override
    public int getItemCount() {
        return commentDataList.size();
    }

    public static final class RecentViewHolder extends RecyclerView.ViewHolder{
        TextView nameView;
        TextView guessTextView;

        public RecentViewHolder(@NonNull View itemView) {
            super(itemView);
            guessTextView= itemView.findViewById(R.id.comment_guess_view);
            nameView = itemView.findViewById(R.id.comment_name);
        }
    }
}
