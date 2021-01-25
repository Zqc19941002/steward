package top.duanhong.steward.mapper.gmapper;

import org.apache.ibatis.annotations.Param;
import top.duanhong.steward.entity.po.StewChatMessage;
import top.duanhong.steward.entity.po.StewChatMessageExample;

import java.util.List;

public interface StewChatMessageMapper {
    long countByExample(StewChatMessageExample example);

    int deleteByExample(StewChatMessageExample example);

    int insert(StewChatMessage record);

    int insertSelective(StewChatMessage record);

    List<StewChatMessage> selectByExample(StewChatMessageExample example);

    int updateByExampleSelective(@Param("record") StewChatMessage record, @Param("example") StewChatMessageExample example);

    int updateByExample(@Param("record") StewChatMessage record, @Param("example") StewChatMessageExample example);
}
