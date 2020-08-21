package com.example.lineralayout.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lineralayout.R;

public class MyGridViewAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    public MyGridViewAdapter(Context context){
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
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
        public ImageView imageView;
        public TextView textView;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if(view ==null){
            view = mLayoutInflater.inflate(R.layout.layout_grid_item,null);
            holder = new ViewHolder();
            holder.imageView = view.findViewById(R.id.iv_grid);
            holder.textView = view.findViewById(R.id.tv_title);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        //赋值
        holder.textView.setText("花");
        Glide.with(mContext)
                .load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1597917273148&di=475cd88ed5dff33dacaeaa1738516b93&imgtype=0&src=http%3A%2F%2Fpic.qjimage.com%2Fmhrf006%2Fhigh%2Fmhrf-cpmh-87674f10z.jpg")
                .into(holder.imageView);
        return view;
    }
}
