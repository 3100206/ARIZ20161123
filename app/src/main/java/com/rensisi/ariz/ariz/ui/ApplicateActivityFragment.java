package com.rensisi.ariz.ariz.ui;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.rensisi.ariz.ariz.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class ApplicateActivityFragment extends Fragment {

    public static final String DISPLAYTYPE = "DISPLAYTYPE";
    public static final String WORD = "WORD";
    public static final String IMAGE = "IMAGE";

    public ApplicateActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_applicate, container, false);

        return view;
    }
}
