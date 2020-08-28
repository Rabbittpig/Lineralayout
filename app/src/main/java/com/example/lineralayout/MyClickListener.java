package com.example.lineralayout;

import android.app.Activity;
import android.view.View;

import com.example.lineralayout.util.ToastUtil;

public class MyClickListener implements View.OnClickListener {
    private Activity mActivity;
    //创建构造方法
    public MyClickListener(Activity activity){
        this.mActivity = activity;

    }
    @Override
    public void onClick(View view) {
        ToastUtil.showMsg(mActivity, "click...");
    }
}
