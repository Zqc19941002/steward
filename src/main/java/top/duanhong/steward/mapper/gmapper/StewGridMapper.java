package top.duanhong.steward.mapper.gmapper;

import org.apache.ibatis.annotations.Param;
import top.duanhong.steward.entity.po.StewGrid;
import top.duanhong.steward.entity.po.StewGridExample;

import java.util.List;

public interface StewGridMapper {
    long countByExample(StewGridExample example);

    int deleteByExample(StewGridExample example);

    int deleteByPrimaryKey(String id);

    int insert(StewGrid record);

    int insertSelective(StewGrid record);

    List<StewGrid> selectByExample(StewGridExample example);

    StewGrid selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") StewGrid record, @Param("example") StewGridExample example);

    int updateByExample(@Param("record") StewGrid record, @Param("example") StewGridExample example);

    int updateByPrimaryKeySelective(StewGrid record);

    int updateByPrimaryKey(StewGrid record);
}
