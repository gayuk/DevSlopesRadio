package com.example.gayathri.devslopesradio.activity;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.gayathri.devslopesradio.R;
import com.example.gayathri.devslopesradio.adapter.StationsAdapter;
import com.example.gayathri.devslopesradio.fragments.DetailsFragment;
import com.example.gayathri.devslopesradio.fragments.MainFragment;
import com.example.gayathri.devslopesradio.model.Station;

public class MainActivity extends AppCompatActivity implements ObjectActivity {
    FragmentManager fm=getSupportFragmentManager();
    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    private static void setMainActivity(MainActivity mainActivity) {
        MainActivity.mainActivity = mainActivity;
    }

    @Override
    public void setinst() {
        MainActivity.mainActivity=mainActivity;

    }

    @Override
    public MainActivity getinst() {
        return mainActivity;
    }

    private static MainActivity mainActivity;
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



       /* getSupportActionBar().setCustomView(R.layout.activity_main);
        getSupportActionBar().getCustomView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("actionbar :","hits for back");
                Toast.makeText(context, "action bar", Toast.LENGTH_SHORT).show();
               // fm.popBackStack();
            }
        });
*/


        context = getApplicationContext();
        MainFragment mainfragment=(MainFragment)fm.findFragmentById(R.id.container_main);
        StationsAdapter st = new StationsAdapter(context);
        if(mainfragment == null){
            mainfragment=MainFragment.newInstance("gayathri","karthik");
            fm.beginTransaction().add(R.id.container_main,mainfragment).addToBackStack("Main Fragment").commit();
        }
        /*ImageButton b1=(ImageButton) findViewById(R.id.back);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fm.popBackStack();
            }
        });
*/

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id == android.R.id.home ){
            fm.popBackStack();
        }
        return super.onOptionsItemSelected(item);
    }

    public void loadDetailsScreen(Station station) {
       // final String title=selectedStation.getStationTitle();
        Log.v("load","hitted");
        FragmentManager fm=getSupportFragmentManager();
        //Log.v("selected"+selectedStation,"station");
        fm.beginTransaction()
                .replace(R.id.container_main,new DetailsFragment())
                .addToBackStack(null)
                .commit();
    }
}
