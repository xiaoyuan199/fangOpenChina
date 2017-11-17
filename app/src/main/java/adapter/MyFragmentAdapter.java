package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.my_openandroid.BokeFragment;
import com.example.my_openandroid.ZixunFragment;

/**
 * Created by Administrator on 2017/11/15 0015.
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {

    private String[] mTitles = new String[]{"资讯", "博客"};

    public MyFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 1) {
            return new BokeFragment();
        } else {
            return new ZixunFragment();
        }

    }


    @Override
    public int getCount() {
        return mTitles.length;
    }
}
