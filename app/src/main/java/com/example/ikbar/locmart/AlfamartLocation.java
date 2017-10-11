package com.example.ikbar.locmart;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by IKBAR on 10/8/2017.
 */

public class AlfamartLocation extends Fragment {
    public static AlfamartLocation newInstance(){
        return new AlfamartLocation();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.alfamart_location, container, false);

        return v;
    }
}
