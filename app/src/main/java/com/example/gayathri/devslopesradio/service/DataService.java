package com.example.gayathri.devslopesradio.service;

import com.example.gayathri.devslopesradio.model.Player;
import com.example.gayathri.devslopesradio.model.Song;
import com.example.gayathri.devslopesradio.model.Station;

import java.util.ArrayList;

/**
 * Created by Gayathri on 4/30/2017.
 */
public class DataService {
    private static DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }
    public ArrayList<Station> getFeaturedStation(){
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight plan(Tune for Travel)","flightplanmusic"));
        list.add(new Station("two wheel in(Tune for bicycle)","bicyclemusic"));
        list.add(new Station("Kids Jams(music for children)","kidsmusic"));
        return list;

    }
    public ArrayList<Station> getRecentStation(){
        ArrayList<Station> list = new ArrayList<>();
        return list;
    }
    public ArrayList<Station> getPartyStation(){
        ArrayList<Station> list = new ArrayList<>();
        return list;

    }
    public ArrayList<Player> getPlay(){
        ArrayList<Player> list = new ArrayList<>();
        list.add(new Player("enswasakatre","enswasakatre"));
        list.add(new Player("mulumathy","mulmat"));
        return list;
    }
    public  ArrayList<Song> getSongList(){
        ArrayList<Song> list = new ArrayList<>();
        list.add(new Song("enswasakatre","enswasakatre"));
        list.add(new Song("mulumaty","mulumaty"));
        return list;
    }
}
