package com.example.ikbar.locmart;

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
}
