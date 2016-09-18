package com.jdcasas.lab_4_4_act1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Usuario on 14/09/2016.
 */
public class OnChargeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context ctx, Intent i) {
        Log.d("App", "Recibido!");
        Toast.makeText(ctx, "Ha conectado el cargador.",
                Toast.LENGTH_SHORT).show();
    }
}