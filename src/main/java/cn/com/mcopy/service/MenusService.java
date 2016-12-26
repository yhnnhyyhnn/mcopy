package cn.com.mcopy.service;

import cn.com.mcopy.db.dao.mcopy.MenuMapper;
import cn.com.mcopy.db.model.mcopy.Menu;
import cn.com.mcopy.db.model.mcopy.MenuExample;
import cn.com.mcopy.vo.MenuVO;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spark.utils.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ucenter on 2016/11/10.
 */
@Component("menusService")
public class MenusService {

    @Autowired
    private MenuMapper menuMapper;

    public void add(Menu menu) {
        menuMapper.insert(menu);
    }

    public List<MenuVO> query(String menuname,String menuname_en) {
        MenuExample menuExample = new MenuExample();
        MenuExample.Criteria criteria = menuExample.createCriteria();
        if(menuname!=null && StringUtils.isNotEmpty(menuname)){
            criteria.andMENUNAMELike(menuname);
        }
        if(menuname_en!=null && StringUtils.isNotEmpty(menuname_en)){
            criteria.andMENUNAME_ENEqualTo(menuname_en);
        }
        menuExample.setOrderByClause("menulevel,sort");
        List<Menu> menus = menuMapper.selectByExampleWithBLOBs(menuExample);
        List<MenuVO> vos = new ArrayList<>();
        if(menus!=null && !menus.isEmpty()){
            for(Menu m : menus){
                MenuVO vo = new MenuVO();
                try {
                    BeanUtils.copyProperties(vo,m);
                    vos.add(vo);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        return vos;
    }

    public Menu getMenu(int menuid){
        return menuMapper.selectByPrimaryKey(menuid);
    }

    public void deleteMenu(int menuid){
        menuMapper.deleteByPrimaryKey(menuid);
    }

    public void updateMenu(Menu menu){
        menuMapper.updateByPrimaryKeyWithBLOBs(menu);
    }

    public Map<String,List<Menu>> queryAllSecondMenu(){
        Map<String,List<Menu>> map = new HashMap<>();

        //查询所有一级菜单
        List<Menu> menuList = queryAllFirstMenu();
        //根据一级菜单查询下面所有二级菜单
        for(Menu m:menuList){
            map.put(m.getMENUNAME(),querySecondMenu(m.getMENUNAME()));
        }

        return map;
    }

    public List<Menu> queryAllFirstMenu(){
        MenuExample example = new MenuExample();
        example.createCriteria().andMENULEVELEqualTo("1");

        List<Menu> menuList = menuMapper.selectByExample(example);
        return menuList;
    }

    public List<Menu> querySecondMenu(String menuname){
        Menu menu = getMenu(menuname);
        if(menu==null) return null;
        MenuExample example = new MenuExample();
        example.createCriteria().andPARENTEqualTo(menu.getMENU_ID()).andMENULEVELEqualTo("2");
        example.setOrderByClause("SORT");
        List<Menu> menuList = menuMapper.selectByExample(example);
        return menuList;
    }

    public Menu getMenu(String menuname){
        MenuExample example = new MenuExample();
        example.createCriteria().andMENUNAMEEqualTo(menuname);
        List<Menu> menus = menuMapper.selectByExample(example);
        if(menus!=null&&!menus.isEmpty()){
            return menus.get(0);
        }
        return null;
    }

}
