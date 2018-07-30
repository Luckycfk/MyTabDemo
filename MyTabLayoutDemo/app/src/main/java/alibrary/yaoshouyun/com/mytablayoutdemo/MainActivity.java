package alibrary.yaoshouyun.com.mytablayoutdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fragment> list=new ArrayList<>();
    private String title[]={"哈哈","啦啦啦啦啦啦","嘻","哗哗哗","哔哩哔哩","哈哈哈哈哈哈啊哈哈哈"};
    private MyFragmentAdapter adapter;
    private TabLayout tab;
    private ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab= (TabLayout)findViewById(R.id.tab_goods);
        vp= (ViewPager) findViewById(R.id.vp_goods);
        addTabs(tab);
        //添加完所有tab后调用！！
        Utils.reflex(tab);
        initFragment();
    }

    private void initFragment() {
        BlankFragment blankFragment1=new BlankFragment();
        BlankFragment2 blankFragment2=new BlankFragment2();
        BlankFragment3 blankFragment3=new BlankFragment3();
        BlankFragment3 blankFragment4=new BlankFragment3();
        BlankFragment3 blankFragment5=new BlankFragment3();
        BlankFragment3 blankFragment6=new BlankFragment3();


        list.add(blankFragment1);
        list.add(blankFragment2);
        list.add(blankFragment3);
        list.add(blankFragment4);
        list.add(blankFragment5);
        list.add(blankFragment6);

        adapter=new MyFragmentAdapter(getSupportFragmentManager(),title,list);
        vp.setAdapter(adapter);
        tab.setupWithViewPager(vp);
    }

    public void addTabs(TabLayout tabLayout){
        tabLayout.addTab(tabLayout.newTab().setText("哈哈哈"));
        tabLayout.addTab(tabLayout.newTab().setText("啦啦啦啦啦啦"));
        tabLayout.addTab(tabLayout.newTab().setText("嘻"));
        tabLayout.addTab(tabLayout.newTab().setText("哗哗哗"));
        tabLayout.addTab(tabLayout.newTab().setText("哔哩哔哩"));
        tabLayout.addTab(tabLayout.newTab().setText("哈哈哈哈哈哈啊哈哈哈"));
    }
}
