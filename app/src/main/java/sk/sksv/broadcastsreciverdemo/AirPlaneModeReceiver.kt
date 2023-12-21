package sk.sksv.broadcastsreciverdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Settings
import android.util.Log

class AirPlaneModeReceiver  :BroadcastReceiver(){

    override fun onReceive(ctx: Context?, intent: Intent?) {
        if(intent?.action == Intent.ACTION_AIRPLANE_MODE_CHANGED){
            val isTurnedOn = Settings.Global.getInt(
                ctx?.contentResolver,
                Settings.Global.AIRPLANE_MODE_ON
            ) != 0
            Log.d("MAIN", "onReceive: Is airplane mode enabled? $isTurnedOn")
        }
    }
}