package com.example.lineralayout.broadcast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lineralayout.R;

public class BroadActivity2 extends AppCompatActivity {
    private Button mBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad2);
        mBtn2 = findViewById(R.id.btn2);
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.skypan.update");
                LocalBroadcastManager.getInstance(BroadActivity2.this).sendBroadcast(intent);
            }
        });
    }

}