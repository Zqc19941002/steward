package top.duanhong.steward.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.duanhong.steward.entity.po.Dict;
import top.duanhong.steward.entity.po.DictExample;

public interface DictMapper {
    long countByExample(DictExample example);

    int deleteByExample(DictExample example);

    int deleteByPrimaryKey(String id);

    int insert(Dict record);

    int insertSelective(Dict record);

    List<Dict> selectByExample(DictExample example);

    Dict selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Dict record, @Param("example") DictExample example);

    int updateByExample(@Param("record") Dict record, @Param("example") DictExample example);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKey(Dict record);
}