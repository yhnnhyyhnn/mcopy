package cn.com.mcopy.db.model.mcopy;

public class Menu {
    private Integer MENU_ID;

    private String MENUNAME;

    private String MENUNAME_EN;

    private String MENULEVEL;

    private String USETEMP;

    private String URL;

    private Integer PARENT;

    private String STATUS;

    private String SORT;

    private String CONTENT;

    public Integer getMENU_ID() {
        return MENU_ID;
    }

    public void setMENU_ID(Integer MENU_ID) {
        this.MENU_ID = MENU_ID;
    }

    public String getMENUNAME() {
        return MENUNAME;
    }

    public void setMENUNAME(String MENUNAME) {
        this.MENUNAME = MENUNAME == null ? null : MENUNAME.trim();
    }

    public String getMENUNAME_EN() {
        return MENUNAME_EN;
    }

    public void setMENUNAME_EN(String MENUNAME_EN) {
        this.MENUNAME_EN = MENUNAME_EN == null ? null : MENUNAME_EN.trim();
    }

    public String getMENULEVEL() {
        return MENULEVEL;
    }

    public void setMENULEVEL(String MENULEVEL) {
        this.MENULEVEL = MENULEVEL == null ? null : MENULEVEL.trim();
    }

    public String getUSETEMP() {
        return USETEMP;
    }

    public void setUSETEMP(String USETEMP) {
        this.USETEMP = USETEMP == null ? null : USETEMP.trim();
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL == null ? null : URL.trim();
    }

    public Integer getPARENT() {
        return PARENT;
    }

    public void setPARENT(Integer PARENT) {
        this.PARENT = PARENT;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS == null ? null : STATUS.trim();
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