package com.example.lineralayout.datastorage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.backup.SharedPreferencesBackupHelper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lineralayout.R;

public class SharedPreferencesActivity extends AppCompatActivity {
    private EditText mEtName;
    private Button mBtnSave,mBtnShow;
    private TextView mTvContent;
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);
        mSharedPreferences = getSharedPreferences("data",MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();
        mEtName = findViewById(R.id.et_name);
        mBtnSave = findViewById(R.id.btn_save);
        mBtnShow = findViewById(R.id.btn_show);
        mTvContent = findViewById(R.id.tv_content);
        mBtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //获取EditText里面的内容
                mEditor.putString("name",mEtName.getText().toString());
                //提交
                mEditor.apply();
            }
        });
        mBtnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTvContent.setText(mSharedPreferences.getString("name",""));
            }
        });
    }

}