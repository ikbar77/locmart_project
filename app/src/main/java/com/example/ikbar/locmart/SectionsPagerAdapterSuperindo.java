package com.example.ikbar.locmart;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by IKBAR on 10/11/2017.
 */

public class SectionsPagerAdapterSuperindo extends FragmentStatePagerAdapter {
    int numOfTabs;

    public SectionsPagerAdapterSuperindo(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                SuperindoProduct tab1 = new SuperindoProduct();
                return tab1;
            case 1:
                SuperindoLocation tab2 = new SuperindoLocation();
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
