package com.example.lineralayout.jump;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.lineralayout.R;

public class FirstActivity extends AppCompatActivity {
    private Button mBtnJumpS;
    private Button mBtnJump2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.d("FirstActivity","---onCreate---");
        Log.d("FirstActivity","taskid"+getTaskId()+"  ,hash:"+hashCode());
        logTaskName();
        mBtnJumpS = findViewById(R.id.btn_jump);
        mBtnJump2 = findViewById(R.id.jump_2);
        mBtnJump2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this,FirstActivity.class);
                startActivity(intent);
            }
        });
        mBtnJumpS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //显式跳转1
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name","小王");
                bundle.putInt("number",25);
                intent.putExtras(bundle);
                startActivity(intent);
//                startActivityForResult(intent,0);
              /*  //显式跳转2
                Intent intent =new Intent();
                intent.setClass(FirstActivity.this,SecondActivity.class);
                startActivity(intent);*/
           /*   //显示跳转3
                Intent intent = new Intent();
                intent.setClassName(FirstActivity.this,"com.example.lineralayout.jump.SecondActivity");
                startActivity(intent);*/
    /*       //显式跳转4
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(FirstActivity.this,"com.example.lineralayout.jump.SecondActivity"));
                startActivity(intent);*/
          /*   //隐式调用1
                Intent intent = new Intent();
                intent.setAction("com.intent.test.SecondActivity");
                startActivity(intent);*/

            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(FirstActivity.this,data.getExtras().getString("title"),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("FirstActivity","---onNewIntent---");
        Log.d("FirstActivity","taskid"+getTaskId()+"  ,hash:"+hashCode());
        logTaskName();
    }

    private void logTaskName(){
        try {
            ActivityInfo info = getPackageManager().getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
        Log.d("FirstActivity",info.taskAffinity);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}