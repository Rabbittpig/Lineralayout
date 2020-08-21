package com.example.lineralayout.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lineralayout.R;

public class RecyclerviewActivity extends AppCompatActivity {
    private Button mBtnLinear, mBtnHor, mBtnGrid, mBtnPu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        mBtnLinear = findViewById(R.id.btn_linear);
        mBtnHor = findViewById(R.id.hor);
        mBtnPu = findViewById(R.id.btn_pu);
        mBtnGrid = findViewById(R.id.btn_grid);
        mBtnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecyclerviewActivity.this, GridRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnHor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecyclerviewActivity.this, HorRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecyclerviewActivity.this, LinearRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnPu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecyclerviewActivity.this, PuRecyclerViewActivity.class);
                startActivity(intent);
            }
        });

    }
}