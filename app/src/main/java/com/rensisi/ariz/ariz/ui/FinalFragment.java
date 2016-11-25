package com.rensisi.ariz.ariz.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rensisi.ariz.ariz.Next;
import com.rensisi.ariz.ariz.R;

/**
 * Created by kellen_home on 2016/11/17.
 */

public class FinalFragment extends Next {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = null;
        switch (getFragmentType()){
            case 3:
                view = inflater.inflate(R.layout.third_fgm, container, false);
                break;
            case 7:
                view = inflater.inflate(R.layout.seventh_fgm, container, false);
                break;
        }

        return view;
    }

    @Override
    public boolean next() {
        return false;
    }

    @Override
    public boolean back() {
        return false;
    }

    @Override
    public boolean save() {
        return false;
    }
}
