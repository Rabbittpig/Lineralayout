package com.example.lineralayout.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lineralayout.R;

public class MyListAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    MyListAdapter(Context context){
        this.mContext = context;
        mLayoutInflater =LayoutInflater.from(context);

    }
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    static class ViewHolder{
        public ImageView  imageView;
        public TextView tvTime,tvTitle,tvContent;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder  =    null;
        if(view ==null){
                view = mLayoutInflater.inflate(R.layout.layout_list_item,null);
                holder = new ViewHolder();
                holder.imageView = view.findViewById(R.id.iv);
                holder.tvTitle = view.findViewById(R.id.tv_title);
                holder.tvTime = view.findViewById(R.id.tv_time);
                holder.tvContent = view.findViewById(R.id.tv_content);
                view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }

        //给控件赋值
        holder.tvTitle.setText("这是标题");
        holder.tvTime.setText("2088-08-08");
        holder.tvContent.setText("这是内容");
        Glide.with(mContext).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1597831250037&di=9d2ad70bed2b9abd16cde40952143e04&imgtype=0&src=http%3A%2F%2Fa1.att.hudong.com%2F05%2F00%2F01300000194285122188000535877.jpg")
                            .into(holder.imageView);
        return view;
    }
}
