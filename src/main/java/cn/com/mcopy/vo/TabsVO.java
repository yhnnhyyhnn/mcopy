package cn.com.mcopy.vo;

import cn.com.mcopy.db.model.mcopy.Tabs;

/**
 * Created by ucenter on 2016/11/26.
 */
public class TabsVO extends Tabs {
    private String MENUNAME;

    public String getMENUNAME() {
        return MENUNAME;
    }

    public void setMENUNAME(String MENUNAME) {
        this.MENUNAME = MENUNAME;
    }
}
