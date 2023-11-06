package com.example.videoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
VideoView videoView;
VideoView videoView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView=findViewById(R.id.videoview);
        videoView2=findViewById(R.id.videoView2);
        // Display Videos from local storage
        //to display video from local storage in their own folder we need to create videoview and make use of setVideoPath
        videoView.setVideoPath(
                "android.resource://"+
                        getPackageName()+"/"+R.raw.mountains
        );
        MediaController mc = new MediaController(this);
        mc.setAnchorView(videoView);// to add controller tools in videoView
        videoView.setMediaController(mc); //assign mc as mediaController



        // Display Videos from Internet URLS (Links)
        Uri uri = Uri.parse("https://static.videezy.com/system/resources/previews/000/038/668/original/4k-abstract-green-particles-fx-fluid-slow-motion-background-seamless-loop.mp4");
        videoView2.setVideoURI(uri);

        MediaController mc2 = new MediaController(this);
        mc2.setAnchorView(videoView2);
        mc2.setMediaPlayer(videoView2);
        videoView2.setMediaController(mc2);
        videoView2.start();

    }
}