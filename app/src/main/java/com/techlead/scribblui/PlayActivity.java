package com.techlead.scribblui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;

import com.techlead.scribblui.Adapter.AvatarAdapter;
import com.techlead.scribblui.Adapter.CommentAdapter;
import com.techlead.scribblui.Data.Avatar;
import com.techlead.scribblui.Data.Comment;

import java.util.ArrayList;
import java.util.List;

public class PlayActivity extends AppCompatActivity {

    RecyclerView avatarRecycler, commentRecycler;
    AvatarAdapter avatarAdapter;
    CommentAdapter commentAdapter;
    EditText guessText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        List<Avatar> recentDataList = new ArrayList<>();
        recentDataList.add(new Avatar(R.drawable.family_father,"Amit"));
        recentDataList.add(new Avatar(R.drawable.family_older_brother,"Ankit"));
        recentDataList.add(new Avatar(R.drawable.family_younger_brother,"Rajeev"));
        recentDataList.add(new Avatar(R.drawable.family_older_sister,"Mukesh"));
        recentDataList.add(new Avatar(R.drawable.family_younger_sister,"Suresh"));
        recentDataList.add(new Avatar(R.drawable.family_mother,"Ramesh"));
        setAvatarRecycler(recentDataList);

        List<Comment> commentDataList = new ArrayList<>();
        commentDataList.add(new Comment("Amit","Argentina"));
        commentDataList.add(new Comment("Ankit","Israel"));
        commentDataList.add(new Comment("Rajeev","Mali"));
        commentDataList.add(new Comment("Mukesh","Indonesia"));
        commentDataList.add(new Comment("Suresh","Argentina"));
        setCommentRecycler(commentDataList);
        guessText = findViewById(R.id.guess);
        String guess = guessText.getText().toString();


    }

    private void setCommentRecycler(List<Comment> commentDataList) {
        commentRecycler = findViewById(R.id.comment_view_cycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        commentRecycler.setLayoutManager(layoutManager);
        commentAdapter = new CommentAdapter(this,commentDataList);
        commentRecycler.setAdapter(commentAdapter);
    }


    private void setAvatarRecycler(List<Avatar> recentDataList){
        avatarRecycler = findViewById(R.id.avatar_view_cycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        avatarRecycler.setLayoutManager(layoutManager);
        avatarAdapter = new AvatarAdapter(this,recentDataList);
        avatarRecycler.setAdapter(avatarAdapter);

    }
}