package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class patent_dashboard extends AppCompatActivity {
    VideoView videoView1;
    Button types;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patent_dashboard);
        videoView1=findViewById(R.id.video1);
        types=findViewById(R.id.b2);
        MediaController mediaController=new MediaController(this);
        mediaController.setMediaPlayer(videoView1);
        videoView1.setMediaController(mediaController);
        videoView1.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.patent));
        types.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(patent_dashboard.this,patent.class);
                startActivity(i);
            }
        });

    }
}