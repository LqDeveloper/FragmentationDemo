package com.example.fragmentationdemo.tools;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import me.yokeyword.fragmentation.Fragmentation;
import me.yokeyword.fragmentation.helper.ExceptionHandler;

public class FragmentionConfig {
    public static void initFragment() {
        Fragmentation.builder()
                // 栈视图模式默悬浮球模式
                // SHAKE摇一摇唤出、NONE隐藏
                // 仅Debug环境生效
                .stackViewMode(Fragmentation.BUBBLE)
                // 测试场景.debug(true)
                // 实际场景.debug(BuildConfig.DEBUG)
                .debug(true)
                // 可获{@link me.yokeyword.fragmentation.exception.AfterSaveStateTransactionWarning}
                // 遇After onSaveInstanceState时不抛异常而是回调到下面ExceptionHandler
                .handleException(new ExceptionHandler() {
                    @Override
                    public void onException(@NonNull Exception e) {

                    }
                }).install();


    }


}
