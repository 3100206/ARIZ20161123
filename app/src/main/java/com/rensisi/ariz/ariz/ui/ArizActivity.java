package com.rensisi.ariz.ariz.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.rensisi.ariz.ariz.R;

import static com.rensisi.ariz.ariz.ui.ApplicateActivityFragment.DISPLAYTYPE;
import static com.rensisi.ariz.ariz.ui.ApplicateActivityFragment.IMAGE;
import static com.rensisi.ariz.ariz.ui.ApplicateActivityFragment.WORD;

public class ArizActivity extends AppCompatActivity {

    private String[] mPlanetTitles;

    private ListView mDrawerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ariz);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mPlanetTitles = getResources().getStringArray(R.array.list_ariz);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        mDrawerList.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mPlanetTitles));
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),position + "position",Toast.LENGTH_SHORT).show();
                //fragment切换
                Fragment fragment = new ArizActivityFragment();
                Bundle bundle = new Bundle();
                if (position == 2){
                    bundle.putString(DISPLAYTYPE, IMAGE);
                } else {
                    bundle.putString(DISPLAYTYPE, WORD);
                }
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.displayfragment_applicate_activity,fragment);
            }
        });
    }



}
