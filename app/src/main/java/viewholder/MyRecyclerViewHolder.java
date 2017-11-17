package viewholder;

import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.my_openandroid.R;

import org.itheima.recycler.viewholder.BaseRecyclerViewHolder;

import bean.NewsBean;
import butterknife.BindView;

/**
 * Created by Administrator on 2017/11/8 0008.
 */

public class MyRecyclerViewHolder extends BaseRecyclerViewHolder <NewsBean.ResultBean.ItemsBean>{
        //换成你布局文件中的id
        @BindView(R.id.news_title)
        TextView tv_title;
        @BindView(R.id.news_content)
        TextView tv_content;
        @BindView(R.id.date_time)
        TextView tv_time;
        @BindView(R.id.comment)
        TextView tv_comment;
        @BindView(R.id.pinglun)
        TextView pinglun;

        public MyRecyclerViewHolder(ViewGroup parentView, int itemResId) {
            super(parentView, itemResId);

        }

        /**
         * 绑定数据的方法，在mData获取数据（mData声明在基类中）
         */
        @Override
        public void onBindRealData() {
            Log.d("111","onBindRealData()");
            tv_title.setText(mData.title);
            tv_content.setText(mData.body);
            tv_time.setText(mData.getPubDate());
            tv_comment.setText(mData.commentCount+"");
        }


        /**
         * 给按钮添加点击事件（button改成你要添加点击事件的id）
         * @param v
         */
//    @OnClick(R.id.button)
//    public void click(View v) {
//    }

}
