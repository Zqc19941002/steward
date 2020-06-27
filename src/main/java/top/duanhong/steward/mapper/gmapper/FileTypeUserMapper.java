package top.duanhong.steward.mapper.gmapper;

import org.apache.ibatis.annotations.Param;
import top.duanhong.steward.entity.po.FileTypeUser;
import top.duanhong.steward.entity.po.FileTypeUserExample;

import java.util.List;

public interface FileTypeUserMapper {
    long countByExample(FileTypeUserExample example);

    int deleteByExample(FileTypeUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FileTypeUser record);

    int insertSelective(FileTypeUser record);

    List<FileTypeUser> selectByExample(FileTypeUserExample example);

    FileTypeUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FileTypeUser record, @Param("example") FileTypeUserExample example);

    int updateByExample(@Param("record") FileTypeUser record, @Param("example") FileTypeUserExample example);

    int updateByPrimaryKeySelective(FileTypeUser record);

    int updateByPrimaryKey(FileTypeUser record);
}
