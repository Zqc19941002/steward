package top.duanhong.steward.service.tag;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import top.duanhong.steward.config.NetTagConfiguration;
import top.duanhong.steward.constants.NetTagStateConstant;
import top.duanhong.steward.controller.tag.param.CommonNetTagReq;
import top.duanhong.steward.controller.tag.param.FlagAsCommonNetTagReq;
import top.duanhong.steward.entity.po.NetTag;
import top.duanhong.steward.entity.po.NetTagExample;
import top.duanhong.steward.mapper.gmapper.NetTagMapper;
import top.duanhong.steward.request.*;
import top.duanhong.steward.service.sys.impl.RedisSequenceService;
import top.duanhong.steward.utils.MethodExcuResult;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author duanhong
 * @description 网络标签业务
 * @date 2019/8/12
 */
@Service
public class NetTabService {
    @Value("${netTagState}")
    private String netTagState;

    @Resource
    private NetTagMapper netTagMapper;

    @Autowired
    private RedisSequenceService redisSequenceService;

    /**
     * 添加网络标签
     * @param netTagAddReq
     * @return
     */
    public MethodExcuResult netTagInsert(NetTagAddReq netTagAddReq) {
        NetTag netTag = new NetTag();

        //从redis获取新增序列
        String newNetTagId=redisSequenceService.generateWithPrefix("NET_TAG_SEQ");
        BeanUtils.copyProperties(netTagAddReq,netTag);
        netTag.setTagId(newNetTagId);
        netTag.setCreateTime(new Date());
        //netTag.setTagTitle(netTagAddReq.getTagTitle());
        netTag.setUpdateTime(new Date());
        //netTag.setTagRemark(netTagAddReq.getTagRemark());
        //netTag.setTagPath(netTagAddReq.getTagPath());
        int result = netTagMapper.insertSelective(netTag);
        if (result>0){
            return MethodExcuResult.builder()
                    .result(result)
                    .isSuccess(true)
                    .build();
        }else {
            return MethodExcuResult.builder()
                    .result(result)
                    .isSuccess(false)
                    .build();
        }
    }

    public MethodExcuResult netTagSelectByExample(NetTagSelectReq netTagSelectReq) {
        NetTagExample example = new NetTagExample();
        NetTagExample.Criteria criteria = example.createCriteria();
        NetTagConfiguration netTagConfiguration=new NetTagConfiguration();
        //设置状态
        if (StringUtils.isNotBlank(netTagSelectReq.getState())){
            criteria.andStateEqualTo(netTagSelectReq.getState());
        }else {
            criteria.andStateNotEqualTo(NetTagStateConstant.DELETE_STATE);
        }
        if (!StringUtils.isBlank(netTagSelectReq.getNetTagTitle())){
            criteria.andTagTitleLike("%" + netTagSelectReq.getNetTagTitle() + "%");
        }

        if(!StringUtils.isBlank(netTagSelectReq.getTagRemark())){
            criteria.andTagRemarkLike("%"+netTagSelectReq.getTagRemark()+"%");
        }
        //根据类型或者主题混合查询
        if(!StringUtils.isBlank(netTagSelectReq.getTheme())){
            NetTagExample.Criteria themeCriteria=example.createCriteria();
            themeCriteria.getCriteria().clear();
            themeCriteria.getCriteria().addAll(criteria.getCriteria());
            themeCriteria.andThemeEqualTo(netTagSelectReq.getTheme());

            NetTagExample.Criteria typeCriteria=example.createCriteria();
            typeCriteria.getCriteria().clear();
            typeCriteria.getCriteria().addAll(criteria.getCriteria());
            typeCriteria.andTypeEqualTo(netTagSelectReq.getTheme());

            criteria.getAllCriteria().clear();
            example.or(themeCriteria);
            example.or(typeCriteria);
        }
        PageHelper.startPage(netTagSelectReq.getPage(),netTagSelectReq.getPageSize());
        List<NetTag> list = null;
        list = netTagMapper.selectByExampleWithBLOBs(example);
        PageInfo<NetTag> pageInfo=new PageInfo<>(list);
        return MethodExcuResult.builder()
                .isSuccess(true)
                .result(pageInfo)
                .mess("查询成功")
                .build();
    }

    public MethodExcuResult deleteNetTag(NetTagDeleteReq deleteReq) {
        int result=netTagMapper.deleteByPrimaryKey(deleteReq.getTagId());
        if (result>0){
            return MethodExcuResult.builder()
                    .result(result)
                    .isSuccess(true)
                    .build();
        }else {
            return MethodExcuResult.builder()
                    .result(result)
                    .isSuccess(false)
                    .build();
        }
    }

    public MethodExcuResult deleteNetTags(NetTagDeleteBatchesReq req) {
        NetTagExample example=new NetTagExample();
        NetTagExample.Criteria criteria=example.createCriteria();
        criteria.andTagIdIn(req.getSelectDataId());
        int result=netTagMapper.deleteByExample(example);
        if (result>0){
            return MethodExcuResult.builder()
                    .result(result)
                    .isSuccess(true)
                    .build();
        }else {
            return MethodExcuResult.builder()
                    .result(result)
                    .isSuccess(false)
                    .build();
        }
    }

    public MethodExcuResult updateNetTags(NetTagUpdateReq req) {
        NetTag netTag=new NetTag();
        BeanUtils.copyProperties(req,netTag);
        netTag.setUpdateTime(new Date());
        int result=netTagMapper.updateByPrimaryKeySelective(netTag);
        if (result>0){
            return MethodExcuResult.builder()
                    .result(result)
                    .isSuccess(true)
                    .build();
        }else {
            return MethodExcuResult.builder()
                    .result(result)
                    .isSuccess(false)
                    .build();
        }
    }

    public MethodExcuResult getCommonNetTags(CommonNetTagReq commonNetTagReq) {
        NetTagExample example=new NetTagExample();
        NetTagExample.Criteria criteria=example.createCriteria();
        criteria.andStateEqualTo(NetTagStateConstant.COMMON_STATE);
        PageHelper.startPage(commonNetTagReq.getPageNum(),commonNetTagReq.getPageSize());
        List<NetTag> commonNetTags=netTagMapper.selectByExampleWithBLOBs(example);
        PageInfo<NetTag> pageInfo=new PageInfo<>(commonNetTags);
        return MethodExcuResult.builder()
                .isSuccess(true)
                .result(pageInfo)
                .mess("查询成功")
                .build();
    }

    public MethodExcuResult flagAsCommonNetTag(FlagAsCommonNetTagReq flagAsCommonNetTagReq) {
        NetTag netTag=new NetTag();
        netTag.setTagId(flagAsCommonNetTagReq.getTagId());
        netTag.setState(flagAsCommonNetTagReq.getState());
        netTag.setUpdateTime(new Date());
        int result=netTagMapper.updateByPrimaryKeySelective(netTag);
        if (result>0){
            return MethodExcuResult.builder()
                    .result(result)
                    .isSuccess(true)
                    .build();
        }else {
            return MethodExcuResult.builder()
                    .result(result)
                    .isSuccess(false)
                    .build();
        }
    }
}
