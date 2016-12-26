package cn.com.mcopy.service;

import cn.com.mcopy.db.dao.mcopy.TabsMapper;
import cn.com.mcopy.db.model.mcopy.Tabs;
import cn.com.mcopy.db.model.mcopy.TabsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ucenter on 2016/12/16.
 */

@Component("tabsService")
public class TabsService {

    @Autowired
    private TabsMapper tabsMapper;

    public List<Tabs> list(String menuID){
        TabsExample example = new TabsExample();
        if(null != menuID){
            example.createCriteria().andMENU_IDEqualTo(Integer.parseInt(menuID));
        }

        example.setOrderByClause("SORT");
        List<Tabs> list = tabsMapper.selectByExampleWithBLOBs(example);

        return list;
    }

    public void add(Tabs tabs){
        tabsMapper.insert(tabs);
    }

    public void update(Tabs tabs){
        tabsMapper.updateByPrimaryKey(tabs);
    }

    public void delete(int tabsID){
        tabsMapper.deleteByPrimaryKey(tabsID);
    }

    public Tabs getTab(int tabid){
        return tabsMapper.selectByPrimaryKey(tabid);
    }
}
