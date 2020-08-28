package com.example.lineralayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lineralayout.util.ToastUtil;

public class EventActivity extends AppCompatActivity {
    private Button mBtnEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        mBtnEvent = findViewById(R.id.btn_event);
  /*      //内部类实现监听
        mBtnEvent.setOnClickListener(new OnClick());*/
        //匿名内部类实现监听
    /*    mBtnEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtil.showMsg(EventActivity.this,"click...");
            }
        });*/
   /* //通过事件源所在类实现
    mBtnEvent.setOnClickListener(EventActivity.this);*/
    /*    //通过外部类实现
        mBtnEvent.setOnClickListener(new MyClickListener(EventActivity.this));*/
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_event:
                ToastUtil.showMsg(EventActivity.this, "click...");
                break;
        }

  /*  //内部类实现监听
    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_event:
                    ToastUtil.showMsg(EventActivity.this,"click...");
                    break;
            }
        }
    }*/

    }
}