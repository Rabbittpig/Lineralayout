package com.example.lineralayout.datastorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lineralayout.R;

public class DataStorageActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtnSp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_storage);
        mBtnSp = findViewById(R.id.btn_sharePreferences);
        mBtnSp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.btn_sharePreferences:
                intent = new Intent(DataStorageActivity.this,SharedPreferencesActivity.class);
                break;
        }
        startActivity(intent);
    }
}