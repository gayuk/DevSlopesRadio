package com.example.gayathri.devslopesradio.model;

/**
 * Created by Gayathri on 4/30/2017.
 */

public class Station {
    final String DRAWABLE="drawable/";
    private String stationTitle;
    private String imageUri;

    public Station(String stationTitle, String imageUri) {
        this.stationTitle=stationTitle;
        this.imageUri=imageUri;
    }

    public String getStationTitle() {
        return stationTitle;
    }

    public String getImageUri() {
        return DRAWABLE+imageUri;
    }


}
