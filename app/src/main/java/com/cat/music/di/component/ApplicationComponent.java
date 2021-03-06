package com.cat.music.di.component;

import android.content.Context;

import com.cat.music.di.module.ApplicationModule;
import com.cat.music.di.scope.ContextLife;
import com.cat.music.di.scope.PerApp;
import dagger.Component;


/**
 * Created by lw on 2017/1/19.
 */
@PerApp
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    @ContextLife("Application")
    Context getApplication();
}