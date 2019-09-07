package com.darshan.logg;

import android.util.Log;

public final class Logger {

    public enum LogLevel{
        OFF(-1),
        INFO(0),
        DEBUG(2),
        ERROR(3),
        VERBOSE(4);

        private final int value;

        LogLevel(final int newValue) {
            value = newValue;
        }

        public int intValue() { return value; }
    }

    private int debugLevel;

    private int getDebugLevel() {
        return debugLevel;
    }

    public Logger(int level){
        this.debugLevel = level;
    }

    public Logger(LogLevel logLevel){
        this.debugLevel = logLevel.intValue();
    }


    public void debug(String tag, String message){
        if(getDebugLevel() > LogLevel.INFO.intValue()) {
            if (message.length() > 4000) {
                Log.d(tag, message.substring(0, 4000));
                debug(tag, message.substring(4000));
            } else {
                Log.d(tag, message);
            }
        }
    }

    public void debug(String tag, String message, Throwable throwable){
        if(getDebugLevel() > LogLevel.INFO.intValue()){
            if (message.length() > 4000) {
                Log.d(tag, message.substring(0, 4000), throwable);
                debug(tag, message.substring(4000), throwable);
            } else {
                Log.d(tag, message, throwable);
            }
        }
    }

    public void verbose(String tag, String message){
        if(getDebugLevel() > LogLevel.ERROR.intValue()){
            if(message.length() > 4000){
                Log.v(tag, message.substring(0,4000));
                verbose(tag,message.substring(4000));
            }else {
                Log.v(tag, message);
            }
        }
    }

    public void verbose(String tag, String message, Throwable throwable){
        if(getDebugLevel() > LogLevel.ERROR.intValue()){
            if(message.length() > 4000){
                Log.v(tag, message.substring(0,4000), throwable);
                verbose(tag,message.substring(4000), throwable);
            }else {
                Log.v(tag, message, throwable);
            }
        }
    }

    public void info(String tag, String message){
        if(getDebugLevel() >= LogLevel.INFO.intValue()) {
            if (message.length() > 4000) {
                Log.i(tag, message.substring(0, 4000));
                info(tag, message.substring(4000));
            } else {
                Log.i(tag, message);
            }
        }
    }

    public void info(String tag, String message, Throwable throwable){
        if(getDebugLevel() >= LogLevel.INFO.intValue()){
            if (message.length() > 4000) {
                Log.i(tag, message.substring(0, 4000), throwable);
                info(tag, message.substring(4000), throwable);
            } else {
                Log.i(tag, message, throwable);
            }
        }
    }

    public void error(String tag, String message){
        if(getDebugLevel() > LogLevel.DEBUG.intValue()) {
            if (message.length() > 4000) {
                Log.e(tag, message.substring(0, 4000));
                error(tag, message.substring(4000));
            } else {
                Log.e(tag, message);
            }
        }
    }

    public void error(String tag, String message, Throwable throwable){
        if(getDebugLevel() >= LogLevel.DEBUG.intValue()){
            if (message.length() > 4000) {
                Log.e(tag, message.substring(0, 4000), throwable);
                error(tag, message.substring(4000), throwable);
            } else {
                Log.e(tag, message, throwable);
            }
        }
    }


}
