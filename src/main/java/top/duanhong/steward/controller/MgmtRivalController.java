package top.duanhong.steward.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.duanhong.steward.request.QueryMgmtRivalReq;
import top.duanhong.steward.response.SysBaseResponse;
import top.duanhong.steward.service.MgmtRivalService;
import top.duanhong.steward.utils.MethodExcuResult;
import top.duanhong.steward.utils.ResponseUtil;

/**
 * @author zhangqc
 * @description 查询竞争对手
 * @date 2020/2/26
 */
@RestController
@RequestMapping("/channel")
@Slf4j
public class MgmtRivalController {

    @Autowired
    private MgmtRivalService mgmtRivalServicel;

    @GetMapping("/queryRivalList")
    public SysBaseResponse queryRivalList(QueryMgmtRivalReq req){
        MethodExcuResult result=mgmtRivalServicel.queryRivalList(req);
        SysBaseResponse sysBaseResponse;
        if (result.isSuccess()){
            sysBaseResponse =ResponseUtil.getSuccessRes(result.getResult());
        }else {
            sysBaseResponse =ResponseUtil.getFailedRes(result.getCode(),result.getMess());
        }
        return sysBaseResponse;
    }

    @GetMapping("/queryRivalLonLatList")
    public SysBaseResponse queryRivalLonLatList(QueryMgmtRivalReq req){
        MethodExcuResult result=mgmtRivalServicel.queryRivalListBySmapper(req);
        SysBaseResponse sysBaseResponse;
        if (result.isSuccess()){
            sysBaseResponse =ResponseUtil.getSuccessRes(result.getResult());
        }else {
            sysBaseResponse =ResponseUtil.getFailedRes(result.getCode(),result.getMess());
        }
        return sysBaseResponse;
    }

}
