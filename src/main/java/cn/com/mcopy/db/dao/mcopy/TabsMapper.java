package cn.com.mcopy.db.dao.mcopy;

import cn.com.mcopy.db.model.mcopy.Tabs;
import cn.com.mcopy.db.model.mcopy.TabsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabsMapper {
    long countByExample(TabsExample example);

    int deleteByExample(TabsExample example);

    int deleteByPrimaryKey(Integer TAB_ID);

    int insert(Tabs record);

    int insertSelective(Tabs record);

    List<Tabs> selectByExampleWithBLOBs(TabsExample example);

    List<Tabs> selectByExample(TabsExample example);

    Tabs selectByPrimaryKey(Integer TAB_ID);

    int updateByExampleSelective(@Param("record") Tabs record, @Param("example") TabsExample example);

    int updateByExampleWithBLOBs(@Param("record") Tabs record, @Param("example") TabsExample example);

    int updateByExample(@Param("record") Tabs record, @Param("example") TabsExample example);

    int updateByPrimaryKeySelective(Tabs record);

    int updateByPrimaryKeyWithBLOBs(Tabs record);

    int updateByPrimaryKey(Tabs record);
}