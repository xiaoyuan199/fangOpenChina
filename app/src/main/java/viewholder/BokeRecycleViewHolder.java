package viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.my_openandroid.R;

import org.itheima.recycler.viewholder.BaseRecyclerViewHolder;

import bean.BokeBean;
import butterknife.BindView;

/**
 * Created by Administrator on 2017/11/16 0016.
 */

public class BokeRecycleViewHolder extends BaseRecyclerViewHolder <BokeBean.ResultBean.ItemsBean>{

    //换成你布局文件中的id
    @BindView(R.id.news_title2)
    TextView tv_title;
    @BindView(R.id.news_content2)
    TextView tv_content;
    @BindView(R.id.date_time2)
    TextView tv_time;
    @BindView(R.id.comment2)
    TextView tv_comment;
    @BindView(R.id.pinglun2)
    TextView pinglun;

    public BokeRecycleViewHolder(View itemView) {
        super(itemView);
    }

    public BokeRecycleViewHolder(ViewGroup parentView, int itemResId) {
        super(parentView, itemResId);
    }

    /**
     * 绑定数据的方法，在mData获取数据（mData声明在基类中）
     */
    @Override
    protected void onBindRealData() {

        tv_title.setText(mData.getTitle());
        tv_content.setText(mData.getBody());
        tv_time.setText("作者: "+mData.getAuthor()+"\n"+mData.getPubDate());
        tv_comment.setText("\n"+"评论:"+mData.getCommentCount()+"");
    }
}
