package com.example.amar97march.fragmentslider;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.ArrayList;
import android.view.Menu;
import android.view.MenuItem;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SimpleFragmentPagerAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize a list of three fragments
        List<Fragment> fragmentList=new ArrayList<Fragment>();
        //Add Three new Fragments to the list
        fragmentList.add(SimpleFragment.newInstance("This"));
        fragmentList.add(SimpleFragment.newInstance("is"));
        fragmentList.add(SimpleFragment.newInstance("Cool"));
        pageAdapter=new SimpleFragmentPagerAdapter(getSupportFragmentManager(),fragmentList);
        ViewPager pager=(ViewPager)findViewById(R.id.pager);
        pager.setAdapter(pageAdapter);
    }

    private class SimpleFragmentPagerAdapter extends FragmentPagerAdapter{
        private List<Fragment> fragments;

        public SimpleFragmentPagerAdapter(FragmentManager fm,List<Fragment> fragments){
            super(fm);
            this.fragments=fragments;
        }
        @Override
        public Fragment getItem(int position){
            return this.fragments.get(position);
        }
        @Override
        public int getCount(){
            return this.fragments.size();
        }
    }
}
