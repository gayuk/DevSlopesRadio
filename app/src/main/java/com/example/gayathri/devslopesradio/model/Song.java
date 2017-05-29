package com.example.gayathri.devslopesradio.model;

/**
 * Created by Gayathri on 5/29/2017.
 */

public class Song {

    private String songName;
    private String songPath;
    private String RAW="raw/";

    public Song(String sname, String spath){
        songName=sname;
        songPath=spath;

    }
    public String getSongName() {
        return songName;
    }

    public String getSongPath() {
        return RAW+songPath;
    }
}
