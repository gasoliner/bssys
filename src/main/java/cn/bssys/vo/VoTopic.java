package cn.bssys.vo;

import cn.bssys.po.BsTopic;

/**
 * Created by 万洪基 on 2017/6/26.
 */
public class VoTopic extends BsTopic {

    public VoTopic() {
    }

    public VoTopic(BsTopic topic) {
        this.setToid(topic.getToid());
        this.setCollege(topic.getCollege());
        this.setMajor(topic.getMajor());
        this.setYear(topic.getYear());
        this.setName(topic.getName());
        this.setExplaining(topic.getExplaining());
        this.setCategory(topic.getCategory());
        this.setSrc(topic.getSrc());
        this.setSrname(topic.getSrname());
        this.setType(topic.getType());
        this.setComability(topic.getComability());
        this.setHandability(topic.getHandability());
        this.setGradlink(topic.getGradlink());
        this.setTestpercent(topic.getTestpercent());
        this.setResearch(topic.getResearch());
        this.setCh(topic.getCh());
        this.setEn(topic.getEn());
        this.setInnovation(topic.getInnovation());
        this.setTotal(topic.getTotal());
        this.setDifficulty(topic.getDifficulty());
        this.setComment(topic.getComment());
        this.setTid(topic.getTid());
        this.setIschoose(topic.getIschoose());
        this.setState(topic.getState());
        this.setChoosetime(topic.getChoosetime());
    }

    private String vocollege;

    private String vomajor;

    private String vocategory;

    private String vosrc;

    private String votype;

    private String vocomability;

    private String vohandability;

    private String voinnovation;

    private String vototal;

    private String vodifficulty;

    private String voyear;

    public String getVoyear() {
        return voyear;
    }

    public void setVoyear(String voyear) {
        this.voyear = voyear;
    }

    public String getVocollege() {
        return vocollege;
    }

    public void setVocollege(String vocollege) {
        this.vocollege = vocollege;
    }

    public String getVomajor() {
        return vomajor;
    }

    public void setVomajor(String vomajor) {
        this.vomajor = vomajor;
    }

    public String getVocategory() {
        return vocategory;
    }

    public void setVocategory(String vocategory) {
        this.vocategory = vocategory;
    }

    public String getVosrc() {
        return vosrc;
    }

    public void setVosrc(String vosrc) {
        this.vosrc = vosrc;
    }

    public String getVotype() {
        return votype;
    }

    public void setVotype(String votype) {
        this.votype = votype;
    }

    public String getVocomability() {
        return vocomability;
    }

    public void setVocomability(String vocomability) {
        this.vocomability = vocomability;
    }

    public String getVohandability() {
        return vohandability;
    }

    public void setVohandability(String vohandability) {
        this.vohandability = vohandability;
    }

    public String getVoinnovation() {
        return voinnovation;
    }

    public void setVoinnovation(String voinnovation) {
        this.voinnovation = voinnovation;
    }

    public String getVototal() {
        return vototal;
    }

    public void setVototal(String vototal) {
        this.vototal = vototal;
    }

    public String getVodifficulty() {
        return vodifficulty;
    }

    public void setVodifficulty(String vodifficulty) {
        this.vodifficulty = vodifficulty;
    }
}
