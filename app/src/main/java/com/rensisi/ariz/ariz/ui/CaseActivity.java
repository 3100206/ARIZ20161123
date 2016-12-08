package com.rensisi.ariz.ariz.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.rensisi.ariz.ariz.R;
import com.rensisi.ariz.ariz.activity.CaseContentActivity;
import com.rensisi.ariz.ariz.adapter.CaseAdapter;
import com.rensisi.ariz.ariz.bean.Case;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CaseActivity extends AppCompatActivity {

    ArrayList<Case> mCases;
    List<String> titles;
    List<String> contents;
    int [] caseContentId = { R.string.case1, R.string.case2, R.string.case3, R.string.case4, R.string.case5,
            R.string.case6, R.string.case7, R.string.case8, R.string.case9, R.string.case10,
            R.string.case11, R.string.case12, R.string.case13, R.string.case14, R.string.case15,
            R.string.case16
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case);
        ListView listView = (ListView) findViewById(R.id.listview_caseativity);
        intitBean();
        listView.setAdapter(new CaseAdapter(this, titles));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), CaseContentActivity.class);
                intent.putExtra("id", caseContentId[position]);
                startActivity(intent);
            }
        });
    }

    private void intitBean() {
        String [] array  = getResources().getStringArray(R.array.casetiltle);
        titles = Arrays.asList(array);
    }
}
