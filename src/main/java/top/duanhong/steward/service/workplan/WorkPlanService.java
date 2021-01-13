package top.duanhong.steward.service.workplan;

import top.duanhong.steward.controller.workplan.param.AddNewWorkPlanReq;
import top.duanhong.steward.controller.workplan.param.QueryWorkPlanReq;
import top.duanhong.steward.controller.workplan.param.ScanOverWorkPlan;
import top.duanhong.steward.controller.workplan.param.ScanWorkPlanStatesReq;
import top.duanhong.steward.response.MethodExecuteResult;

public interface WorkPlanService {
    MethodExecuteResult addNewWorkPlan(AddNewWorkPlanReq addNewWorkPlanReq);

    MethodExecuteResult queryWorkPlanList(QueryWorkPlanReq queryWorkPlanReq);

    MethodExecuteResult scanWorkPlanStates(ScanWorkPlanStatesReq scanWorkPlanStatesReq);

    MethodExecuteResult scanOverWorkPlan(ScanOverWorkPlan scanOverWorkPlan);
}
