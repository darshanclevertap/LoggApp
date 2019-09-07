package com.darshan.loggapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.darshan.logg.Logger;

public class MainActivity extends AppCompatActivity {

    static final String TAG = "LogApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger logger = new Logger(Logger.LogLevel.VERBOSE);
        logger.info(TAG, "This is info log");
        logger.debug(TAG, "This is debug log");
        logger.error(TAG,"This is error log");
        logger.verbose(TAG, "This is verbose log");
    }
}
