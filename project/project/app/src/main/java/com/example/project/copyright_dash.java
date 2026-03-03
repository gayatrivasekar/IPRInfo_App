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

public class copyright_dash extends AppCompatActivity {
    VideoView videoView1;
    Button types,q;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copyright_dash);
        videoView1=findViewById(R.id.video1);
        types=findViewById(R.id.b2);
        q=findViewById(R.id.quiz);
        MediaController mediaController=new MediaController(this);
        mediaController.setMediaPlayer(videoView1);
        videoView1.setMediaController(mediaController);
        videoView1.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.copyright));
        types.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(copyright_dash.this,copyright.class);
                startActivity(i);
            }
        });
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://teal-koren-92.tiiny.site/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


    }
}