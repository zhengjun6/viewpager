package com.example.administrator.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private LinearLayout linearLayout;
    private adapter adapter;
    private FrameLayout frameLayout;
  private List<Fragment> list;
    private ImageView i1,i2,i3,i4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
      i1=(ImageView)findViewById(R.id.i1);
        i2=(ImageView)findViewById(R.id.i2);
        i3=(ImageView)findViewById(R.id.i3);
        i4=(ImageView)findViewById(R.id.i4);
     i1.setBackgroundResource(R.drawable.buddy_online);
        list=new ArrayList<>();
//
//        View view= LayoutInflater.from(this).inflate(R.layout.fr1,null);
//        View view1= LayoutInflater.from(this).inflate(R.layout.fr2,null);
//        View view2= LayoutInflater.from(this).inflate(R.layout.fr1,null);
//        View vie3= LayoutInflater.from(this).inflate(R.layout.fr2,null);
//        list.add(view);
//        list.add(view1);
//        list.add(view2);
//        list.add(vie3);

        list.add(new fr1());
        list.add(new fr2());
        list.add(new fr1());
        list.add(new fr2());
        adapter=new adapter(getSupportFragmentManager(),list,this);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);
      viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
          @Override
          public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

          }

          @Override
          public void onPageSelected(int position) {
              switch (position){
                  case 0:
                      i1.setBackgroundResource(R.drawable.buddy_online);
                      i2.setBackgroundResource(R.drawable.buddy_offline);
                      i3.setBackgroundResource(R.drawable.buddy_offline);
                      i4.setBackgroundResource(R.drawable.buddy_offline);
                      break;
                  case 1:
                      i2.setBackgroundResource(R.drawable.buddy_online);
                      i1.setBackgroundResource(R.drawable.buddy_offline);
                      i3.setBackgroundResource(R.drawable.buddy_offline);
                      i4.setBackgroundResource(R.drawable.buddy_offline);
                      break;
                  case 2:
                      i3.setBackgroundResource(R.drawable.buddy_online);
                      i2.setBackgroundResource(R.drawable.buddy_offline);
                      i1.setBackgroundResource(R.drawable.buddy_offline);
                      i4.setBackgroundResource(R.drawable.buddy_offline);
                      break;
                  case 3:
                      i4.setBackgroundResource(R.drawable.buddy_online);
                      i2.setBackgroundResource(R.drawable.buddy_offline);
                      i3.setBackgroundResource(R.drawable.buddy_offline);
                      i1.setBackgroundResource(R.drawable.buddy_offline);
                      break;

              }
          }

          @Override
          public void onPageScrollStateChanged(int state) {

          }
      });
    }
}
