package com.cat.music.ui.music.playlist.love;

import com.cat.music.bean.Music;
import com.cat.music.ui.base.BaseContract;

import java.util.List;

public interface LoveContract {

    interface View extends BaseContract.BaseView {

        void showSongs(List<Music> songs);

        void showEmptyView();

    }

    interface Presenter extends BaseContract.BasePresenter<View> {

        void loadSongs();

        void clearHistory();
    }
}
