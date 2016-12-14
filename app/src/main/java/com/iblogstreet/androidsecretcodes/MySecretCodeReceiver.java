package com.iblogstreet.androidsecretcodes;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/*
 *  @项目名：  AndroidSecretCodes 
 *  @包名：    com.iblogstreet.androidsecretcodes
 *  @文件名:   MySecretCodeReceiver
 *  @创建者:   Army
 *  @创建时间:  2016/12/14 23:38
 *  @描述：    TODO
 */
public class MySecretCodeReceiver extends BroadcastReceiver{
    private static final String TAG = "MySecretCodeReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Hello World",Toast.LENGTH_SHORT).show();
    }
}
