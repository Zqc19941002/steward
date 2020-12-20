package top.duanhong.steward.mapper.gmapper;

import org.apache.ibatis.annotations.Param;
import top.duanhong.steward.entity.po.StewMenu;
import top.duanhong.steward.entity.po.StewMenuExample;

import java.util.List;

public interface StewMenuMapper {
    long countByExample(StewMenuExample example);

    int deleteByExample(StewMenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(StewMenu record);

    int insertSelective(StewMenu record);

    List<StewMenu> selectByExample(StewMenuExample example);

    StewMenu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") StewMenu record, @Param("example") StewMenuExample example);

    int updateByExample(@Param("record") StewMenu record, @Param("example") StewMenuExample example);

    int updateByPrimaryKeySelective(StewMenu record);

    int updateByPrimaryKey(StewMenu record);
}
