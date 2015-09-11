package com.example.cl.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.cl.coolweather.service.AutoUpdateService;

/**
 * Created by cl on 2015/9/9.
 */
public class AutoUpdateReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
      context.startService(i);
    }
}
