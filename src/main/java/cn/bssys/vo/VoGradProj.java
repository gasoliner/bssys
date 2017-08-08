package cn.bssys.vo;

import cn.bssys.po.BsGradproj;

/**
 * Created by 万洪基 on 2017/8/8.
 */
public class VoGradProj extends BsGradproj {

    public VoGradProj() {
    }

    public VoGradProj(BsGradproj gradproj) {
        this.setBsid(gradproj.getBsid());
        this.setDegree(gradproj.getDegree());
        this.setDgid(gradproj.getDgid());
        this.setReviewer(gradproj.getReviewer());
        this.setScore(gradproj.getScore());
        this.setSid(gradproj.getSid());
        this.setYear(gradproj.getYear());
    }

    private String voStuNumber;

    private String voStuName;

    private String voStuClazz;

    private String voTopicName;

    private String voTopicSource;

    private String voTopicCategory;

    private String voTopicType;

    private String voTeacher;

    private String voTeaTitle;

    private String voTeaDep;

    private String voTeaMajor;

    private String voTeaDirc;

    private String voReviewer;

    private String voRevieTitle;

    private String voDefenseGroup;

    public String getVoStuNumber() {
        return voStuNumber;
    }

    public void setVoStuNumber(String voStuNumber) {
        this.voStuNumber = voStuNumber;
    }

    public String getVoStuName() {
        return voStuName;
    }

    public void setVoStuName(String voStuName) {
        this.voStuName = voStuName;
    }

    public String getVoStuClazz() {
        return voStuClazz;
    }

    public void setVoStuClazz(String voStuClazz) {
        this.voStuClazz = voStuClazz;
    }

    public String getVoTopicName() {
        return voTopicName;
    }

    public void setVoTopicName(String voTopicName) {
        this.voTopicName = voTopicName;
    }

    public String getVoTopicSource() {
        return voTopicSource;
    }

    public void setVoTopicSource(String voTopicSource) {
        this.voTopicSource = voTopicSource;
    }

    public String getVoTopicCategory() {
        return voTopicCategory;
    }

    public void setVoTopicCategory(String voTopicCategory) {
        this.voTopicCategory = voTopicCategory;
    }

    public String getVoTopicType() {
        return voTopicType;
    }

    public void setVoTopicType(String voTopicType) {
        this.voTopicType = voTopicType;
    }

    public String getVoTeacher() {
        return voTeacher;
    }

    public void setVoTeacher(String voTeacher) {
        this.voTeacher = voTeacher;
    }

    public String getVoTeaTitle() {
        return voTeaTitle;
    }

    public void setVoTeaTitle(String voTeaTitle) {
        this.voTeaTitle = voTeaTitle;
    }

    public String getVoTeaDep() {
        return voTeaDep;
    }

    public void setVoTeaDep(String voTeaDep) {
        this.voTeaDep = voTeaDep;
    }

    public String getVoTeaMajor() {
        return voTeaMajor;
    }

    public void setVoTeaMajor(String voTeaMajor) {
        this.voTeaMajor = voTeaMajor;
    }

    public String getVoTeaDirc() {
        return voTeaDirc;
    }

    public void setVoTeaDirc(String voTeaDirc) {
        this.voTeaDirc = voTeaDirc;
    }

    public String getVoReviewer() {
        return voReviewer;
    }

    public void setVoReviewer(String voReviewer) {
        this.voReviewer = voReviewer;
    }

    public String getVoRevieTitle() {
        return voRevieTitle;
    }

    public void setVoRevieTitle(String voRevieTitle) {
        this.voRevieTitle = voRevieTitle;
    }

    public String getVoDefenseGroup() {
        return voDefenseGroup;
    }

    public void setVoDefenseGroup(String voDefenseGroup) {
        this.voDefenseGroup = voDefenseGroup;
    }
}
