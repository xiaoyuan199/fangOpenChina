package com.example.my_openandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;
import android.widget.TextView;

import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.Request;
import com.itheima.retrofitutils.listener.HttpResponseListener;

import bean.BokeDeatailBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Headers;
import okhttp3.ResponseBody;
import retrofit2.Call;

public class BokeDeatailActivity extends AppCompatActivity {

    @BindView(R.id.bokedeatial_title)
    TextView bokedeatial_title;
    @BindView(R.id.bokedeatial_time)
    TextView bokedeatial_time;
    @BindView(R.id.boke_deatial_web)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boke_deatail);
        ButterKnife.bind(this);

        Intent intent=getIntent();
        int id=intent.getIntExtra("id",0);
        requestDeatailContent(id);
    }

    private void requestDeatailContent(int id) {
        Request request = ItheimaHttp.newGetRequest("action/apiv2/blog?id="+id);//apiUrl格式："xxx/xxxxx"
        Call call = ItheimaHttp.send(request, new HttpResponseListener<BokeDeatailBean>() {
            @Override
            public void onResponse(BokeDeatailBean bokedeatail, Headers headers) {

                bokedeatial_title.setText(bokedeatail.getResult().getTitle());
                bokedeatial_time.setText(bokedeatail.getResult().getAuthor()+" "+bokedeatail.getResult().getPubDate());

//                news_deatial_web.loadUrl(deatail.getResult().getHref());
                Log.d("222","8888"+bokedeatail.getResult());
                webView.getSettings().setDefaultTextEncodingName("UTF -8");//设置默认为utf-8
                //news_deatial_web.getSettings().setUseWideViewPort(true);//将图片调整到适合webview的大小
                //news_deatial_web.getSettings().setLoadWithOverviewMode(true);// 缩放至屏幕的大小
                webView.getSettings().setSupportZoom(true); //支持缩放，默认为true。是下面那个的前提。
                // news_deatial_web.getSettings().setDisplayZoomControls(true); //隐藏原生的缩放控件
                webView.getSettings().setLoadsImagesAutomatically(true); //支持自动加载图片
                if((bokedeatail.getResult())!=null){
                    //webView.loadData(data, "text/html", "UTF -8");//API提供的标准用法，无法解决乱码问题
                    webView.loadData(bokedeatail.getResult().getBody(), "text/html; charset=UTF-8", null);//这种写法可以正确解码
                }else {
                    webView.loadData(String.valueOf(bokedeatail), "text/html; charset=UTF-8", null);
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
