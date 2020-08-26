package com.example.lineralayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lineralayout.gridview.GridViewActivity;
import com.example.lineralayout.listview.ListViewActivity;
import com.example.lineralayout.recyclerview.DialogActivity;
import com.example.lineralayout.recyclerview.RecyclerviewActivity;
import com.example.lineralayout.recyclerview.ToastActivity;
import com.example.lineralayout.recyclerview.WebViewActivity;
import com.example.lineralayout.util.CustomDialogActivity;
import com.example.lineralayout.util.ProgressActivity;
import com.example.lineralayout.widget.CustomDialog;
import com.example.lineralayout.widget.PopupWindowActivity;

public class UIActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mEditText;
    private Button mBtnRadioButton;
    private Button mCheckBox;
    private Button mImageView;
    private Button mListView;
    private Button mGridView;
    private Button mRecyclerView;
    private Button mWebView;
    private Button mToast;
    private Button mDialog;
    private Button mProgress;
    private Button mCustomDialog;
    private Button mPopupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);

        mBtnTextView = findViewById(R.id.btn_textView);
        mBtnButton = findViewById(R.id.btn_button);
        mEditText = findViewById(R.id.btn_edit);
        mBtnRadioButton = findViewById(R.id.btn_radiobutton);
        mCheckBox = findViewById(R.id.btn_checkbox);
        mImageView = findViewById(R.id.btn_imageView);
        mListView = findViewById(R.id.btn_listView);
        mGridView = findViewById(R.id.btn_gridView);
        mRecyclerView = findViewById(R.id.btn_recyclerView);
        mWebView = findViewById(R.id.btn_webView);
        mToast = findViewById(R.id.btn_toast);
        mDialog = findViewById(R.id.btn_dialog);
        mProgress = findViewById(R.id.btn_progress);
        mCustomDialog = findViewById(R.id.btn_custom_Dialog);
        mPopupWindow = findViewById(R.id.btn_popup_Window);
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
        mWebView.setOnClickListener(onClick);
        mToast.setOnClickListener(onClick);
        mDialog.setOnClickListener(onClick);
        mProgress.setOnClickListener(onClick);
        mCustomDialog.setOnClickListener(onClick);
        mPopupWindow.setOnClickListener(onClick);

    }
    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                //跳转到相应界面
                case R.id.btn_textView:
                    intent = new Intent(UIActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    intent = new Intent(UIActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_edit:
                    intent = new Intent(UIActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    intent = new Intent(UIActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    intent = new Intent(UIActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_imageView:
                    intent = new Intent(UIActivity.this, ImageViewActivity.class);
                    break;
                case R.id.btn_listView:
                    intent = new Intent(UIActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridView:
                    intent = new Intent(UIActivity.this, GridViewActivity.class);
                    break;
                case R.id.btn_recyclerView:
                    intent = new Intent(UIActivity.this, RecyclerviewActivity.class);
                    break;
                case R.id.btn_webView:
                    intent = new Intent(UIActivity.this, WebViewActivity.class);
                    break;
                case R.id.btn_toast:
                    intent = new Intent(UIActivity.this, ToastActivity.class);
                    break;
                case R.id.btn_dialog:
                    intent = new Intent(UIActivity.this, DialogActivity.class);
                    break;
                case R.id.btn_progress:
                    intent = new Intent(UIActivity.this, ProgressActivity.class);
                    break;
                case R.id.btn_custom_Dialog:
                    intent = new Intent(UIActivity.this, CustomDialogActivity.class);
                    break;
                case R.id.btn_popup_Window:
                    intent = new Intent(UIActivity.this, PopupWindowActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}