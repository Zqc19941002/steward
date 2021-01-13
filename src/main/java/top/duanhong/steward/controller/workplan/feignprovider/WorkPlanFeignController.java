package top.duanhong.steward.controller.workplan.feignprovider;

import com.alibaba.druid.support.spring.stat.annotation.Stat;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.duanhong.steward.controller.workplan.param.ScanOverWorkPlan;
import top.duanhong.steward.controller.workplan.param.ScanWorkPlanStatesReq;
import top.duanhong.steward.enumeration.StatusCodeEnum;
import top.duanhong.steward.response.BaseResponse;
import top.duanhong.steward.response.MethodExecuteResult;
import top.duanhong.steward.response.SysBaseResponse;
import top.duanhong.steward.service.workplan.WorkPlanService;
import top.duanhong.steward.utils.ResponseUtil;

@RestController
@Slf4j
@RequestMapping("/feign/workPlan")
public class WorkPlanFeignController {

    @Autowired
    private WorkPlanService workPlanService;

    /**
     * 扫描当天工作计划
     * @param scanWorkPlanStatesReq
     * @return
     */
    @PostMapping("/scanWorkPlanStates")
    public SysBaseResponse scanWorkPlanStates(@RequestBody ScanWorkPlanStatesReq scanWorkPlanStatesReq){
        log.info("工作计划状态扫描服务请求入参：{}", JSON.toJSONString(scanWorkPlanStatesReq));
        SysBaseResponse sysBaseResponse= ResponseUtil.getSuccessRes(null);
        MethodExecuteResult result=workPlanService.scanWorkPlanStates(scanWorkPlanStatesReq);
        if (result.isSuccess()){
            sysBaseResponse.setBody(result.getData());
        }else {
            log.error("工作计划状态扫描服务异常！");
            sysBaseResponse.setErrorCode(StatusCodeEnum.ERROR_CODE.getCode());
            sysBaseResponse.setErrorMessage(StatusCodeEnum.ERROR_CODE.getMessage());
        }
        return sysBaseResponse;
    }

    /**
     * 扫描失效工作计划
     * @param scanOverWorkPlan
     * @return
     */
    @PostMapping("/scanOverWorkPlan")
    public SysBaseResponse scanOverWorkPlan(@RequestBody ScanOverWorkPlan scanOverWorkPlan){
        log.info("失效工作计划扫描服务请求入参：{}", JSON.toJSONString(scanOverWorkPlan));
        SysBaseResponse sysBaseResponse= ResponseUtil.getSuccessRes(null);
        MethodExecuteResult result=workPlanService.scanOverWorkPlan(scanOverWorkPlan);
        if (result.isSuccess()){
            sysBaseResponse.setBody(result.getData());
        }else {
            log.error("工作计划状态扫描服务异常！");
            sysBaseResponse.setErrorCode(StatusCodeEnum.ERROR_CODE.getCode());
            sysBaseResponse.setErrorMessage(StatusCodeEnum.ERROR_CODE.getMessage());
        }
        return sysBaseResponse;
    }
}
