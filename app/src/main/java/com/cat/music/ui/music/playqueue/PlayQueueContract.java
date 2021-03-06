package com.cat.music.ui.music.playqueue;

import com.cat.music.bean.Music;
import com.cat.music.ui.base.BaseContract;

import java.util.List;

public interface PlayQueueContract {

    interface View extends BaseContract.BaseView {
        void showSongs(List<Music> songs);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {

        void loadSongs();

        void clearQueue();
    }
}
