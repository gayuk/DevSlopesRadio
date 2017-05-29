package com.example.gayathri.devslopesradio.model;

/**
 * Created by Gayathri on 5/14/2017.
 */

public class Player {
    final String DRAWABLE="drawable/";
    final String SONGPATH="raw/";
    private String songTitle;
    private String imageUri;

    public Player(String stationTitle, String imageUri) {
        this.songTitle = stationTitle;
        this.imageUri = imageUri;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getSongUri() {
        return DRAWABLE+imageUri;
    }
}
