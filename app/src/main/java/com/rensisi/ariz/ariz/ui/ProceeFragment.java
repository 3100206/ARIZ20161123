package com.rensisi.ariz.ariz.ui;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.rensisi.ariz.ariz.Next;
import com.rensisi.ariz.ariz.R;

/**
 * Created by kellen_home on 2016/11/17.
 */

public class ProceeFragment extends Next {

    private ViewGroup mViewgroup;
    private View mChild2;
    private View mChild4;
    private View mChild6;
    private View mFragment_5;
    private View child;
    Button saveButton;
    Button nextButton;
    private View mChild7;
    ScrollRunner scrollRunner;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        switch (getFragmentType()) {
            case 5:
                ApplicateActivity activity = (ApplicateActivity) getActivity();
                activity.getReuseView();
                mFragment_5 = inflater.inflate(R.layout.fifth_fgm, container, false);
                mViewgroup = (LinearLayout) mFragment_5.findViewById(R.id.l_5_fgm);
                mChild2 = inflater.inflate(R.layout.second_fgm, container, false).findViewById(R.id.l_2_fgm);
                mChild4 = inflater.inflate(R.layout.forth_fgm, container, false).findViewById(R.id.l_4_fgm);
                mChild6 = inflater.inflate(R.layout.sixth_fgm, container, false).findViewById(R.id.l_6_fgm);
                mChild7 = inflater.inflate(R.layout.seventh_fgm, container, false).findViewById(R.id.l_7_fgm);
                nextButton = (Button) mFragment_5.findViewById(R.id.bt_next_fgm5);
                saveButton = (Button) mFragment_5.findViewById(R.id.bt_save_fgm5);
                ScrollView scrollView = (ScrollView) mFragment_5.findViewById(R.id.scv_fgm5);
                extendView(mChild2, 0);
                extendView(mChild4, 1);
                mChild2.findViewById(R.id.next_second_fgm).setVisibility(View.GONE);
                mChild4.findViewById(R.id.next_forth_fgm).setVisibility(View.GONE);
                scrollRunner = new ScrollRunner(scrollView);
                new Handler().post(scrollRunner);
                break;
            case 6:
                break;
        }
        setmNextButton(nextButton);
        setmSaveButton(saveButton);
        return mFragment_5;
    }


    void extendView(View v, int position) {
        this.mViewgroup.addView(v, position);
    }

//    void updateView(){
//        nextButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        saveButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//    }

    @Override
    public boolean next() {
        int addPosition;
        switch (getFragmentType()){
            case 5:
                addPosition = mViewgroup.getChildCount();
                extendView(mChild6, addPosition);
                saveButton.setVisibility(View.GONE);
                nextButton.setVisibility(View.GONE);
                nextButton = (Button) mChild6.findViewById(R.id.next_button_fgm6);
                saveButton = (Button) mChild6.findViewById(R.id.save_button_fgm6);
                setmSaveButton(saveButton);
                setmNextButton(nextButton);
                setFragmentType(6);
                break;
            case 6:
                addPosition =mViewgroup.getChildCount();
                extendView(mChild7, addPosition);
                saveButton.setVisibility(View.GONE);
                nextButton.setVisibility(View.GONE);
                nextButton = (Button) mChild6.findViewById(R.id.next_button_fgm7);
                saveButton = (Button) mChild6.findViewById(R.id.save_button_fgm7);
                break;
        }
        new Handler().post(scrollRunner);
        return false;
    }

    @Override
    public boolean back() {
        new Handler().post(scrollRunner);
        return false;
    }

    //这里会跳过第六步，直接进入最后一页
    @Override
    public boolean save() {
        return false;
    }

    private static class ScrollRunner implements Runnable {
        ScrollView scrollView;
        public ScrollRunner(ScrollView scrollView) {
            this.scrollView = scrollView;
        }

        @Override
        public void run() {
            scrollView.fullScroll(View.FOCUS_DOWN);
        }
    }
}
