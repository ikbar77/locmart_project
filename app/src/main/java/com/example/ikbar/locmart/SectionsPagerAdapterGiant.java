package com.example.ikbar.locmart;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by IKBAR on 10/10/2017.
 */

public class SectionsPagerAdapterGiant extends FragmentStatePagerAdapter {
    int numOfTabs;

    public SectionsPagerAdapterGiant(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                GiantProduct tab1 = new GiantProduct();
                return tab1;
            case 1:
                GiantLocation tab2 = new GiantLocation();
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
