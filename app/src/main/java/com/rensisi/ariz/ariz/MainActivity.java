package com.rensisi.ariz.ariz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.rensisi.ariz.ariz.ui.ApplicateActivity;
import com.rensisi.ariz.ariz.ui.ArizActivity;
import com.rensisi.ariz.ariz.ui.BrowseActivity;
import com.rensisi.ariz.ariz.ui.CaseActivity;
import com.rensisi.ariz.ariz.ui.FavorateActivity;
import com.rensisi.ariz.ariz.ui.UserActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    void initView(){
        textView1 = (TextView)findViewById(R.id.textView1);
        textView1 = (TextView)findViewById(R.id.textView2);
        textView1 = (TextView)findViewById(R.id.textView3);
        textView1 = (TextView)findViewById(R.id.textView4);
        textView1 = (TextView)findViewById(R.id.textView5);
        textView1 = (TextView)findViewById(R.id.textView6);

    }

    public void onClick(View view){
        Intent intent = new Intent();
        int id = view.getId();
        switch (id) {
            case R.id.textView1:
                intent.setClass(this, ArizActivity.class);
                break;
            case R.id.textView2:
                intent.setClass(this, CaseActivity.class);
                break;
            case R.id.textView3:
                intent.setClass(this, ApplicateActivity.class);
                break;
            case R.id.textView4:
                intent.setClass(this, BrowseActivity.class);
                break;
            case R.id.textView5:
                intent.setClass(this, FavorateActivity.class);
                break;
            case R.id.textView6:
                intent.setClass(this, UserActivity.class);
                break;
        }
        startActivity(intent);
    }
}
