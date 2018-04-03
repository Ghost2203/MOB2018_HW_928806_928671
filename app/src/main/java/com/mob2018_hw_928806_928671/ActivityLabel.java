package com.mob2018_hw_928806_928671;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;


public class ActivityLabel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_label);

        Bundle main2Data = getIntent().getExtras();
        String main2Message = main2Data.getString("main2Message");
        final TextView main2Text = (TextView) findViewById(R.id.main2Text);
        main2Text.setText(main2Message);
    }

}
