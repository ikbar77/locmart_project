package com.example.ikbar.locmart;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by IKBAR on 10/8/2017.
 */

public class SectionsPagerAdapter extends FragmentStatePagerAdapter {
    int numOfTabs;

    public SectionsPagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                AlfamartProduct tab1 = new AlfamartProduct();
                return tab1;
            case 1:
                AlfamartLocation tab2 = new AlfamartLocation();
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
