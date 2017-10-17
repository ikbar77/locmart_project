package com.example.ikbar.locmart;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by IKBAR on 10/11/2017.
 */

public class SectionsPagerAdapterIndomart extends FragmentStatePagerAdapter {
    int numbOfTabs;

    public SectionsPagerAdapterIndomart(FragmentManager fm, int numbOfTabs){
        super(fm);
        this.numbOfTabs = numbOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                IndomartProduct tab1 = new IndomartProduct();
                return tab1;
            case 1:
                IndomartLocation tab2 = new IndomartLocation();
                return tab2;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return numbOfTabs;
    }
}
