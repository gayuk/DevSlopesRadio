package com.example.gayathri.devslopesradio.holders;

import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gayathri.devslopesradio.R;
import com.example.gayathri.devslopesradio.activity.MainActivity;
import com.example.gayathri.devslopesradio.model.Station;

/**
 * Created by Gayathri on 4/30/2017.
 */

public class StationViewHolder extends RecyclerView.ViewHolder {
    private ImageView mainImage;
    private TextView titletextView;
    MainActivity mainActivity=MainActivity.getMainActivity();

    public StationViewHolder(View itemView) {
        super(itemView);
        mainImage= (ImageView)itemView.findViewById(R.id.main_image);
        titletextView= (TextView)itemView.findViewById(R.id.main_text);
    }
    public void updateUI(Station station){
        String uri=station.getImageUri();
        int resource= mainImage.getResources().getIdentifier(uri,null,mainImage.getContext().getPackageName());
        mainImage.setImageResource(resource);
        titletextView.setText(station.getStationTitle());

    }
    public void callMain(Station station)
    {
        


            mainActivity.loadDetailsScreen(station);

    }
}
