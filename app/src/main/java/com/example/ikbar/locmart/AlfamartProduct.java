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

public class AlfamartProduct extends Fragment {
    public static AlfamartProduct newInstance() {
        return new AlfamartProduct();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.alfamart_product, container, false);

        return v;
    }
}
