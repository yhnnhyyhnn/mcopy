package cn.com.mcopy.db.model.mcopy;

import java.util.Date;

public class News {
    private Integer NEW_ID;

    private String TITLE;

    private Integer READCOUNT;

    private Date CREATEDATE;

    private String CONTENT;

    public Integer getNEW_ID() {
        return NEW_ID;
    }

    public void setNEW_ID(Integer NEW_ID) {
        this.NEW_ID = NEW_ID;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE == null ? null : TITLE.trim();
    }

    public Integer getREADCOUNT() {
        return READCOUNT;
    }

    public void setREADCOUNT(Integer READCOUNT) {
        this.READCOUNT = READCOUNT;
    }

    public Date getCREATEDATE() {
        return CREATEDATE;
    }

    public void setCREATEDATE(Date CREATEDATE) {
        this.CREATEDATE = CREATEDATE;
    }

    public String getCONTENT() {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT == null ? null : CONTENT.trim();
    }
}