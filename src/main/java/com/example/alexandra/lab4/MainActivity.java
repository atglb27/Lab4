package com.example.alexandra.lab4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends Activity {

    private ArrayList<String> messages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(android.R.id.list);

        this.messages = new ArrayList<String>();
        MyAdapter myAdapter = new MyAdapter(this, messages);

        listView.setAdapter(myAdapter);

        final Button button = (Button) findViewById(R.id.button);

        listView.setTranscriptMode(ListView.TRANSCRIPT_MODE_ALWAYS_SCROLL);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

    }

    public void messageDisplay(View view) {
        // TODO
    }

}