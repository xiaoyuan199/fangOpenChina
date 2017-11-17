package com.example.my_openandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.itheima.recycler.adapter.BaseLoadMoreRecyclerAdapter;
import org.itheima.recycler.listener.ItemClickSupport;
import org.itheima.recycler.widget.ItheimaRecyclerView;
import org.itheima.recycler.widget.PullToLoadMoreRecyclerView;

import java.util.ArrayList;
import java.util.List;

import bean.BokeBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Headers;
import viewholder.BokeRecycleViewHolder;

/**
 * Created by Administrator on 2017/11/15 0015.
 */

public class BokeFragment extends Fragment {


    PullToLoadMoreRecyclerView pullToLoadMoreRecyclerView;
    String url="action/apiv2/blog?catalog=3&%20pageToken=";

   @BindView(R.id.swipe_refresh_layout2)
    SwipeRefreshLayout swipeRefreshLayout2;
   @BindView(R.id.recycler_view2)
    ItheimaRecyclerView recyclerView2;

   List<BokeBean.ResultBean.ItemsBean> bokeBeanList=new ArrayList<BokeBean.ResultBean.ItemsBean>();
   BokeBean mbokeBean;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_boke, container, false);
        ButterKnife.bind(this, view);

        initData(view);

        //开始请求
        pullToLoadMoreRecyclerView.requestData();
        return view ;
    }

    private void initData(View view) {
/////////
        pullToLoadMoreRecyclerView = new PullToLoadMoreRecyclerView<BokeBean>(swipeRefreshLayout2, recyclerView2, BokeRecycleViewHolder.class) {
            @Override
            public int getItemResId() {
                //recylerview item资源id
                return R.layout.boke_item;
            }

            @Override
            public String getApi() {
                //接口
                return url;
            }

            //是否加载更多的数据，根据业务逻辑自行判断，true表示有更多的数据，false表示没有更多的数据，如果不需要监听可以不重写该方法
            @Override
            public boolean isMoreData(BaseLoadMoreRecyclerAdapter.LoadMoreViewHolder holder) {
                System.out.println("isMoreData" + holder);

                return true;
            }
        };
//////
        pullToLoadMoreRecyclerView.setLoadingDataListener(new PullToLoadMoreRecyclerView.LoadingDataListener<BokeBean>() {

            @Override
            public void onRefresh() {
                //监听下啦刷新，如果不需要监听可以不重新该方法

            }



            @Override
            public void onSuccess(BokeBean bokeBeanBean , Headers headers) {
                //监听http请求成功，如果不需要监听可以不重新该方法
                super.onSuccess(bokeBeanBean, headers);
                mbokeBean=bokeBeanBean;
                List<BokeBean.ResultBean.ItemsBean>  itemsBeans=bokeBeanBean.getItemDatas();
                bokeBeanList.addAll(itemsBeans);
            }

        });

//////

        ItemClickSupport itemClickSupport = new ItemClickSupport(recyclerView2);
       //点击事件
        itemClickSupport.setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                int id=bokeBeanList.get(position).getId();
                Intent intent=new Intent(getActivity(),BokeDeatailActivity.class);
                intent.putExtra("id",id);
                startActivity(intent);
            }
        });

    }




}
