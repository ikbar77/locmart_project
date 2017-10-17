package com.example.ikbar.locmart;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by IKBAR on 10/11/2017.
 */

public class SectionsPagerAdapterHypermart extends FragmentStatePagerAdapter {
    int numOfTabs;

    public SectionsPagerAdapterHypermart(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HypermartProduct tab1 = new HypermartProduct();
                return tab1;
            case 1:
                HypermartLocation tab2 = new HypermartLocation();
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
