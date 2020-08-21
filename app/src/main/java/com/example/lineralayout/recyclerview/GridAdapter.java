package com.example.lineralayout.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lineralayout.R;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.LinearViewHolder>{

    private Context mContext;
//    private List<String> list;
    private OnItemClickListener mListener;

    public GridAdapter(Context context, OnItemClickListener listener){
        this.mContext = context;
        this.mListener = listener;
    }
    @Override
    public GridAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_grid_recyclerview_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GridAdapter.LinearViewHolder holder, final int position) {
        holder.textView.setText("Fighting!");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             mListener.onClick(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 80;
    }
    class LinearViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;


            public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
        }
    }

    public interface OnItemClickListener{
        void onClick(int pos);

    }
}
