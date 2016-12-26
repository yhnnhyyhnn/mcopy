package cn.com.mcopy.db.dao.mcopy;

import cn.com.mcopy.db.model.mcopy.Menu;
import cn.com.mcopy.db.model.mcopy.MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
    long countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Integer MENU_ID);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExampleWithBLOBs(MenuExample example);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Integer MENU_ID);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExampleWithBLOBs(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKeyWithBLOBs(Menu record);

    int updateByPrimaryKey(Menu record);
}