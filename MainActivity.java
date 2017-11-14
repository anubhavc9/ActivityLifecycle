package com.example.user.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "myMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG ,"onCreate() is executed");
    }
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "onStart() is executing");

    }

    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume() is executing");
    }

    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause() is executing");
    }

    protected void onStop(){
        super.onStop();
        Log.i(TAG, "onStop() is executing");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "onDestroy() is executing");
    }

    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "onRestart() is executing");
    }
}
