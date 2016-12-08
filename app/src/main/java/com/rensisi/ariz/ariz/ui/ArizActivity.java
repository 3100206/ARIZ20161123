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

import java.util.List;

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
        mPlanetTitles = getResources().getStringArray(R.array.list_ariz);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        mDrawerList.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mPlanetTitles));
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //fragment切换
                Fragment fragment = new ArizActivityFragment();
                Bundle bundle = new Bundle();
                switch (position) {
                    case 0:
                        bundle.putInt(DISPLAYTYPE, 0);
                        break;
                    case 1:
                        bundle.putInt(DISPLAYTYPE, 1);
                        break;
                    case 2:
                        bundle.putInt(DISPLAYTYPE, 2);
                        break;
                    case 3:
                        bundle.putInt(DISPLAYTYPE, 3);
                    case 4:
                        bundle.putInt(DISPLAYTYPE, 4);

                }
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.displayfragment_applicate_activity,fragment);
                fragmentTransaction.commit();
            }
        });
    }



}
