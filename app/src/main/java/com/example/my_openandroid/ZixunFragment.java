package com.example.my_openandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itheima.loopviewpager.LoopViewPager;
import com.itheima.loopviewpager.listener.OnItemClickListener;
import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.Request;
import com.itheima.retrofitutils.listener.HttpResponseListener;

import org.itheima.recycler.adapter.BaseLoadMoreRecyclerAdapter;
import org.itheima.recycler.header.RecyclerViewHeader;
import org.itheima.recycler.listener.ItemClickSupport;
import org.itheima.recycler.widget.ItheimaRecyclerView;
import org.itheima.recycler.widget.PullToLoadMoreRecyclerView;

import java.util.ArrayList;
import java.util.List;

import bean.BannerBean;
import bean.NewsBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Headers;
import okhttp3.ResponseBody;
import retrofit2.Call;
import viewholder.MyRecyclerViewHolder;

/**
 * Created by Administrator on 2017/11/15 0015.
 */

public class ZixunFragment extends Fragment {

    PullToLoadMoreRecyclerView mpullToLoadMoreRecyclerView;

    //  ItheimaRecyclerView mRecyclerView;

//    @BindView(R.id.swipe_refresh_layout)
//    SwipeRefreshLayout mSwipeRefreshLayout;
//    @BindView(R.id.recycler_view)
//    ItheimaRecyclerView mRecyclerView;
    @BindView(R.id.swipe_refresh_layout)
    SwipeRefreshLayout mSwipeRefreshLayout;
    @BindView(R.id.recycler_view)
    ItheimaRecyclerView mRecyclerView;

    private LoopViewPager loopViewPager;
    List<String> image_list=new ArrayList<>();
    List<String>  text_list=new ArrayList<>();

    List<NewsBean.ResultBean.ItemsBean> itemsResult=new ArrayList();
    NewsBean mnewsBean;

    private int state=0;
    private static final int STATE_REFRESH=1;
    private  static  final  int STATE_MORE=2;
    private String nextPageToken="";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_zixun, container, false);
        ButterKnife.bind(this, view);

        //轮播图片头
        RecyclerViewHeader header = (RecyclerViewHeader)view.findViewById(R.id.recycler_header);
        // mRecyclerView = (ItheimaRecyclerView) findViewById(R.id.recycler_view);
        header.attachTo(mRecyclerView);

        //网络请求轮播图的资源
        initBanner(view);

        // 给RecyclerView的item添加点击事件
        ItemClickSupport itemClickSupport = new ItemClickSupport(mRecyclerView);
        //点击事件
        itemClickSupport.setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {

                int id=itemsResult.get(position).getId();
                Log.d("222","8888"+itemsResult.get(position).getTitle()+"\n"+itemsResult.get(position).author+"\n"+itemsResult.get(position).getBody()+itemsResult.get(position).id);
                Intent intent=new Intent(getActivity(),DeatailActivity.class);
                intent.putExtra("id",id);
                intent.putExtra("body",itemsResult.get(position).body);
                startActivity(intent);

            }
        });

        //  下啦刷新View
        mpullToLoadMoreRecyclerView = new PullToLoadMoreRecyclerView<NewsBean>(mSwipeRefreshLayout, mRecyclerView, MyRecyclerViewHolder.class) {
            @Override
            public int getItemResId() {
                //recylerview item资源id
                return R.layout.news_item;
            }

            @Override
            public String getApi() {

                String url= "action/apiv2/news?pageToken=";

                //接口
                switch (state){
                    case STATE_MORE:
                        nextPageToken=mnewsBean.result.nextPageToken;
                        url+=nextPageToken;
                        break;
                    case STATE_REFRESH:

                        break;
                }
                return url;
            }

            //是否加载更多的数据，根据业务逻辑自行判断，true表示有更多的数据，false表示没有更多的数据，如果不需要监听可以不重写该方法
            @Override
            public boolean isMoreData(BaseLoadMoreRecyclerAdapter.LoadMoreViewHolder holder) {
                System.out.println("isMoreData" + holder);
                state=STATE_MORE;
                return true;
            }
        };

        mpullToLoadMoreRecyclerView.setLoadingDataListener(new PullToLoadMoreRecyclerView.LoadingDataListener<NewsBean>(){

            //监听下啦刷新，如果不需要监听可以不重新该方法
            @Override
            public void onRefresh() {
                super.onRefresh();
                state=STATE_REFRESH;
            }
            ///监听http请求成功，如果不需要监听可以不重新该方法
            @Override
            public void onSuccess(NewsBean newsBean, Headers headers) {
                super.onSuccess(newsBean, headers);

                mnewsBean=newsBean;
                List<NewsBean.ResultBean.ItemsBean> items=newsBean.getItemDatas();
                itemsResult.addAll(items);
            }
        });

        //开始网络请求数据
        mpullToLoadMoreRecyclerView.requestData();

       return view;
    }

    //网络请求轮播图的资源
    private void initBanner(View view) {

        loopViewPager = (LoopViewPager)view.findViewById(R.id.lvp_pager);


        Request request = ItheimaHttp.newGetRequest("action/apiv2/banner?catalog=1");//apiUrl格式："xxx/xxxxx"
        Call call = ItheimaHttp.send(request, new HttpResponseListener<BannerBean>() {

            @Override
            public void onResponse(BannerBean bannerBean, okhttp3.Headers headers) {

                final List<BannerBean.ResultBean.ItemsBean> itemdata=bannerBean.getItemDatas();
                for (int i=0;i<itemdata.size();i++){
                    image_list.add(itemdata.get(i).getImg());
                    text_list.add(itemdata.get(i).getName());
                }

                loopViewPager.setImgData(image_list);
                loopViewPager.setTitleData(text_list);

                loopViewPager.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int i) {
//                        String url=itemdata.get(i).getHref();
                        Log.d("333",i+"--");
                       // Log.d("333",itemdata.get(i-1)+"--");
//                        String tile=itemdata.get(i).getName();
//                        String time=itemdata.get(i).getPubDate();
//                        Intent intent=new Intent(getActivity(),HeadImageActivity.class);
//                        intent.putExtra("url",url);
//                        intent.putExtra("tile",tile);
//                        intent.putExtra("time",time);
//                        startActivity(intent);
                    }
                });
                loopViewPager.start();
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable e) {

            }
        });

    }


}
