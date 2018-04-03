package com.mob2018_hw_928806_928671;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;
import android.widget.EditText;
import android.util.Log;

public class ActivityMain extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static final String TAG1 = "TAG";
    private static final String TAG2 = "TAG";

    public void onClickToast(View v) {
        Toast.makeText(getApplicationContext(),
                "Benjamin Haberkorn (928806), Glen Wider (928671)", Toast.LENGTH_LONG).show();
        Log.i(TAG1, "Toast Button gedrückt");
    }

    public void onClickIntent(View v) {
        Intent i = new Intent(this, ActivityLabel.class);
        final EditText main2Input = (EditText) findViewById(R.id.main2Input);
        String userMessage = main2Input.getText().toString();
        i.putExtra("main2Message", userMessage);
        startActivity(i);
        Log.i(TAG2, "Intent Button gedrückt. Text: " + userMessage);
    }
}
