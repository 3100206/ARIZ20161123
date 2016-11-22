package com.rensisi.ariz.ariz.ui;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rensisi.ariz.ariz.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class ArizActivityFragment extends Fragment {

    public static final String DISPLAYTYPE = "DISPLAYTYPE";
    public static final String WORD = "WORD";
    public static final String IMAGE = "IMAGE";

    public ArizActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ariz, container, false);
        Bundle bundle = getArguments();
        if (bundle != null){
            String type = bundle.getString(DISPLAYTYPE);
            switch (type) {
                case WORD:
                    view.findViewById(R.id.tv_fragment_applicate).setVisibility(View.VISIBLE);
                    view.findViewById(R.id.iv_fragment_applicate).setVisibility(View.GONE);
                    break;
                case IMAGE:
                    view.findViewById(R.id.iv_fragment_applicate).setVisibility(View.VISIBLE);
                    view.findViewById(R.id.tv_fragment_applicate).setVisibility(View.GONE);
                    break;
                default:
                    break;
            }
        } else {
            Log.e("FavorateActivity", "type == null");
        }
        return view;
    }
}
