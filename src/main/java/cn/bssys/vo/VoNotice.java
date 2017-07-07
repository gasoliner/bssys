package cn.bssys.vo;

import cn.bssys.po.BsNotice;

/**
 * Created by 万洪基 on 2017/6/30.
 */
public class VoNotice extends BsNotice implements Comparable<VoNotice> {

    private String voNoticeType;

    private String voFile;

    public String getVoFile() {
        return voFile;
    }

    public void setVoFile(String voFile) {
        this.voFile = voFile;
    }

    public String getVoNoticeType() {
        return voNoticeType;
    }

    public void setVoNoticeType(String voNoticeType) {
        this.voNoticeType = voNoticeType;
    }

    @Override
    public int compareTo(VoNotice o) {
        return this.getDate().compareTo(o.getDate());
    }
}
