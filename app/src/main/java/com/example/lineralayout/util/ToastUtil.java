package com.example.lineralayout.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by zwp on 2020/8/4
 * Toast 简单封装
 */

public class ToastUtil {
    public static Toast mToast;
    public static void showMsg(Context context,String msg){
        if(mToast == null){
            mToast = Toast.makeText(context,msg,Toast.LENGTH_LONG);
        }else {
            mToast.setText(msg);
        }
        mToast.show();
    }

}
