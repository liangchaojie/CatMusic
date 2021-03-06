package com.cat.music.ui.music.local.fragment;

import android.content.Context;
import android.content.Intent;

import com.cat.music.common.NavigationHelper;
import com.cat.music.ui.base.BaseActivity;
import com.cat.music.R;

/**
 * Created by Monkey on 2015/6/29.
 */
public class LocalMusicActivity extends BaseActivity {

    public static void newInstance(Context context) {
        Intent intent = new Intent(context, LocalMusicActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected int getLayoutResID() {
        return R.layout.include_main;
    }

    @Override
    protected String setToolbarTitle() {
        return getResources().getString(R.string.local_music);
    }

    @Override
    protected void initView() {
        NavigationHelper.INSTANCE.navigateToLocalMusic(this, null);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initInjector() {

    }

}
