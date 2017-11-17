package com.example.my_openandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HeadImageActivity extends AppCompatActivity {

    @BindView(R.id.head_image_time)
    TextView head_image_time;
    @BindView(R.id.head_image_title)
    TextView head_image_title;
    @BindView(R.id.head_image_web)
    WebView head_image_web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_image);
        ButterKnife.bind(this);

        Intent intent=getIntent();
        String URL=intent.getStringExtra("url");

        head_image_title.setText(intent.getStringExtra("tile"));
        head_image_time.setText(intent.getStringExtra("time"));
        requestDeatailContent(URL);


    }

    private void requestDeatailContent(String url) {

        head_image_web.getSettings().setDefaultTextEncodingName("UTF -8");//设置默认为utf-8
        //news_deatial_web.getSettings().setUseWideViewPort(true);//将图片调整到适合webview的大小
        //news_deatial_web.getSettings().setLoadWithOverviewMode(true);// 缩放至屏幕的大小
        head_image_web.getSettings().setSupportZoom(true); //支持缩放，默认为true。是下面那个的前提。
        // news_deatial_web.getSettings().setDisplayZoomControls(true); //隐藏原生的缩放控件
        head_image_web.getSettings().setLoadsImagesAutomatically(true); //支持自动加载图片
        head_image_web.loadUrl(url);


//        Request request = ItheimaHttp.newGetRequest(url);
//
//        Call call = ItheimaHttp.send(request, new HttpResponseListener<BannerBean>() {
//
//            @Override
//            public void onResponse(BannerBean bannerBean, Headers headers) {
//
////                news_deatial_web.loadUrl(deatail.getResult().getHref());
//                //    Log.d("222","8888"+deatail.getResult());
//                head_image_web.getSettings().setDefaultTextEncodingName("UTF -8");//设置默认为utf-8
//                //news_deatial_web.getSettings().setUseWideViewPort(true);//将图片调整到适合webview的大小
//                //news_deatial_web.getSettings().setLoadWithOverviewMode(true);// 缩放至屏幕的大小
//                head_image_web.getSettings().setSupportZoom(true); //支持缩放，默认为true。是下面那个的前提。
//                // news_deatial_web.getSettings().setDisplayZoomControls(true); //隐藏原生的缩放控件
//                head_image_web.getSettings().setLoadsImagesAutomatically(true); //支持自动加载图片
//
//
//            }
//
//            /**
//             * 可以不重写失败回调
//             */
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable e) {
//
//            }
//        });


    }
}
