package com.vinit.capacitor.intent;

import android.util.Log;

public class CapacitorIntent {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
