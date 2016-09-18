package com.jdcasas.lab_4_4_act2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;

/**
 * Created by Usuario on 17/09/2016.
 */
public class VibrateReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent){
        Vibrator mVibrator =
                (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        mVibrator.vibrate(500);
    }
}
