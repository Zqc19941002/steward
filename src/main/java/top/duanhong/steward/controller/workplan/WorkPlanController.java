package top.duanhong.steward.controller.workplan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import top.duanhong.steward.controller.workplan.param.AddNewWorkPlanReq;
import top.duanhong.steward.controller.workplan.param.QueryWorkPlanReq;
import top.duanhong.steward.enumeration.StatusCodeEnum;
import top.duanhong.steward.response.MethodExecuteResult;
import top.duanhong.steward.response.SysBaseResponse;
import top.duanhong.steward.service.workplan.WorkPlanService;
import top.duanhong.steward.utils.ResponseUtil;

import javax.validation.Valid;

@RestController
@RequestMapping("/workPlan")
public class WorkPlanController {

    @Autowired
    private WorkPlanService workPlanService;

    @PostMapping("/add")
    public SysBaseResponse addNewWorkPlan(@RequestBody @Valid AddNewWorkPlanReq addNewWorkPlanReq, BindingResult bindingResult){
        SysBaseResponse sysBaseResponse=ResponseUtil.getSuccessRes(null);
        if (bindingResult.hasErrors()){
            sysBaseResponse.setErrorCode(StatusCodeEnum.REQ_PARAM_ERROR.getCode());
            sysBaseResponse.setErrorMessage(StatusCodeEnum.REQ_PARAM_ERROR.getMessage());
            return sysBaseResponse;
        }
        MethodExecuteResult result=workPlanService.addNewWorkPlan(addNewWorkPlanReq);
        if (result.isSuccess()){
            sysBaseResponse.setBody(result.getData());
        }else {
            sysBaseResponse.setErrorCode(result.getResultCode());
            sysBaseResponse.setErrorMessage(result.getMessage());
        }
        return sysBaseResponse;
    }

    @GetMapping("/queryWorkPlanList")
    public SysBaseResponse queryWorkPlanList(QueryWorkPlanReq queryWorkPlanReq){
        SysBaseResponse sysBaseResponse=ResponseUtil.getSuccessRes(null);
        MethodExecuteResult result=workPlanService.queryWorkPlanList(queryWorkPlanReq);
        if (result.isSuccess()){
            sysBaseResponse.setBody(result.getData());
        }else {
            sysBaseResponse.setErrorCode(result.getResultCode());
            sysBaseResponse.setErrorMessage(result.getMessage());
        }
        return sysBaseResponse;
    }

}
