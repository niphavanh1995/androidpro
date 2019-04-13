package com.example.app_fashion;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Pager_Adapter extends FragmentStatePagerAdapter {
    List<Fragment_Item>listFg =new ArrayList<>();
    List<String> title =new ArrayList<>();

    public Pager_Adapter(FragmentManager fm) {
        super(fm);
    }
    public  void addFrag(Fragment_Item fragment_news,String chuoi){
        listFg.add(fragment_news);
        title.add(chuoi);
    }

    @Override
    public Fragment getItem(int i) {
        return listFg.get(i);
    }

    @Override
    public int getCount() {
        return title.size();
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return  title.get(position);
    }
}
