package top.duanhong.steward.mapper.gmapper;

import org.apache.ibatis.annotations.Param;
import top.duanhong.steward.entity.po.StewChatRoom;
import top.duanhong.steward.entity.po.StewChatRoomExample;

import java.util.List;

public interface StewChatRoomMapper {
    long countByExample(StewChatRoomExample example);

    int deleteByExample(StewChatRoomExample example);

    int insert(StewChatRoom record);

    int insertSelective(StewChatRoom record);

    List<StewChatRoom> selectByExampleWithBLOBs(StewChatRoomExample example);

    List<StewChatRoom> selectByExample(StewChatRoomExample example);

    int updateByExampleSelective(@Param("record") StewChatRoom record, @Param("example") StewChatRoomExample example);

    int updateByExampleWithBLOBs(@Param("record") StewChatRoom record, @Param("example") StewChatRoomExample example);

    int updateByExample(@Param("record") StewChatRoom record, @Param("example") StewChatRoomExample example);
}
