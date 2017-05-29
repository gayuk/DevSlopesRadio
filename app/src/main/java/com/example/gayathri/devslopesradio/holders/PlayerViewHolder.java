package com.example.gayathri.devslopesradio.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gayathri.devslopesradio.R;
import com.example.gayathri.devslopesradio.model.Player;
import com.example.gayathri.devslopesradio.model.Station;

/**
 * Created by Gayathri on 5/14/2017.
 */

public class PlayerViewHolder extends RecyclerView.ViewHolder {
    private ImageView player_image;
    private TextView song_title;
    private ImageButton play;
    private ImageButton stop;

    public PlayerViewHolder(View itemView) {
        super(itemView);
        player_image=(ImageView) itemView.findViewById(R.id.player_image);
        song_title=(TextView) itemView.findViewById(R.id.player_text);

    }

    public void updateUI(Player player){
        String uri=player.getSongUri();
        int resource= player_image.getResources().getIdentifier(uri,null,player_image.getContext().getPackageName());
        player_image.setImageResource(resource);
        song_title.setText(player.getSongTitle());

    }

}
