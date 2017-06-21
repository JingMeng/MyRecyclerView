package com.sinieco.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_custom_classify)
    RecyclerView mRvClassify ;

    private List<List<MyItem>> datas ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView(savedInstanceState);
        initData();
        initListener();
    }

    protected void initView(Bundle savedInstanceState) {
        ButterKnife.bind(this);

    }

    protected void initData() {
        datas = new ArrayList<List<MyItem>>();
        for(int j = 0 ; j < 4 ; j++){
            List<MyItem> list = new ArrayList<MyItem>();
            for(int i = 0 ; i < 6 ; i++ ){
                MyItem item = new MyItem();
                switch (j){
                    case 0:
                        item.setTitle("one");
                        break ;
                    case 1:
                        item.setTitle("two");
                        break ;
                    case 2:
                        item.setTitle("three");
                        break;
                    case 3:
                        item.setTitle("four");
                        break ;
                }
                item.setName( "第"+i+"个条目");
                list.add(item);
            }
            datas.add(list) ;
        }

        initRecyclerView();
    }

    private void initRecyclerView() {
        mRvClassify.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        RVClassifyAdapter adapter = new RVClassifyAdapter(datas,this);
        mRvClassify.setAdapter(adapter);
    }


    protected void initListener() {

    }


}
