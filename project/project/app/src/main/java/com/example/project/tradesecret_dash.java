package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class tradesecret_dash extends AppCompatActivity {
    VideoView videoView1;
    Button types;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tradesecret_dash);
        videoView1=findViewById(R.id.video1);
        types=findViewById(R.id.b2);
        MediaController mediaController=new MediaController(this);
        mediaController.setMediaPlayer(videoView1);
        videoView1.setMediaController(mediaController);
        videoView1.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.tradesecret));
        types.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(tradesecret_dash.this,tradesecret.class);
                startActivity(i);
            }
        });
    }
}