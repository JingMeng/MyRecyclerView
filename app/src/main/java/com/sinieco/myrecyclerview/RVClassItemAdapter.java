package com.sinieco.myrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by BaiMeng on 2017/6/21.
 */
public class RVClassItemAdapter extends RecyclerView.Adapter<RVClassItemAdapter.ViewHolder> {

    private Context context ;
    private List<MyItem> datas = new ArrayList<MyItem>() ;

    public RVClassItemAdapter(Context context, List<MyItem> datas) {
        this.context = context;
        this.datas = datas;
        LogUtils.e(datas.toString());
    }

    @Override
    public RVClassItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LogUtils.i("onCreateViewHolder方法");
        View view = LayoutInflater.from(context).inflate(R.layout.item_classify_inner, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RVClassItemAdapter.ViewHolder holder, int position) {
        LogUtils.i("onBindViewHolder方法");
        LogUtils.e(datas.get(position).getName()+"=================");
        holder.tv.setText(datas.get(position).getName());

    }

    @Override
    public int getItemCount() {
        LogUtils.i("getItemCount方法      "+datas.size());
        return datas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv ;
        public ViewHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.tv_classify);
        }
    }
}
