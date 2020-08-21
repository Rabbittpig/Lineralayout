package com.example.lineralayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.lineralayout.gridview.GridViewActivity;
import com.example.lineralayout.listview.ListViewActivity;
import com.example.lineralayout.recyclerview.RecyclerviewActivity;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mEditText;
    private Button mBtnRadioButton;
    private Button mCheckBox;
    private Button mImageView;
    private Button mListView;
    private Button mGridView;
    private Button mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = findViewById(R.id.btn_textView);
        mBtnButton = findViewById(R.id.btn_button);
        mEditText = findViewById(R.id.btn_edit);
        mBtnRadioButton = findViewById(R.id.btn_radiobutton);
        mCheckBox = findViewById(R.id.btn_checkbox);
        mImageView = findViewById(R.id.btn_imageView);
        mListView = findViewById(R.id.btn_listView);
        mGridView = findViewById(R.id.btn_gridView);
        mRecyclerView = findViewById(R.id.btn_recyclerView);
        setListeners();
    }

    private void setListeners(){
        OnClick onClick = new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mEditText.setOnClickListener(onClick);
        mCheckBox.setOnClickListener(onClick);
        mImageView.setOnClickListener(onClick);
        mListView.setOnClickListener(onClick);
        mGridView.setOnClickListener(onClick);
        mRecyclerView.setOnClickListener(onClick);

    }
    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                //跳转到相应界面
                case R.id.btn_textView:
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    intent = new Intent(MainActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_edit:
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_imageView:
                    intent = new Intent(MainActivity.this, ImageViewActivity.class);
                    break;
                case R.id.btn_listView:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridView:
                    intent = new Intent(MainActivity.this, GridViewActivity.class);
                    break;
                case R.id.btn_recyclerView:
                    intent = new Intent(MainActivity.this, RecyclerviewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}