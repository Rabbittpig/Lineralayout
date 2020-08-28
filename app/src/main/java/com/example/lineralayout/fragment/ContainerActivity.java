package com.example.lineralayout.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lineralayout.R;

public class ContainerActivity extends AppCompatActivity {
    private AFragment aFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        //实例化AFragment
        aFragment = AFragment.newInstance("我是参数");
        // 把AFragment添加到Activity中,记得调用commit
        getFragmentManager().beginTransaction().add(R.id.fl_container,aFragment,"a").commit();
    }
}