package top.duanhong.steward.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.duanhong.steward.entity.po.NetTag;
import top.duanhong.steward.entity.po.NetTagExample;

public interface NetTagMapper {
    long countByExample(NetTagExample example);

    int deleteByExample(NetTagExample example);

    int deleteByPrimaryKey(String tagId);

    int insert(NetTag record);

    int insertSelective(NetTag record);

    List<NetTag> selectByExample(NetTagExample example);

    NetTag selectByPrimaryKey(String tagId);

    int updateByExampleSelective(@Param("record") NetTag record, @Param("example") NetTagExample example);

    int updateByExample(@Param("record") NetTag record, @Param("example") NetTagExample example);

    int updateByPrimaryKeySelective(NetTag record);

    int updateByPrimaryKey(NetTag record);
}