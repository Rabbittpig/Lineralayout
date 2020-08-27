package com.example.lineralayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lineralayout.fragment.ContainerActivity;
import com.example.lineralayout.jump.FirstActivity;

public class MainActivity extends AppCompatActivity {
    private Button mBtnUI;
    private Button mBtnLifeCycle;
    private Button mBtnJump;
    private Button mBtnFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnUI = findViewById(R.id.btn_ui);
        mBtnLifeCycle = findViewById(R.id.btn_lifecycle);
        mBtnJump = findViewById(R.id.btn_jump);
        mBtnFragment = findViewById(R.id.btn_fragment);
        OnClick onClick = new OnClick();
        mBtnUI.setOnClickListener(onClick);
        mBtnLifeCycle.setOnClickListener(onClick);
        mBtnJump.setOnClickListener(onClick);
        mBtnFragment.setOnClickListener(onClick);
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
            }
            startActivity(intent);
        }
    }
}