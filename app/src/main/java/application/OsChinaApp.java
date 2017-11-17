package application;

import android.app.Application;

import com.itheima.retrofitutils.ItheimaHttp;

/**
 * Created by Administrator on 2017/11/8 0008.
 */

public class OsChinaApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ItheimaHttp.init(this, "http://www.oschina.net/");
    }
}
