package top.duanhong.steward.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.duanhong.steward.entity.po.Note;
import top.duanhong.steward.entity.po.NoteExample;

public interface NoteMapper {
    long countByExample(NoteExample example);

    int deleteByExample(NoteExample example);

    int deleteByPrimaryKey(String noteId);

    int insert(Note record);

    int insertSelective(Note record);

    List<Note> selectByExample(NoteExample example);

    Note selectByPrimaryKey(String noteId);

    int updateByExampleSelective(@Param("record") Note record, @Param("example") NoteExample example);

    int updateByExample(@Param("record") Note record, @Param("example") NoteExample example);

    int updateByPrimaryKeySelective(Note record);

    int updateByPrimaryKey(Note record);
}