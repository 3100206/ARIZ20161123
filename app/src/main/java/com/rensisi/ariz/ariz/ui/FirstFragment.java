package com.rensisi.ariz.ariz.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;

import com.rensisi.ariz.ariz.Next;
import com.rensisi.ariz.ariz.R;

/**
 * Created by kellen_home on 2016/11/17.
 */

public class FirstFragment extends Next {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Button nextButton = null;
        Button backButton = null;
        View view = null;
        Log.d("FirstFragment",getFragmentType() + "");
        int type = getFragmentType();
        switch (type) {
            case 1:
                view = inflater.inflate(R.layout.first_fgm, container, false);
                nextButton = (Button) view.findViewById(R.id.start);
                break;
            case 2:
                view = inflater.inflate(R.layout.second_fgm, container, false);
                nextButton = (Button) view.findViewById(R.id.next_second_fgm);
                break;
            case 4:
                view = inflater.inflate(R.layout.forth_fgm, container, false);
                nextButton = (Button) view.findViewById(R.id.next_forth_fgm);
                backButton = (Button) view.findViewById(R.id.back_forth_fgm);
            default:
                break;
        }
        setmNextButton(nextButton);
        setmBackButton(backButton);
        return view;

    }

    @Override
    public boolean next() {
        Bundle bundle = new Bundle();
        Next next = null;
        switch (getFragmentType()) {
            case 1:
                next = new FirstFragment();
                next.setFragmentType(2);
                break;
            case 2:
                if (judge(getView())){
                    //满足条件，下一步给出解决方案。
                    next = new FinalFragment();
                    next.setFragmentType(3);
                } else {
                    //不满足，继续求解
                    next = new FirstFragment();
                    next.setFragmentType(4);
                }
                break;
            case 4:
                next = new ProceeFragment();
                next.setFragmentType(5);
                break;
            default:
                break;
        }
        transFragment(next);
        return true;
    }

    @Override
    public boolean judge(View view) {
        RadioGroup radio_1 = (RadioGroup) view.findViewById(R.id.radioGroup1);
        RadioGroup radio_2 = (RadioGroup) view.findViewById(R.id.radioGroup2);
        int idRdiaoGroup1 = radio_1.getCheckedRadioButtonId();
        int idRdiaoGroup2 = radio_2.getCheckedRadioButtonId();
        if (R.id.yes1 == idRdiaoGroup1 || R.id.yes2 == idRdiaoGroup2) {
            return true;
        }
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
