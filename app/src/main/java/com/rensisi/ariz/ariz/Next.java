package com.rensisi.ariz.ariz;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.rensisi.ariz.ariz.it.Reused;
import com.rensisi.ariz.ariz.ui.Judgable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kellen_home on 2016/11/16.
 */

public abstract class Next extends Fragment implements Judgable {

    Button mNextButton;
    Button mBackButton;
    Button mSaveButton;

    private int fragmentType;

    Bundle mPreFragment;
    Bundle mNextFragment;
    Bundle mSolvetion;

    public abstract boolean next();
    public abstract boolean back();
    public abstract boolean save();
    Context context;

    public  Next(){
        super();
        if (fragmentType ==0){
            fragmentType = 1;
        }
    }
    public Next(int fragmentType){
        super();
        this.fragmentType = fragmentType;
    }

    public Next createFragment(Context context, Next currentfragment, Bundle mSolvetion) {
        //TODO
        //完成Fragment的实例化
        return null;
    }

    public void setmBackButton(Button mBackButton) {
        if (mBackButton == null){
            return;
        }
        this.mBackButton = mBackButton;
        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });
    }

    public void setmNextButton(Button mBackButton) {
        if (mBackButton == null){
            return;
        }
        this.mNextButton = mBackButton;
        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });
    }

    public void setmSaveButton(Button mSaveButton) {
        this.mSaveButton = mSaveButton;
        mSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }
        });
    }


    public int getFragmentType() {
        return fragmentType;
    }

    public void setFragmentType(int fragmentType) {
        this.fragmentType = fragmentType;
    }

    protected void transFragment(Fragment fragment){

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        List<Fragment> fragments =  manager.getFragments();
        for (Fragment f : fragments) {
            transaction.hide(f);
        }
        transaction.add(R.id.framelayout_applicat_activity,fragment).show(fragment);
        transaction.commit();
    }

    @Override
    public boolean judge(View view) {
        return false;
    }

    @Override
    public Context getContext() {
        return context;
    }
}
