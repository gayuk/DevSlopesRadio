package com.example.gayathri.devslopesradio.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.gayathri.devslopesradio.R;
import com.example.gayathri.devslopesradio.adapter.PlayerAdapter;
import com.example.gayathri.devslopesradio.service.DataService;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
   FragmentManager manager = getFragmentManager();

    public DetailsFragment() {
        // Required empty public constructor
    }


    public static DetailsFragment newInstance() {
        DetailsFragment fragment = new DetailsFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_details, container, false);
        RecyclerView recyclerViewPlayer =(RecyclerView)v.findViewById(R.id.recycler_player);
        recyclerViewPlayer.setHasFixedSize(true);

        PlayerAdapter adapterplayers= new PlayerAdapter(DataService.getInstance().getPlay());
        recyclerViewPlayer.setAdapter(adapterplayers);
        LinearLayoutManager layoutManager =new LinearLayoutManager(getContext());

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewPlayer.setLayoutManager(layoutManager);



        return v;
    }

    public void backClick(View v){
        Log.v("back","hit");
        manager.popBackStack();
    }

}
