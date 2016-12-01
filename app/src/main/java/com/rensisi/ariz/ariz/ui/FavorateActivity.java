package com.rensisi.ariz.ariz.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.rensisi.ariz.ariz.R;
import com.rensisi.ariz.ariz.activity.FavoriteCaseActivity;
import com.rensisi.ariz.ariz.activity.FavoteKnowledgeActivity;

public class FavorateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorate);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button casebutton = (Button)findViewById(R.id.bt_favo_case);
        casebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplication(), FavoriteCaseActivity.class);
                startActivity(intent);
            }
        });

        Button knowledgebutton = (Button)findViewById(R.id.bt_favo_know);
        knowledgebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplication(), FavoteKnowledgeActivity.class);
                startActivity(intent);
            }
        });



    }

}
