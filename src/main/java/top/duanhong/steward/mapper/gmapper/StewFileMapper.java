package top.duanhong.steward.mapper.gmapper;

import org.apache.ibatis.annotations.Param;
import top.duanhong.steward.entity.po.StewFile;
import top.duanhong.steward.entity.po.StewFileExample;

import java.util.List;

public interface StewFileMapper {
    long countByExample(StewFileExample example);

    int deleteByExample(StewFileExample example);

    int deleteByPrimaryKey(String fileId);

    int insert(StewFile record);

    int insertSelective(StewFile record);

    List<StewFile> selectByExample(StewFileExample example);

    StewFile selectByPrimaryKey(String fileId);

    int updateByExampleSelective(@Param("record") StewFile record, @Param("example") StewFileExample example);

    int updateByExample(@Param("record") StewFile record, @Param("example") StewFileExample example);

    int updateByPrimaryKeySelective(StewFile record);

    int updateByPrimaryKey(StewFile record);
}
