package com.example.ikbar.locmart;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by IKBAR on 10/11/2017.
 */

public class SectionsPagerAdapterLottemart extends FragmentStatePagerAdapter {
    int numOfTabs;

    public SectionsPagerAdapterLottemart(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                LottemartProduct tab1 = new LottemartProduct();
                return tab1;
            case 1:
                LottemartLocation tab2 = new LottemartLocation();
                return tab2;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
