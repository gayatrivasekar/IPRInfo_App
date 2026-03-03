package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.widget.Toast;
import android.widget.VideoView;

public class intellectual extends AppCompatActivity {
VideoView videoView;
Button quize;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intellectual);
        videoView=findViewById(R.id.video);
        quize=findViewById(R.id.b1);
        MediaController mediaController=new MediaController(this);
        mediaController.setMediaPlayer(videoView);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video));
        quize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://teal-koren-92.tiiny.site/"));
                startActivity(urlIntent);
            }
        });

    }
}