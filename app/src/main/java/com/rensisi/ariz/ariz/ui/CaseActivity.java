package com.rensisi.ariz.ariz.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.rensisi.ariz.ariz.R;
import com.rensisi.ariz.ariz.bean.Case;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CaseActivity extends AppCompatActivity {

    ArrayList<Case> mCases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case);
        ListView listView = (ListView) findViewById(R.id.listview_caseativity);
        intitBean();
//        listView.setAdapter(n );
    }

    private void intitBean() {
//        ArrayList<String> tiles = (ArrayList<String>) Arrays.asList(getResources().getStringArray(R.array.casetiltle));
        String [] array  = getResources().getStringArray(R.array.casetiltle);

    }
}
