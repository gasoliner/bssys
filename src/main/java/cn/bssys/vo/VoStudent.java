package cn.bssys.vo;

import cn.bssys.po.BsStudent;

/**
 * Created by LENOVO on 2017/8/1.
 */
public class VoStudent extends BsStudent {
    private String  voClazz;
    private String voMajor;
    private String voCollege;
    private String voIschoose;

    public String getVoIschoose() {
        return voIschoose;
    }

    public void setVoIschoose(String voIschoose) {
        this.voIschoose = voIschoose;
    }

    public String getVoClazz() {
        return voClazz;
    }

    public void setVoClazz(String voClazz) {
        this.voClazz = voClazz;
    }

    public String getVoMajor() {
        return voMajor;
    }

    public void setVoMajor(String voMajor) {
        this.voMajor = voMajor;
    }

    public String getVoCollege() {
        return voCollege;
    }

    public void setVoCollege(String voCollege) {
        this.voCollege = voCollege;
    }


}
