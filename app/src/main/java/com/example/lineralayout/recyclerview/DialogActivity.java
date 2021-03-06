package com.example.lineralayout.recyclerview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.lineralayout.R;
import com.example.lineralayout.util.ToastUtil;

public class DialogActivity extends AppCompatActivity {
    private Button mBtnDialog1;
    private Button mBtnDialog2;
    private Button mBtnDialog3;
    private Button mBtnDialog4;
    private Button mBtnDialog5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        mBtnDialog1 = findViewById(R.id.btn_dialog1);
        mBtnDialog2 = findViewById(R.id.btn_dialog2);
        mBtnDialog3 = findViewById(R.id.btn_dialog3);
        mBtnDialog4 = findViewById(R.id.btn_dialog4);
        mBtnDialog5 = findViewById(R.id.btn_dialog5);
        OnClick onClick = new OnClick();
        mBtnDialog1.setOnClickListener(onClick);
        mBtnDialog2.setOnClickListener(onClick);
        mBtnDialog3.setOnClickListener(onClick);
        mBtnDialog4.setOnClickListener(onClick);
        mBtnDialog5.setOnClickListener(onClick);
    }
    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
               case R.id.btn_dialog1:
                   AlertDialog.Builder builder = new AlertDialog.Builder(DialogActivity.this);
                    builder.setTitle("请回答")
                           .setMessage("你觉得Android是一种什么样的语言")
                            .setIcon(R.mipmap.username)
                           .setPositiveButton("神奇的语言", new DialogInterface.OnClickListener() {
                               @Override
                               public void onClick(DialogInterface dialogInterface, int i) {
                                   ToastUtil.showMsg(DialogActivity.this,"很好呀");
                               }
                           }).setNeutralButton("还行", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ToastUtil.showMsg(DialogActivity.this,"在思考一下~");
                        }
                    }).setNegativeButton("不神奇", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ToastUtil.showMsg(DialogActivity.this,"怎么可能");
                        }
                    }).show();
                    break;
                case R.id.btn_dialog2:
                    final String[] array2 = new String[]{"男","女"};
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(DialogActivity.this);
                    builder2.setTitle("选择性别")
                            .setItems(array2, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    ToastUtil.showMsg(DialogActivity.this,array2[i]);

                                }
                            }).show();
                    break;
                case R.id.btn_dialog3:
                    final String[] array3 = new String[]{"男","女"};
                    AlertDialog.Builder builder3 = new AlertDialog.Builder(DialogActivity.this);
                    builder3.setTitle("选择性别").setSingleChoiceItems(array3, 0, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ToastUtil.showMsg(DialogActivity.this,array3[i]);
                            dialogInterface.dismiss();
                        }
                    }).setCancelable(false).show();
                    break;
                case R.id.btn_dialog4:
                    final String[] array4 = new String[]{"唱歌","跳舞","写代码"};
                    boolean[] isSelected = new boolean[]{false,false,true};
                    AlertDialog.Builder builder4 = new AlertDialog.Builder(DialogActivity.this);
                    builder4.setTitle("选择兴趣")
                            .setMultiChoiceItems(array4, isSelected, new DialogInterface.OnMultiChoiceClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i, boolean isChecked) {
                                    ToastUtil.showMsg(DialogActivity.this,array4[i]+":"+isChecked);
                                }
                            }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    }).show();
                    break;
                case R.id.btn_dialog5:
                    AlertDialog.Builder builder5 = new AlertDialog.Builder(DialogActivity.this);
                    View view= LayoutInflater.from(DialogActivity.this).inflate(R.layout.layout_dialog,null);
                    EditText etUsername = view.findViewById(R.id.et_username);
                    EditText etPassword = view.findViewById(R.id.et_password);
                    Button btnLogin = view.findViewById(R.id.btn_login);
                    btnLogin.setOnClickListener(new View.OnClickListener() {
                            @Override
                        public void onClick(View view) {
                            //相应操作
                        }
                    });
                    builder5.setTitle("请先登录")
                            .setView(view).show();
                    break;
            }
        }
    }
}