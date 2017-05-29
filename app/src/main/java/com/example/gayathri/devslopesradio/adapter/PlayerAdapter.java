package com.example.gayathri.devslopesradio.adapter;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.gayathri.devslopesradio.R;
import com.example.gayathri.devslopesradio.activity.MainActivity;
import com.example.gayathri.devslopesradio.activity.MusicActivity;
import com.example.gayathri.devslopesradio.fragments.DetailsFragment;
import com.example.gayathri.devslopesradio.holders.PlayerViewHolder;
import com.example.gayathri.devslopesradio.model.Player;
import com.example.gayathri.devslopesradio.service.DataService;


import java.util.ArrayList;

/**
 * Created by Gayathri on 5/14/2017.
 */

public class PlayerAdapter extends RecyclerView.Adapter<PlayerViewHolder> {
    private ArrayList<Player> players;


    DetailsFragment details = new DetailsFragment();
    public PlayerAdapter(ArrayList<Player> players){
        this.players = players;
    }
    @Override
    public PlayerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View playerCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_card,parent,false);
        return new PlayerViewHolder(playerCard);
    }

    @Override
    public void onBindViewHolder(final PlayerViewHolder holder, final int position) {
       // MusicActivity musicActivity = new MusicActivity(DataService.getInstance().getSongList());
        final Player player = players.get(position);
        holder.updateUI(player);


            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Log.d("card "," has selected" + position+player.getSongTitle());

                    Intent i= new Intent(v.getContext(),MusicActivity.class);
                    i.putExtra("position",position);
                    v.getContext().startActivity(i);
                    /*int id=v.getId();
                    switch (id){
                        case R.id.play:
                            Log.d("play button "," hits");
                            break;
                    }*/

                }
            });



    }

    @Override
    public int getItemCount() {
        return players.size();
    }



}
