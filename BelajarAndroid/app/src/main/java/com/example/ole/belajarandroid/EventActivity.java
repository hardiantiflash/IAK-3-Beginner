package com.example.ole.belajarandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by ole on 22/11/2016.
 */

public class EventActivity extends AppCompatActivity {
    Button button4 = (Button) findViewById(R.id.button4);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
    }
}
