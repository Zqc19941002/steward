package top.duanhong.steward.service;

import cn.hutool.core.bean.BeanUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.duanhong.steward.entity.po.FileType;
import top.duanhong.steward.entity.po.FileTypeExample;
import top.duanhong.steward.entity.po.FileTypeUser;
import top.duanhong.steward.entity.po.FileTypeUserExample;
import top.duanhong.steward.entity.vo.FileTypeVo;
import top.duanhong.steward.mapper.gmapper.FileTypeMapper;
import top.duanhong.steward.mapper.gmapper.FileTypeUserMapper;
import top.duanhong.steward.request.AddFileTypeReq;
import top.duanhong.steward.request.DeleteFileTypeReq;
import top.duanhong.steward.request.QueryFileTypesReq;
import top.duanhong.steward.utils.MethodExcuResult;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author duanhong
 * @description 文件分类服务
 * @date 2019/9/4
 */
@Service
public class FileTypeService {
    @Autowired
    private FileTypeMapper fileTypeMapper;

    @Resource
    private FileTypeUserMapper fileTypeUserMapper;

    @Autowired
    private RedisSequenceService redisSequenceService;

    /**
     * 新增文件类型
     * @param req
     * @return
     */
    @Transactional
    public MethodExcuResult addFileType(AddFileTypeReq req) {
        MethodExcuResult methodExcuResult=MethodExcuResult.builder().isSuccess(true).build();
        //存储文件类别
        FileType fileType=new FileType();
        String fileTypeId=redisSequenceService.generateWithPrefix("STEW_FILE_TYPE_SEQ");
        fileType.setCreateTime(new Date());
        fileType.setFileTypeId(fileTypeId);
        fileType.setTypeCode(req.getTypeCode());
        fileType.setTypeLabel(req.getTypeLabel());
        fileType.setUpdateTime(new Date());
        int insertResult=fileTypeMapper.insert(fileType);

        //存储文件和类别关联数据
        int typeUserInResult=-1;
        if (insertResult==1){
            FileTypeUser fileTypeUser=new FileTypeUser();
            fileTypeUser.setCreateTime(new Date());
            fileTypeUser.setFileTypeId(fileTypeId);
            fileTypeUser.setUserId(req.getUserId());
            typeUserInResult=fileTypeUserMapper.insert(fileTypeUser);
        }else {
            methodExcuResult.setSuccess(false);
            methodExcuResult.setMess("文件类型添加失败");
        }

        if (typeUserInResult==1){
            FileType newFileType=fileTypeMapper.selectByPrimaryKey(fileTypeId);
            if (newFileType!=null){
                methodExcuResult.setResult(newFileType);
            }else {
                methodExcuResult.setSuccess(false);
                methodExcuResult.setMess("新增文件类型查询失败");
            }
        }else {
            methodExcuResult.setSuccess(false);
            methodExcuResult.setMess("文件类型和用户关联失败");
        }
        return methodExcuResult;
    }

    /**
     * 查询文件类型
     * @param req
     * @return
     */
    public MethodExcuResult getFileTypes(QueryFileTypesReq req) {
        MethodExcuResult methodExcuResult = MethodExcuResult.builder().isSuccess(true).build();
        //获取用户信息
        FileTypeUserExample typeUserExample = new FileTypeUserExample();
        FileTypeUserExample.Criteria typeUserCriteria = typeUserExample.createCriteria();
        //创建用户id查询条件----------获取用户登录名（sessionUser）
        if (!StringUtils.isBlank(req.getUserId())){
            typeUserCriteria.andUserIdEqualTo(req.getUserId());
        }
        List<FileTypeUser> list = fileTypeUserMapper.selectByExample(typeUserExample);
        //获取用户对应的文件类别
        List<String> fileTypeIdList = new ArrayList<>();
        if (list != null) {
            for (FileTypeUser fileTypeUser : list) {
                fileTypeIdList.add(fileTypeUser.getFileTypeId());
            }
        }
        FileTypeExample fileTypeExample = new FileTypeExample();
        FileTypeExample.Criteria fileTypeCriteria = fileTypeExample.createCriteria();
        //创建文件类型查询条件
        List<FileType> fileTypeList=new ArrayList<>();
        if (fileTypeIdList.size()>0){
            fileTypeCriteria.andFileTypeIdIn(fileTypeIdList);
             fileTypeList= fileTypeMapper.selectByExample(fileTypeExample);
        }
        if (fileTypeList != null) {
            List<FileTypeVo> fileTypeVoList=new ArrayList<>();
            for (FileType fileType:fileTypeList) {
                FileTypeVo fileTypeVo=new FileTypeVo();
                BeanUtil.copyProperties(fileType,fileTypeVo);
                fileTypeVoList.add(fileTypeVo);
            }
            methodExcuResult.setResult(fileTypeVoList);
        } else {
            methodExcuResult.setSuccess(false);
            methodExcuResult.setMess("文件类型查询失败");
        }
        return methodExcuResult;
    }

    @Transactional
    public MethodExcuResult deleteFileType(DeleteFileTypeReq req) {
        //删除关联数据
        FileTypeUserExample fileTypeUserExample=new FileTypeUserExample();
        FileTypeUserExample.Criteria fileTypeUserCriteria=fileTypeUserExample.createCriteria();
        if (!StringUtils.isBlank(req.getFileTypeId())){
            fileTypeUserCriteria.andFileTypeIdEqualTo(req.getFileTypeId());
        }
        if(!StringUtils.isBlank(req.getUserId())){
            fileTypeUserCriteria.andUserIdEqualTo(req.getUserId());
        }
        int typeUserResult=fileTypeUserMapper.deleteByExample(fileTypeUserExample);

        //删除文件类型记录
        FileTypeExample fileTypeExample=new FileTypeExample();
        FileTypeExample.Criteria fileTypeCriteria=fileTypeExample.createCriteria();
        if (!StringUtils.isBlank(req.getFileTypeId())){
            fileTypeCriteria.andFileTypeIdEqualTo(req.getFileTypeId());
        }
        int fileTypeResult=fileTypeMapper.deleteByExample(fileTypeExample);
        if (typeUserResult==1&&fileTypeResult==1){
            return MethodExcuResult.builder().isSuccess(true).build();
        }else {
            return MethodExcuResult.builder().isSuccess(false).build();
        }
    }
}
