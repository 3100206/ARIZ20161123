package com.rensisi.ariz.ariz.ui;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import com.rensisi.ariz.ariz.Next;
import com.rensisi.ariz.ariz.R;

/**
 * Created by kellen_home on 2016/11/17.
 */

public class ProceeFragment extends Next {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = null;
        switch (getFragmentType()) {
            case 5:
                view = inflater.inflate(R.layout.fifth_fgm, container, false);
                ScrollView scrollView = (ScrollView) view.findViewById(R.id.scv_fgm5);
                new Handler().post(new ScrollRunner(scrollView));
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
