package com.example.gayathri.devslopesradio.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.gayathri.devslopesradio.R;
import com.example.gayathri.devslopesradio.model.Song;
import com.example.gayathri.devslopesradio.service.DataService;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Gayathri on 5/27/2017.
 */

public class MusicActivity extends AppCompatActivity {
    private Button play;
    private Button close;
    private Button pause;
    private Button stop;
    int length;
    public static MediaPlayer mediaPlayer;
    ArrayList<Song> songp;
    public MusicActivity(){}
    public MusicActivity(ArrayList<Song> songs){
        songp=songs;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_activity);
        //MusicActivity musicActivity = new MusicActivity(DataService.getInstance().getSongList());
        songp=DataService.getInstance().getSongList();
        Intent in = getIntent();
        int pos=Integer.parseInt(in.getExtras().get("position").toString());
        Log.d("position: ++ "+pos, "is this");

        play=(Button)findViewById(R.id.play);
        stop=(Button)findViewById(R.id.stop);
        close=(Button)findViewById(R.id.close);
        pause=(Button)findViewById(R.id.pause);
       final Song sn=songp.get(pos);
        final String spath=sn.getSongPath().toString();
        mediaPlayer=MediaPlayer.create(MusicActivity.this, Uri.parse("android.resource://" + getPackageName() + "/" + spath));
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                mediaPlayer.setLooping(true);
                mediaPlayer.start();
                mediaPlayer.seekTo(length);
                //mediaPlayer=new MediaPlayer();
               /* try {
                    mediaPlayer.setDataSource(spath);
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }*/



            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
                length=mediaPlayer.getCurrentPosition();

            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();


            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

    }
}
