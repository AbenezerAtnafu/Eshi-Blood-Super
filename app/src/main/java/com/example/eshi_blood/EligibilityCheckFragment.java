package com.example.eshi_blood;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.eshi_blood.R;

import java.util.zip.Inflater;

public class EligibilityCheckFragment extends Fragment {
    View view;
    public EligibilityCheckFragment(){

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.eligibility_check_fragment, container, false);
        return view;
    }
}
