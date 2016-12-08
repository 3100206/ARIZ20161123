package com.rensisi.ariz.ariz.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import com.rensisi.ariz.ariz.ImageGetter;
import com.rensisi.ariz.ariz.R;

public class CaseContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case_content);
        int contentResID = getIntent().getIntExtra("id",0);
        TextView textView = (TextView)findViewById(R.id.tv_case_content);
        String content = getResources().getString(contentResID);
        Spanned sp = Html.fromHtml(content, new ImageGetter(), null);
        textView.setText(sp);

    }
}
