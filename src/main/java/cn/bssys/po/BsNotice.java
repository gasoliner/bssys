package cn.bssys.po;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class BsNotice {
    private String uuid;

    private String title;

    private String content;

    private Integer noticetype;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    private String publisher;

    private String annex;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getNoticetype() {
        return noticetype;
    }

    public void setNoticetype(Integer noticetype) {
        this.noticetype = noticetype;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getAnnex() {
        return annex;
    }

    public void setAnnex(String annex) {
        this.annex = annex == null ? null : annex.trim();
    }
}