package com.rensisi.ariz.ariz.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.rensisi.ariz.ariz.R;

public class CaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case);
        ListView listView = (ListView) findViewById(R.id.listview_caseativity);
//        listView.setAdapter(n );
    }
}
