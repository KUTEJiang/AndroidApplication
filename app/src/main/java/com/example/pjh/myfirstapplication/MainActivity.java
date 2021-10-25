package com.example.pjh.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button=findViewById(R.id.buttonTest);
        Log.i(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
