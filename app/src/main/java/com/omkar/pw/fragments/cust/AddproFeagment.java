package com.omkar.pw.fragments.cust;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.omkar.pw.R;


public class AddproFeagment extends Fragment {


    public AddproFeagment() {
        // Required empty public constructor
    }


    public static AddproFeagment newInstance(String param1, String param2) {
        AddproFeagment fragment = new AddproFeagment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_addpro, container, false);
        return v;
    }
}