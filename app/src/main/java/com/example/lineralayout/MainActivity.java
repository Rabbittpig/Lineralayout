package com.example.lineralayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lineralayout.datastorage.DataStorageActivity;
import com.example.lineralayout.fragment.ContainerActivity;
import com.example.lineralayout.jump.FirstActivity;

public class MainActivity extends AppCompatActivity {
    private Button mBtnUI;
    private Button mBtnLifeCycle;
    private Button mBtnJump;
    private Button mBtnFragment;
    private Button mBtnEvent,mHandler;
    private Button mBtnData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnUI = findViewById(R.id.btn_ui);
        mBtnLifeCycle = findViewById(R.id.btn_lifecycle);
        mBtnJump = findViewById(R.id.btn_jump);
        mBtnFragment = findViewById(R.id.btn_fragment);
        mBtnEvent = findViewById(R.id.btn_event);
        mHandler = findViewById(R.id.btn_handler);
        mBtnData = findViewById(R.id.btn_data);
        OnClick onClick = new OnClick();
        mBtnUI.setOnClickListener(onClick);
        mHandler.setOnClickListener(onClick);
        mBtnLifeCycle.setOnClickListener(onClick);
        mBtnJump.setOnClickListener(onClick);
        mBtnFragment.setOnClickListener(onClick);
        mBtnEvent.setOnClickListener(onClick);
        mBtnData.setOnClickListener(onClick);
        //动态申请权限
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
    }

    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_ui:
                    intent =new Intent(MainActivity.this, UIActivity.class);
                    break;
                case R.id.btn_lifecycle:
                    intent =new Intent(MainActivity.this, LifeCycleActivity.class);
                    break;
                case R.id.btn_jump:
                    intent =new Intent(MainActivity.this, FirstActivity.class);
                    break;
                case R.id.btn_fragment:
                    intent =new Intent(MainActivity.this, ContainerActivity.class);
                    break;
                case R.id.btn_event:
                    intent =new Intent(MainActivity.this, EventActivity.class);
                    break;
                case R.id.btn_handler:
                    intent =new Intent(MainActivity.this, HandlerActivity.class);
                    break;
                case R.id.btn_data:
                    intent =new Intent(MainActivity.this, DataStorageActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}