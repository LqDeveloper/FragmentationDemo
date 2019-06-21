package com.example.fragmentationdemo;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Barrier;

import com.example.fragmentationdemo.fragment.JudgementFragment;
import com.example.fragmentationdemo.fragment.MainFragment;
import com.example.fragmentationdemo.fragment.OptionalFragment;
import com.example.fragmentationdemo.fragment.PersonalFragment;
import com.example.fragmentationdemo.fragment.RoboFragement;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageNavigationView;
import me.majiajie.pagerbottomtabstrip.item.BaseTabItem;
import me.majiajie.pagerbottomtabstrip.item.NormalItemView;
import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectedListener;
import me.yokeyword.fragmentation.SupportActivity;
import me.yokeyword.fragmentation.SupportFragment;
import me.yokeyword.fragmentation.anim.DefaultHorizontalAnimator;
import me.yokeyword.fragmentation.anim.DefaultVerticalAnimator;
import me.yokeyword.fragmentation.anim.FragmentAnimator;

public class MainActivity extends SupportActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainFragment fragment = MainFragment.newInstance();
        loadRootFragment(R.id.container,fragment);
    }


    @Override
    public FragmentAnimator onCreateFragmentAnimator() {
        // horizontal
        return new DefaultHorizontalAnimator();
    }
}
