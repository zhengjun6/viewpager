package com.example.administrator.viewpager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Administrator on 2016/5/19.
 */
public class adapter extends FragmentPagerAdapter {
    private Context context;
    private List<Fragment> list;
    public adapter(FragmentManager f, List<Fragment> list, Context context){
super(f);
       this.list=list;
     this.context=context;
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

//    @Override
//    public Object instantiateItem(ViewGroup container, int position) {
//        container.addView(list.get(position));
//        return list.get(position);
//    }
//
//    @Override
//    public void destroyItem(ViewGroup container, int position, Object object) {
//
//        super.destroyItem(container, position, object);
//        container.removeView(list.get(position));
//    }
        @Override
    public Fragment getItem(int position) {
        Toast.makeText(context,"gg"+list.size(),Toast.LENGTH_SHORT).show();
        return list.get(position);
    }

//    @Override
//    public boolean isViewFromObject(View view, Object object) {
//        return view==object;
//    }
}
