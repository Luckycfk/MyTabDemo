package alibrary.yaoshouyun.com.mytablayoutdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by wmj on 2017/6/26.
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {
    private String []title;
    private List<Fragment> list;

    public MyFragmentAdapter(FragmentManager fm, String[] title, List<Fragment> list) {
        super(fm);
        this.title = title;
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
