package com.rensisi.ariz.ariz.ui;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
        TextView textView = (TextView)view.findViewById(R.id.tv_fragment_applicate);
        ImageView imageView = (ImageView)view.findViewById(R.id.iv_fragment_applicate);
        String content = "";
        Bundle bundle = getArguments();
        if (bundle != null){
            int type = bundle.getInt(DISPLAYTYPE);
            switch (type) {
                case 0 :
                    content = getResources().getString(R.string.ari1);
                    textView.setText(content);
                    break;
                case 1:
                    content = getResources().getString(R.string.ari2);
                    textView.setText(content);
                    break;
                case 2:
                    Drawable drawable = getResources().getDrawable(R.drawable.ariz3);
                    imageView.setImageDrawable(drawable);
                    textView.setVisibility(View.GONE);
                    imageView.setVisibility(View.VISIBLE);
                    break;
                //TODO 添加第3、4个fragment的显示内容
                case 3:
                    return null;
                case 4:
                    return null;
                default:
                    break;
            }

        }
        return view;
    }
}
