package com.bird_brown.receiverapp01;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //Bundleの取得
        Bundle bundle = intent.getExtras();

        //文字列の取得
        String s = bundle.getString("MOJI");

        //トーストの表示
        Toast t = Toast.makeText(context, s, Toast.LENGTH_SHORT);
        t.show();
    }
}
