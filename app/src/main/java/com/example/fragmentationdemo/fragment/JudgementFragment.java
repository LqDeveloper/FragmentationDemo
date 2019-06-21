package com.example.fragmentationdemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.fragmentationdemo.R;

import me.yokeyword.fragmentation.SupportFragment;


public class JudgementFragment extends SupportFragment {
    public static JudgementFragment newInstance() {

        Bundle args = new Bundle();

        JudgementFragment fragment = new JudgementFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_judgement, container, false);
        return rootView;
    }
}
