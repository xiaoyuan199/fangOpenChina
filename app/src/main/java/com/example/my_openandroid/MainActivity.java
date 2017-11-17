package com.example.my_openandroid;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import adapter.MyFragmentAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.container)
    ViewPager viewPagerContainer;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tabs)
    TabLayout tabLayout;
    @BindView(R.id.appbar)
    AppBarLayout appBarLayout;

    private MyFragmentAdapter myFragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

       initViews();

    }

    private void initViews() {

        setSupportActionBar(toolbar);
        myFragmentPagerAdapter=new MyFragmentAdapter(getSupportFragmentManager());
       viewPagerContainer.setAdapter(myFragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPagerContainer);

    }


}
