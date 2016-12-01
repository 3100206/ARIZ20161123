package com.rensisi.ariz.ariz.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.webkit.WebView;
import android.widget.TextView;

import com.rensisi.ariz.ariz.ImageGetter;
import com.rensisi.ariz.ariz.R;

public class FavoteKnowledgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favote_knowledge);
        TextView textView = (TextView)findViewById(R.id.tv_case_content);
        String test = "测试图片：<br><img src=\"R.drawable.th\" />";
        String content = getResources().getString(R.string.case_1);
        Spanned sp = Html.fromHtml(content, new ImageGetter(), null);
        textView.setText(sp);

    }
}
