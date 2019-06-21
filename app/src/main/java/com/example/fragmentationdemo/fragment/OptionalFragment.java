package com.example.fragmentationdemo.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.fragmentationdemo.R;

import me.yokeyword.fragmentation.SupportFragment;

public class OptionalFragment extends SupportFragment {
    public static OptionalFragment newInstance() {

        Bundle args = new Bundle();

        OptionalFragment fragment = new OptionalFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_optional,container,false);
        return view;
    }

}
