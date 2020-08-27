package com.example.lineralayout.jump;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.lineralayout.R;

public class FirstActivity extends AppCompatActivity {
    private Button mBtnJumpS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        mBtnJumpS = findViewById(R.id.btn_jumpS);
        mBtnJumpS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //显式跳转1
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name","小王");
                bundle.putInt("number",25);
                intent.putExtras(bundle);
//                startActivity(intent);
                startActivityForResult(intent,0);
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
}