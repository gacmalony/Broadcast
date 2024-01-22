package com.example.broadcastreceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirplaneModeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction() != null && intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED) )
        {
            boolean isAirplaneMood = intent.getBooleanExtra("state", false);

            String msg = isAirplaneMood ? "Airplane mood is on" : "Airplane mood is of";
            Toast.makeText(context, ""+msg, Toast.LENGTH_SHORT).show();
        }
    }
}
