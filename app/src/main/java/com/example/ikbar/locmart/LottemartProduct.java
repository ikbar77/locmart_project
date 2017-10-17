package com.example.ikbar.locmart;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by IKBAR on 10/11/2017.
 */

public class LottemartProduct extends Fragment {
    public static LottemartProduct newInstance(){

        return new LottemartProduct();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lottemart_product, container, false);
        return view;
    }
}
