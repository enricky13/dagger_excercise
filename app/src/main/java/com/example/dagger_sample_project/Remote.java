package com.example.dagger_sample_project;

import android.util.Log;

import javax.inject.Inject;

class Remote {
    private static final String TAG = "Car";
    @Inject
    public Remote(){}

    void setListener(){
        Log.d(TAG, "setListener: Listener is active");
    }
}
