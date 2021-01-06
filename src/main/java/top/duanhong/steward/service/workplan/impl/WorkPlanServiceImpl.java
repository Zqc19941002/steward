package top.duanhong.steward.service.workplan.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.duanhong.steward.constants.WorkPlanConstant;
import top.duanhong.steward.controller.workplan.param.AddNewWorkPlanReq;
import top.duanhong.steward.controller.workplan.param.QueryWorkPlanReq;
import top.duanhong.steward.entity.po.StewWorkPlan;
import top.duanhong.steward.entity.po.StewWorkPlanExample;
import top.duanhong.steward.enumeration.SequenceEnum;
import top.duanhong.steward.enumeration.StatusCodeEnum;
import top.duanhong.steward.mapper.gmapper.StewWorkPlanMapper;
import top.duanhong.steward.response.MethodExecuteResult;
import top.duanhong.steward.service.sys.impl.RedisSequenceService;
import top.duanhong.steward.service.workplan.WorkPlanService;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class WorkPlanServiceImpl implements WorkPlanService {
    @Resource
    private StewWorkPlanMapper stewWorkPlanMapper;

    @Autowired
    private RedisSequenceService redisSequenceService;

    @Override
    public MethodExecuteResult addNewWorkPlan(AddNewWorkPlanReq addNewWorkPlanReq) {
        MethodExecuteResult result=new MethodExecuteResult(StatusCodeEnum.SUCCESS_CODE.getMessage(),true,StatusCodeEnum.SUCCESS_CODE.getCode());
        StewWorkPlan stewWorkPlan=new StewWorkPlan();
        stewWorkPlan.setCreateTime(new Date());
        stewWorkPlan.setUpdateTime(new Date());
        stewWorkPlan.setStartTime(addNewWorkPlanReq.getStartTime());
        stewWorkPlan.setEndTime(addNewWorkPlanReq.getEndTime());
        stewWorkPlan.setPlanContent(addNewWorkPlanReq.getPlanContent());
        stewWorkPlan.setPlanName(addNewWorkPlanReq.getPlanName());
        stewWorkPlan.setPlanId(redisSequenceService.generateWithPrefix(SequenceEnum.STEW_WORK_PLAN_SEQ));
        stewWorkPlan.setState(WorkPlanConstant.NORMAL);
        stewWorkPlan.setRemark(addNewWorkPlanReq.getRemark());
        int resultNum=stewWorkPlanMapper.insert(stewWorkPlan);
        if (resultNum>0){
            result.setData(resultNum);
        }else {
            result.setSuccess(false);
            result.setResultCode(StatusCodeEnum.ERROR_CODE.getCode());
            result.setMessage(StatusCodeEnum.ERROR_CODE.getMessage());
            result.setData(null);
        }
        return result;
    }

    @Override
    public MethodExecuteResult queryWorkPlanList(QueryWorkPlanReq queryWorkPlanReq) {
        MethodExecuteResult result=new MethodExecuteResult(StatusCodeEnum.SUCCESS_CODE.getMessage(),true,StatusCodeEnum.SUCCESS_CODE.getCode());
        StewWorkPlanExample example=new StewWorkPlanExample();
        StewWorkPlanExample.Criteria criteria=example.createCriteria();
        if (StringUtils.isNotBlank(queryWorkPlanReq.getMonth())){

        }else {
            if (WorkPlanConstant.PERIOD_MONTH.equals(queryWorkPlanReq.getPeriod())){
                Calendar calendar=Calendar.getInstance();
                /*calendar.set(Calendar.YEAR,Calendar.YEAR);
                calendar.set(Calendar.MONTH, 6);
                calendar.set(Calendar.DAY_OF_MONTH, 1);*/
                /*calendar.add(Calendar.DAY_OF_MONTH, -1);
                Date lastDate = calendar.getTime();
                calendar.set(Calendar.DAY_OF_MONTH, 1);
                Date firstDate = calendar.getTime();*/

                int max=calendar.getMaximum(Calendar.MONTH);
                int min=calendar.getMinimum(Calendar.MONTH);



                Date lastDate = calendar.getTime();
                Date firstDate = calendar.getTime();
                criteria.andStartTimeBetween(firstDate,lastDate);
            }else if (WorkPlanConstant.PERIOD_WEEK.equals(queryWorkPlanReq.getPeriod())){

            }else if (WorkPlanConstant.PERIOD_DAY.equals(queryWorkPlanReq.getPeriod())){

            }
        }
        criteria.andStateNotEqualTo(WorkPlanConstant.DELETE);
        List<StewWorkPlan> list=stewWorkPlanMapper.selectByExample(example);
        result.setData(list);
        return result;
    }
}
