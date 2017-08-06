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

    public VoStudent() {
    }
    
    public VoStudent(BsStudent student) {
        this.setClazz(student.getClazz());
        this.setCollege(student.getCollege());
        this.setDegree(student.getDegree());
        this.setEmail(student.getEmail());
        this.setGrade(student.getGrade());
        this.setIschoose(student.getIschoose());
        this.setMajor(student.getMajor());
        this.setName(student.getName());
        this.setNumber(student.getNumber());
        this.setPassword(student.getPassword());
        this.setPhone(student.getPhone());
        this.setStrongpoint(student.getStrongpoint());
        this.setSid(student.getSid());
        this.setTid(student.getTid());
        this.setTopid(student.getTopid());
        this.setSalt(student.getSalt());
    }

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
