package com.rensisi.ariz.ariz.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.rensisi.ariz.ariz.Next;
import com.rensisi.ariz.ariz.R;
import com.rensisi.ariz.ariz.it.Reused;

import java.util.ArrayList;

public class ApplicateActivity extends AppCompatActivity implements Reused{
    ArrayList<View> reusedView;
    Fragment mFragment;
    Next mFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applicate);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initView();
    }

    private void initView() {

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }


    @Override
    public ArrayList<View> getReuseView() {
        return this.reusedView;
    }

    @Override
    public void setReuseView(View view) {
        if (reusedView == null){
            reusedView = new ArrayList<View>();
        }
        this.reusedView.add(view);
    }
}
