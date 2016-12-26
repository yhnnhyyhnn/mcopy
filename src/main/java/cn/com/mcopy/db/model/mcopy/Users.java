package cn.com.mcopy.db.model.mcopy;

import java.util.Date;

public class Users {
    private Integer USER_ID;

    private String USERNAME;

    private String LOGINNAME;

    private String PASSWORD;

    private Date CREATETIME;

    private String USERLEVEL;

    public Integer getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(Integer USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME == null ? null : USERNAME.trim();
    }

    public String getLOGINNAME() {
        return LOGINNAME;
    }

    public void setLOGINNAME(String LOGINNAME) {
        this.LOGINNAME = LOGINNAME == null ? null : LOGINNAME.trim();
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD == null ? null : PASSWORD.trim();
    }

    public Date getCREATETIME() {
        return CREATETIME;
    }

    public void setCREATETIME(Date CREATETIME) {
        this.CREATETIME = CREATETIME;
    }

    public String getUSERLEVEL() {
        return USERLEVEL;
    }

    public void setUSERLEVEL(String USERLEVEL) {
        this.USERLEVEL = USERLEVEL == null ? null : USERLEVEL.trim();
    }
}