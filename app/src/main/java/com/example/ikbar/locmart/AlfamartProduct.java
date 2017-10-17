package com.example.ikbar.locmart;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class AlfamartProduct extends Fragment {
    EditText search_alfa;
    Spinner spinner;
    public static AlfamartProduct newInstance() {
        return new AlfamartProduct();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.alfamart_product, container, false);

        spinner = (Spinner) v.findViewById(R.id.spinner_alfa);
        search_alfa = (EditText) v.findViewById(R.id.search_alfa);

        List<String> categories = new ArrayList<>();
        categories.add("Food");
        categories.add("Drink");
        categories.add("Cigarette");
        categories.add("Healthy & Beauty");
        categories.add("Household Appliance");
        categories.add("Toys");
        categories.add("Stationary");
        categories.add("Mom & Kids");

        //creat adapter spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(v.getContext(), android.R.layout.simple_spinner_dropdown_item, categories);

        //dropdown layout style
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        search_alfa.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        return v;
    }

}
