package com.cat.music.ui.music.discover;

import com.cat.music.utils.CoverLoader;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.cat.music.R;
import com.cat.music.bean.Playlist;

import java.util.List;

/**
 * 作者：yonglong on 2016/8/10 21:36
 * 邮箱：643872807@qq.com
 * 版本：2.5
 */
public class BaiduRadioAdapter extends BaseQuickAdapter<Playlist, BaseViewHolder> {

    public BaiduRadioAdapter(List<Playlist> list) {
        super(R.layout.item_top_list, list);
    }

    @Override
    protected void convert(BaseViewHolder helper, Playlist channel) {
        helper.setText(R.id.title, channel.getName());
        helper.setVisible(R.id.title, true);
        CoverLoader.INSTANCE.loadImageView(mContext, channel.getCoverUrl(), helper.getView(R.id.iv_cover));
    }

}