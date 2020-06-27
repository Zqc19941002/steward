package top.duanhong.steward.service;

import cn.hutool.core.collection.CollectionUtil;
import org.springframework.stereotype.Service;
import top.duanhong.steward.entity.po.MgmtRivalChl;
import top.duanhong.steward.entity.po.MgmtRivalChlExample;
import top.duanhong.steward.entity.po.MgmtRivalChlLonLatBaseInfo;
import top.duanhong.steward.enumeration.StatusCodeEnum;
import top.duanhong.steward.mapper.gmapper.MgmtRivalChlMapper;
import top.duanhong.steward.mapper.smapper.MgmtRivalSmapper;
import top.duanhong.steward.request.QueryMgmtRivalReq;
import top.duanhong.steward.utils.MethodExcuResult;
import top.duanhong.steward.utils.StringUtil;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangqc
 * @description 竞争对手查询
 * @date 2020/2/26
 */
@Service
public class MgmtRivalService {
    @Resource
    private MgmtRivalChlMapper mgmtRivalChlMapper;

    @Resource
    private MgmtRivalSmapper mgmtRivalSmapper;

    public MethodExcuResult queryRivalListBySmapper(QueryMgmtRivalReq rivalPageRequest){
        MethodExcuResult result=MethodExcuResult.builder()
                .isSuccess(true)
                .mess("查询成功")
                .code(StatusCodeEnum.SUCCESS_CODE.getCode())
                .build();
        MgmtRivalChlExample example=new MgmtRivalChlExample();
        MgmtRivalChlExample.Criteria criteria=example.createCriteria();
        if(!CollectionUtil.isEmpty(rivalPageRequest.getBusiRegGridCodeList())) {
            criteria.andBusiRegGridCodeIn(rivalPageRequest.getBusiRegGridCodeList());
        }
        if(!CollectionUtil.isEmpty(rivalPageRequest.getBusiRegAreaCodeList())) {
            criteria.andBusiRegAreaCodeIn(rivalPageRequest.getBusiRegAreaCodeList());
        }
        if(!CollectionUtil.isEmpty(rivalPageRequest.getBusiRegCountyCodeList())) {
            criteria.andBusiRegCountyCodeIn(rivalPageRequest.getBusiRegCountyCodeList());
        }
        if(!CollectionUtil.isEmpty(rivalPageRequest.getBusiRegCityCodeList())) {
            criteria.andBusiRegCityCodeIn(rivalPageRequest.getBusiRegCityCodeList());
        }
        setOtherCriteria(rivalPageRequest, criteria);
        List<MgmtRivalChlLonLatBaseInfo> lonLatBaseInfos=mgmtRivalSmapper.selectLonLatByExample(example);
        if (lonLatBaseInfos==null){
            result.setSuccess(false);
            result.setCode("45353");
            result.setResult(null);
            result.setMess("查询失败");
        }else {
            result.setResult(lonLatBaseInfos);
        }
        return result;
    }

    public MethodExcuResult queryRivalList(QueryMgmtRivalReq rivalPageRequest) {
        MethodExcuResult result=MethodExcuResult.builder()
                .isSuccess(true)
                .mess("查询成功")
                .code(StatusCodeEnum.SUCCESS_CODE.getCode())
                .build();
        MgmtRivalChlExample example=new MgmtRivalChlExample();
        MgmtRivalChlExample.Criteria criteria=example.createCriteria();
        if(!CollectionUtil.isEmpty(rivalPageRequest.getBusiRegGridCodeList())) {
            criteria.andBusiRegGridCodeIn(rivalPageRequest.getBusiRegGridCodeList());
        }
        if(!CollectionUtil.isEmpty(rivalPageRequest.getBusiRegAreaCodeList())) {
            criteria.andBusiRegAreaCodeIn(rivalPageRequest.getBusiRegAreaCodeList());
        }
        if(!CollectionUtil.isEmpty(rivalPageRequest.getBusiRegCountyCodeList())) {
            criteria.andBusiRegCountyCodeIn(rivalPageRequest.getBusiRegCountyCodeList());
        }
        if(!CollectionUtil.isEmpty(rivalPageRequest.getBusiRegCityCodeList())) {
            criteria.andBusiRegCityCodeIn(rivalPageRequest.getBusiRegCityCodeList());
        }
        setOtherCriteria(rivalPageRequest, criteria);
        List<MgmtRivalChl> list=mgmtRivalChlMapper.selectByExample(example);
        if (list==null){
            result.setSuccess(false);
            result.setCode("45353");
            result.setResult(null);
            result.setMess("查询失败");
        }else {
            result.setResult(list);
        }
        return result;
    }

    public void setOtherCriteria(QueryMgmtRivalReq rivalPageRequest,MgmtRivalChlExample.Criteria criteria){
        if (!StringUtil.isBlank(rivalPageRequest.getSearchType())) {
            Integer state = Integer.parseInt(rivalPageRequest.getSearchType());
            criteria.andStateEqualTo(state);
        } else {
            criteria.andStateEqualTo(1);
        }

        // 运营商id
        if (!StringUtil.isBlank(rivalPageRequest.getTeleComoperatorId())) {
            criteria.andTelecomOperatorIdEqualTo(rivalPageRequest.getTeleComoperatorId());
        }

        //渠道名称
        if (!StringUtil.isBlank(rivalPageRequest.getChannelName())) {
            criteria.andChannelNameLike("%" + rivalPageRequest.getChannelName() + "%");
        }

        //渠道名称等于
        if (!StringUtil.isBlank(rivalPageRequest.getChannelNameEqualTo())) {
            criteria.andChannelNameEqualTo(rivalPageRequest.getChannelNameEqualTo());
        }

        //渠道编码
        if (!StringUtil.isBlank(rivalPageRequest.getChannelCode())) {
            criteria.andChannelCodeEqualTo(rivalPageRequest.getChannelCode());
        }

        //业务区域
        if (!StringUtil.isBlank(rivalPageRequest.getBusiRegProvinceCode())) {
            criteria.andBusiRegProvinceCodeEqualTo(rivalPageRequest.getBusiRegProvinceCode());
        }
        if (!StringUtil.isBlank(rivalPageRequest.getBusiRegCityCode())) {
            criteria.andBusiRegCityCodeEqualTo(rivalPageRequest.getBusiRegCityCode());
        }
        if (!StringUtil.isBlank(rivalPageRequest.getBusiRegCountyCode())) {
            criteria.andBusiRegCountyCodeEqualTo(rivalPageRequest.getBusiRegCountyCode());
        }
        if (!StringUtil.isBlank(rivalPageRequest.getBusiRegareaCode())) {
            criteria.andBusiRegAreaCodeEqualTo(rivalPageRequest.getBusiRegareaCode());
        }
        if (!StringUtil.isBlank(rivalPageRequest.getBusiRegGridCode())) {
            criteria.andBusiRegGridCodeEqualTo(rivalPageRequest.getBusiRegGridCode());
        }
        if (!StringUtil.isBlank(rivalPageRequest.getBusiRegMicroareaCode())) {
            criteria.andBusiRegMicroAreaCodeEqualTo(rivalPageRequest.getBusiRegMicroareaCode());
        }
        if (!StringUtil.isBlank(rivalPageRequest.getBusiRegCode())) {
            criteria.andBusiRegCodeEqualTo(rivalPageRequest.getBusiRegCode());
        }

        //行政区域
        if (!StringUtil.isBlank(rivalPageRequest.getAdmRegProvinceCode())) {
            criteria.andAdmRegProvinceCodeEqualTo(rivalPageRequest.getAdmRegProvinceCode());
        }
        if (!StringUtil.isBlank(rivalPageRequest.getAdmRegCityCode())) {
            criteria.andAdmRegCityCodeEqualTo(rivalPageRequest.getAdmRegCityCode());
        }
        if (!StringUtil.isBlank(rivalPageRequest.getAdmRegCountyCode())) {
            criteria.andAdmRegCountyCodeEqualTo(rivalPageRequest.getAdmRegCountyCode());
        }
        if (!StringUtil.isBlank(rivalPageRequest.getAdmRegTownCode())) {
            criteria.andAdmRegTownCodeEqualTo(rivalPageRequest.getAdmRegTownCode());
        }
        if (!StringUtil.isBlank(rivalPageRequest.getAdmRegVillageCode())) {
            criteria.andAdmRegVillageCodeEqualTo(rivalPageRequest.getAdmRegVillageCode());
        }
        if (!StringUtil.isBlank(rivalPageRequest.getAdmRegCode())) {
            criteria.andAdmRegCodeEqualTo(rivalPageRequest.getAdmRegCode());
        }

        //渠道类型
        if (!StringUtil.isBlank(rivalPageRequest.getChlFirstKindId())) {
            criteria.andChlFirstKindIdEqualTo(rivalPageRequest.getChlFirstKindId());
        }
        if (!StringUtil.isBlank(rivalPageRequest.getChlSecondKindId())) {
            criteria.andChlSecondKindIdEqualTo(rivalPageRequest.getChlSecondKindId());
        }
        if (!StringUtil.isBlank(rivalPageRequest.getChlThirdKindId())) {
            criteria.andChlThirdKindIdEqualTo(rivalPageRequest.getChlThirdKindId());
        }
        if (!StringUtil.isBlank(rivalPageRequest.getChlForthKindId())) {
            criteria.andChlForthKindIdEqualTo(rivalPageRequest.getChlForthKindId());
        }
        if (!StringUtil.isBlank(rivalPageRequest.getChlKindId())) {
            criteria.andChlKindIdEqualTo(rivalPageRequest.getChlKindId());
        }

        //经营性质
        if (!StringUtil.isBlank(rivalPageRequest.getBusinessNature())) {
            criteria.andBusinessNatureEqualTo(rivalPageRequest.getBusinessNature());
        }
        if (!StringUtil.isBlank(rivalPageRequest.getConstructMode())) {
            criteria.andConstructModeEqualTo(rivalPageRequest.getConstructMode());
        }

        //渠道经理
        if (!StringUtil.isBlank(rivalPageRequest.getChannelManagerName())) {
            criteria.andChannelManagerNameEqualTo(rivalPageRequest.getChannelManagerName());
        }
        //渠道星级
        if (!StringUtil.isBlank(rivalPageRequest.getChannelStarLevel())) {
            criteria.andChannelStarLevelEqualTo(rivalPageRequest.getChannelStarLevel());
        }

        if(!CollectionUtil.isEmpty(rivalPageRequest.getRivalCodeList())) {
            criteria.andChannelCodeIn(rivalPageRequest.getRivalCodeList());
        }
    }
}
