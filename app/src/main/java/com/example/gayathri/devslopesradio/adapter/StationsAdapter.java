package com.example.gayathri.devslopesradio.adapter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gayathri.devslopesradio.R;
import com.example.gayathri.devslopesradio.activity.MainActivity;
import com.example.gayathri.devslopesradio.fragments.DetailsFragment;
import com.example.gayathri.devslopesradio.fragments.MainFragment;
import com.example.gayathri.devslopesradio.fragments.StationFragment;
import com.example.gayathri.devslopesradio.holders.StationViewHolder;
import com.example.gayathri.devslopesradio.model.Station;

import java.util.ArrayList;

/**
 * Created by Gayathri o    n 4/30/2017.
 */

public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder> {
private ArrayList<Station> stations;
    StationFragment st = new StationFragment();

    public StationsAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }
    //MainActivity mainActivity = MainActivity.getMainActivity();

    MainActivity mactivity;
   private Context mcontext;


    public StationsAdapter(Context context)
    {
        mcontext = context;
    }

    @Override
    public void onBindViewHolder(final StationViewHolder holder, int position) {
        final Station station =  stations.get(position);
        Log.v("Station Position"+position,"shown");
        holder.updateUI(station);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                st.clickOne(station);


            }
        });

    }

    @Override
    public int getItemCount() {
        return stations.size();
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View stationCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.station_card,parent,false);
        return new StationViewHolder(stationCard);
    }
}
