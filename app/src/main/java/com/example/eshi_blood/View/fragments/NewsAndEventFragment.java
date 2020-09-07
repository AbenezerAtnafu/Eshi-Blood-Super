package com.example.eshi_blood.View.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.eshi_blood.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsAndEventFragment extends Fragment {


    public NewsAndEventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news_and_event, container, false);
    }

}
