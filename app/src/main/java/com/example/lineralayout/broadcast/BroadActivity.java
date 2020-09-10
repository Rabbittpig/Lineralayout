package com.example.lineralayout.broadcast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lineralayout.R;

public class BroadActivity extends AppCompatActivity {
    private Button mbtn1;
    private TextView tvTest;
    private MyBroadcast myBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad);
        mbtn1 = findViewById(R.id.btn1);
        tvTest = findViewById(R.id.tv_test);
        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BroadActivity.this,BroadActivity2.class);
                startActivity(intent);
            }
        });
        myBroadcast = new MyBroadcast();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.skypan.update");
        LocalBroadcastManager.getInstance(this).registerReceiver(myBroadcast,intentFilter);
    }
    
    private class MyBroadcast extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            switch (intent.getAction()){
                case "com.skypan.update":
                    tvTest.setText("123");
                    break;
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(myBroadcast);
    }
}