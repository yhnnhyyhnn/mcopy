package cn.com.mcopy.vo;

import cn.com.mcopy.db.model.mcopy.Menu;

/**
 * Created by ucenter on 2016/11/14.
 */
public class MenuVO extends Menu {
    private String PARENTSTR;
    public void setPARENTSTR(String PARENTSTR){
        this.PARENTSTR = PARENTSTR;
    }
    public String getPARENTSTR(){
        return PARENTSTR;
    }
}
