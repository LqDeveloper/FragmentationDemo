package com.example.fragmentationdemo.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.fragmentationdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import me.yokeyword.fragmentation.SupportFragment;

public class RoboFragement extends SupportFragment {
    @BindView(R.id.clickm)
    TextView clickm;

    public static RoboFragement newInstance() {

        Bundle args = new Bundle();
        RoboFragement fragment = new RoboFragement();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("MainActivity", "onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_robo, container, false);
        Unbinder unbinder =  ButterKnife.bind(this,rootView);
        Log.e("MainActivity", "onCreateView");
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("MainActivity", "onActivityCreated");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("MainActivity", "onAttach");
    }


    @Override
    public void onStart() {
        super.onStart();
        Log.e("MainActivity", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("MainActivity", "onResume");
    }

    @Override
    public void onSupportVisible() {
        super.onSupportVisible();
        Log.e("MainActivity", "onSupportVisible");
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        Log.e("MainActivity", "onLazyInitView");
    }


    @Override
    public void onEnterAnimationEnd(Bundle savedInstanceState) {
        super.onEnterAnimationEnd(savedInstanceState);
        Log.e("MainActivity", "onEnterAnimationEnd");
    }

    @Override
    public void onSupportInvisible() {
        super.onSupportInvisible();
        Log.e("MainActivity", "onSupportInvisible");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("MainActivity", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("MainActivity", "onStop");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("MainActivity", "onDetach");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("MainActivity", "onDestroyView");
    }

    @OnClick(R.id.clickm)
    public void onViewClicked() {
        DemoFragment demoFragment = DemoFragment.newInstance();
        MainFragment mainFragment = (MainFragment)getParentFragment();
        mainFragment.start(demoFragment);
    }
}
