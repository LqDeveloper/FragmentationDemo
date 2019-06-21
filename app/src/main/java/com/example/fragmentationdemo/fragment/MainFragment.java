package com.example.fragmentationdemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.fragmentationdemo.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageNavigationView;
import me.majiajie.pagerbottomtabstrip.item.BaseTabItem;
import me.majiajie.pagerbottomtabstrip.item.NormalItemView;
import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectedListener;
import me.yokeyword.fragmentation.SupportFragment;

public class MainFragment extends SupportFragment {
    NavigationController navigationController;

    List<SupportFragment> fragments;

    @BindView(R.id.tabBar)
    PageNavigationView tabBar;

    public static MainFragment newInstance() {

        Bundle args = new Bundle();

        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this,rootView);
        initTabBar();
        return rootView;
    }

    private void initTabBar() {
        navigationController = tabBar.custom()
                .addItem(newItem(R.mipmap.roboadviser_normal, R.mipmap.roboadviser_select, "智能投顾"))
                .addItem(newItem(R.mipmap.judgment_normal, R.mipmap.judgment_select, "大势研判"))
                .addItem(newItem(R.mipmap.optional_normal, R.mipmap.optional_select, "自选组合"))
                .addItem(newItem(R.mipmap.persional_normal, R.mipmap.persional_select, "个人中心"))
                .build();

        navigationController.addTabItemSelectedListener(new OnTabItemSelectedListener() {
            @Override
            public void onSelected(int index, int old) {
                showHideFragment(fragments.get(index), fragments.get(old));
            }

            @Override
            public void onRepeat(int index) {

            }
        });

        RoboFragement roboFragement = RoboFragement.newInstance();
        JudgementFragment judgementFragment = JudgementFragment.newInstance();
        OptionalFragment optionalFragment = OptionalFragment.newInstance();
        PersonalFragment personalFragment = PersonalFragment.newInstance();

        fragments = new ArrayList<>();
        fragments.add(roboFragement);
        fragments.add(judgementFragment);
        fragments.add(optionalFragment);
        fragments.add(personalFragment);

        loadMultipleRootFragment(R.id.container, 0, fragments.get(0), fragments.get(1), fragments.get(2), fragments.get(3));

    }

    private BaseTabItem newItem(int drawable, int checkedDrawable, String title) {
        NormalItemView normalItemView = new NormalItemView(getContext());
        normalItemView.initialize(drawable, checkedDrawable, title);
        normalItemView.setTextDefaultColor(getResources().getColor(R.color.tab_unselect));
        normalItemView.setTextCheckedColor(getResources().getColor(R.color.tab_select));
        return normalItemView;
    }
}
