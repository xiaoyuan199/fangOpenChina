package com.example.my_openandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;
import android.widget.TextView;

import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.Request;
import com.itheima.retrofitutils.listener.HttpResponseListener;

import bean.Deatail;
import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Headers;
import okhttp3.ResponseBody;
import retrofit2.Call;

/**
 * Created by Administrator on 2017/11/8 0008.
 */

public class DeatailActivity extends AppCompatActivity {


    @BindView(R.id.news_deatial_web)
    WebView news_deatial_web;
    @BindView(R.id.deatial_title)
    TextView title;
    @BindView(R.id.deatial_time)
    TextView time;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deatail_avtivity);
         ButterKnife.bind(this);

        Intent intent=getIntent();
        int id=intent.getIntExtra("id",0);
        String body=intent.getStringExtra("body");
        requestDeatailContent(id,body);
    }

    private void requestDeatailContent(int id, final String body) {
        Request request = ItheimaHttp.newGetRequest("action/apiv2/news?id="+id);//apiUrl格式："xxx/xxxxx"
        Call call = ItheimaHttp.send(request, new HttpResponseListener<Deatail>() {
            @Override
            public void onResponse(Deatail deatail, Headers headers) {

                title.setText(deatail.getResult().getTitle());
                time.setText(deatail.getResult().getPubDate());

//                news_deatial_web.loadUrl(deatail.getResult().getHref());
                Log.d("222","8888"+deatail.getResult());
                news_deatial_web.getSettings().setDefaultTextEncodingName("UTF -8");//设置默认为utf-8
                //news_deatial_web.getSettings().setUseWideViewPort(true);//将图片调整到适合webview的大小
                //news_deatial_web.getSettings().setLoadWithOverviewMode(true);// 缩放至屏幕的大小
                news_deatial_web.getSettings().setSupportZoom(true); //支持缩放，默认为true。是下面那个的前提。
               // news_deatial_web.getSettings().setDisplayZoomControls(true); //隐藏原生的缩放控件
                news_deatial_web.getSettings().setLoadsImagesAutomatically(true); //支持自动加载图片
                if((deatail.getResult())!=null){
                    //webView.loadData(data, "text/html", "UTF -8");//API提供的标准用法，无法解决乱码问题
                    news_deatial_web.loadData(deatail.getResult().getBody(), "text/html; charset=UTF-8", null);//这种写法可以正确解码
                }else {
                    news_deatial_web.loadData(body, "text/html; charset=UTF-8", null);
                }



            }

            /**
             * 可以不重写失败回调
             */
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable e) {

            }
        });

    }
}
