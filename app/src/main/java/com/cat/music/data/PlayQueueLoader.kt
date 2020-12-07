package com.cat.music.data

import com.cat.music.common.Constants
import com.cat.music.data.db.DaoLitepal
import com.cat.music.bean.Music
import org.jetbrains.anko.doAsync

/**
 * 作者：yonglong on 2016/11/4 22:30
 */

object PlayQueueLoader {

    private val TAG = "PlayQueueLoader"

    /**
     * 获取播放队列
     */
    fun getPlayQueue(): List<Music> {
        return DaoLitepal.getMusicList(Constants.PLAYLIST_QUEUE_ID)
    }

    /**
     * 添加歌曲到歌单
     */
    fun updateQueue(musics: List<Music>) {
        doAsync {
            clearQueue()
            musics.forEach {
                DaoLitepal.addToPlaylist(it, Constants.PLAYLIST_QUEUE_ID)
            }
        }
    }

    /**
     * 清空播放列表
     */
    fun clearQueue() {
        try {
            DaoLitepal.clearPlaylist(Constants.PLAYLIST_QUEUE_ID)
        } catch (e: Throwable) {
            e.printStackTrace()
        }
    }
}
