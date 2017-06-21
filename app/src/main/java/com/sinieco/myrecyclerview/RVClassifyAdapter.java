package com.sinieco.myrecyclerview;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import java.util.List;

/**
 * Created by BaiMeng on 2017/6/21.
 */
public class RVClassifyAdapter extends RecyclerView.Adapter<RVClassifyAdapter.ViewHolder> {

    private List<List<MyItem>> datas ;
    private Context context ;
    public RVClassifyAdapter(List<List<MyItem>> datas , Context context) {
        this.datas = datas ;
        this.context = context ;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_classify, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
//        holder.tv.setText(datas.get(position).get(0).getTitle());
//        holder.right.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                datas.remove(position);
//                notifyDataSetChanged();
//            }
//        });
        LinearLayoutManager lm = new LinearLayoutManager(context);
        lm.setOrientation(LinearLayoutManager.VERTICAL);
        holder.rv.setLayoutManager(lm);
        holder.rv.setAdapter(new RVClassItemAdapter(context,datas.get(position)));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
//        private TextView tv ;
        private RecyclerView rv ;
//        private LinearLayout right ;
        public ViewHolder(View itemView) {
            super(itemView);
//            tv =(TextView) itemView.findViewById(R.id.tv_content);
            rv = (RecyclerView) itemView.findViewById(R.id.rv_item_classify);
//            right = (LinearLayout) itemView.findViewById(R.id.e_right);
        }
    }
}
