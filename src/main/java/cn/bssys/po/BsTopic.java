package cn.bssys.po;

import java.util.Date;

public class BsTopic {
    private Integer toid;

    private Integer college;

    private Integer major;

    private Integer year;

    private String name;

    private String explaining;

    private Integer category;

    private Integer src;

    private String srname;

    private Integer type;

    private Integer comability;

    private Integer handability;

    private Integer gradlink;

    private Double testpercent;

    private Integer research;

    private Integer ch;

    private Integer en;

    private Integer innovation;

    private Integer total;

    private Integer difficulty;

    private String comment;

    private Long tid;

    private Integer ischoose;

    private Integer state;

    private Date choosetime;

    public Integer getToid() {
        return toid;
    }

    public void setToid(Integer toid) {
        this.toid = toid;
    }

    public Integer getCollege() {
        return college;
    }

    public void setCollege(Integer college) {
        this.college = college;
    }

    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getExplaining() {
        return explaining;
    }

    public void setExplaining(String explaining) {
        this.explaining = explaining == null ? null : explaining.trim();
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getSrc() {
        return src;
    }

    public void setSrc(Integer src) {
        this.src = src;
    }

    public String getSrname() {
        return srname;
    }

    public void setSrname(String srname) {
        this.srname = srname == null ? null : srname.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getComability() {
        return comability;
    }

    public void setComability(Integer comability) {
        this.comability = comability;
    }

    public Integer getHandability() {
        return handability;
    }

    public void setHandability(Integer handability) {
        this.handability = handability;
    }

    public Integer getGradlink() {
        return gradlink;
    }

    public void setGradlink(Integer gradlink) {
        this.gradlink = gradlink;
    }

    public Double getTestpercent() {
        return testpercent;
    }

    public void setTestpercent(Double testpercent) {
        this.testpercent = testpercent;
    }

    public Integer getResearch() {
        return research;
    }

    public void setResearch(Integer research) {
        this.research = research;
    }

    public Integer getCh() {
        return ch;
    }

    public void setCh(Integer ch) {
        this.ch = ch;
    }

    public Integer getEn() {
        return en;
    }

    public void setEn(Integer en) {
        this.en = en;
    }

    public Integer getInnovation() {
        return innovation;
    }

    public void setInnovation(Integer innovation) {
        this.innovation = innovation;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Integer getIschoose() {
        return ischoose;
    }

    public void setIschoose(Integer ischoose) {
        this.ischoose = ischoose;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getChoosetime() {
        return choosetime;
    }

    public void setChoosetime(Date choosetime) {
        this.choosetime = choosetime;
    }
}