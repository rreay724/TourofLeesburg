package com.example.android.tourofleesburg;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TownInfoFragment();
        }else{
            return  new HistoricalSitesFragment();
        }
    }

    @Override
    public int getCount(){
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position){
        if (position == 0) {
            return mContext.getString(R.string.category_history);
        }else{
            return mContext.getString(R.string.category_sites);
        }
    }


}
