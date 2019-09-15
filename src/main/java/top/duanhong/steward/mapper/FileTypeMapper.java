package top.duanhong.steward.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.duanhong.steward.entity.po.FileType;
import top.duanhong.steward.entity.po.FileTypeExample;

public interface FileTypeMapper {
    long countByExample(FileTypeExample example);

    int deleteByExample(FileTypeExample example);

    int deleteByPrimaryKey(String fileTypeId);

    int insert(FileType record);

    int insertSelective(FileType record);

    List<FileType> selectByExample(FileTypeExample example);

    FileType selectByPrimaryKey(String fileTypeId);

    int updateByExampleSelective(@Param("record") FileType record, @Param("example") FileTypeExample example);

    int updateByExample(@Param("record") FileType record, @Param("example") FileTypeExample example);

    int updateByPrimaryKeySelective(FileType record);

    int updateByPrimaryKey(FileType record);
}