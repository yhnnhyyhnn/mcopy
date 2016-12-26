package cn.com.mcopy.db.model.mcopy;

public class Tabs {
    private Integer TAB_ID;

    private String TITLE;

    private Integer MENU_ID;

    private String SORT;

    private String CONTENT;

    public Integer getTAB_ID() {
        return TAB_ID;
    }

    public void setTAB_ID(Integer TAB_ID) {
        this.TAB_ID = TAB_ID;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE == null ? null : TITLE.trim();
    }

    public Integer getMENU_ID() {
        return MENU_ID;
    }

    public void setMENU_ID(Integer MENU_ID) {
        this.MENU_ID = MENU_ID;
    }

    public String getSORT() {
        return SORT;
    }

    public void setSORT(String SORT) {
        this.SORT = SORT == null ? null : SORT.trim();
    }

    public String getCONTENT() {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT == null ? null : CONTENT.trim();
    }
}