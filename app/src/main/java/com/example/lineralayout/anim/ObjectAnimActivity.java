package com.example.lineralayout.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.lineralayout.R;

public class ObjectAnimActivity extends AppCompatActivity {
    private TextView tvAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_anim);
        tvAnim = findViewById(R.id.tv);
 /*       //1.沿Y轴平移500个单位,时间为2秒
        tvAnim.animate().translationYBy(500).setDuration(2000).start();*/
    /*    //2.透明渐变的一个效果
        tvAnim.animate().alpha(0).setDuration(2000).start();*/

   /*     ValueAnimator valueAnimator = ValueAnimator.ofInt(0,100);
        valueAnimator.setDuration(2000);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                //valueAnimator 实际的值
                Log.d("aaaa",valueAnimator.getAnimatedValue()+"");
                //动画的进度0-1
                Log.d("aaaa",valueAnimator.getAnimatedFraction()+"");

            }
        });
        valueAnimator.start();*/
   //0,500,200,800  从0开始依次执行
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(tvAnim,"translationY",0,500,200,800);
        //两秒钟
        objectAnimator.setDuration(2000);
        //启用
        objectAnimator.start();
    }
}