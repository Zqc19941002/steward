package top.duanhong.steward.service.workplan.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.duanhong.steward.constants.DateConstant;
import top.duanhong.steward.constants.WorkPlanConstant;
import top.duanhong.steward.controller.workplan.param.AddNewWorkPlanReq;
import top.duanhong.steward.controller.workplan.param.QueryWorkPlanReq;
import top.duanhong.steward.entity.po.StewWorkPlan;
import top.duanhong.steward.entity.po.StewWorkPlanExample;
import top.duanhong.steward.entity.vo.WorkPlanVo;
import top.duanhong.steward.enumeration.SequenceEnum;
import top.duanhong.steward.enumeration.StatusCodeEnum;
import top.duanhong.steward.mapper.gmapper.StewWorkPlanMapper;
import top.duanhong.steward.response.MethodExecuteResult;
import top.duanhong.steward.service.sys.impl.RedisSequenceService;
import top.duanhong.steward.service.workplan.WorkPlanService;
import top.duanhong.steward.utils.DateUtil;

import javax.annotation.Resource;
import java.util.ArrayList;
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
        MethodExecuteResult result = new MethodExecuteResult(StatusCodeEnum.SUCCESS_CODE.getMessage(), true, StatusCodeEnum.SUCCESS_CODE.getCode());
        StewWorkPlan stewWorkPlan = new StewWorkPlan();
        stewWorkPlan.setCreateTime(new Date());
        stewWorkPlan.setUpdateTime(new Date());
        stewWorkPlan.setStartTime(addNewWorkPlanReq.getStartTime());
        stewWorkPlan.setEndTime(addNewWorkPlanReq.getEndTime());
        stewWorkPlan.setPlanContent(addNewWorkPlanReq.getPlanContent());
        stewWorkPlan.setPlanName(addNewWorkPlanReq.getPlanName());
        stewWorkPlan.setPlanId(redisSequenceService.generateWithPrefix(SequenceEnum.STEW_WORK_PLAN_SEQ));
        stewWorkPlan.setState(WorkPlanConstant.WORK_PLAN_TODO_STATE);
        stewWorkPlan.setRemark(addNewWorkPlanReq.getRemark());
        int resultNum = stewWorkPlanMapper.insert(stewWorkPlan);
        if (resultNum > 0) {
            result.setData(resultNum);
        } else {
            result.setSuccess(false);
            result.setResultCode(StatusCodeEnum.ERROR_CODE.getCode());
            result.setMessage(StatusCodeEnum.ERROR_CODE.getMessage());
            result.setData(null);
        }
        return result;
    }

    @Override
    public MethodExecuteResult queryWorkPlanList(QueryWorkPlanReq queryWorkPlanReq) {
        MethodExecuteResult result = new MethodExecuteResult(StatusCodeEnum.SUCCESS_CODE.getMessage(), true, StatusCodeEnum.SUCCESS_CODE.getCode());
        StewWorkPlanExample example = new StewWorkPlanExample();
        StewWorkPlanExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(queryWorkPlanReq.getMonth()) && StringUtils.isNotBlank(queryWorkPlanReq.getWeek()) && StringUtils.isNotBlank(queryWorkPlanReq.getDay())) {
            Date firstDate = null;
            Date lastDate = null;
            //获取当前月第一天：
            Calendar c = Calendar.getInstance();
            c.add(Calendar.MONTH, 0);
            c.set(Calendar.DAY_OF_MONTH, 1);//设置为1号,当前日期既为本月第一天
            firstDate = c.getTime();
            System.out.println("===============first:" + DateUtil.dateFormat(firstDate, DateConstant.DATE_FORMAT_FIRST));
            //获取当前月最后一天
            Calendar ca = Calendar.getInstance();
            ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
            lastDate = ca.getTime();
            System.out.println("===============last:" + DateUtil.dateFormat(lastDate, DateConstant.DATE_FORMAT_FIRST));
            criteria.andStartTimeBetween(firstDate, lastDate);
        } else {
            if (WorkPlanConstant.PERIOD_MONTH.equals(queryWorkPlanReq.getPeriod())) {
                Date firstDate = null;
                Date lastDate = null;
                //获取当前月第一天：
                Calendar c = Calendar.getInstance();
                c.add(Calendar.MONTH, 0);
                c.set(Calendar.DAY_OF_MONTH, 1);//设置为1号,当前日期既为本月第一天
                firstDate = c.getTime();
                System.out.println("===============first:" + DateUtil.dateFormat(firstDate, DateConstant.DATE_FORMAT_FIRST));
                //获取当前月最后一天
                Calendar ca = Calendar.getInstance();
                ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
                lastDate = ca.getTime();
                System.out.println("===============last:" + DateUtil.dateFormat(lastDate, DateConstant.DATE_FORMAT_FIRST));
                criteria.andStartTimeBetween(firstDate, lastDate);
            } else if (WorkPlanConstant.PERIOD_WEEK.equals(queryWorkPlanReq.getPeriod())) {
                int dayOfWeek = DateUtil.getDayOfWeek();
                Date firstDate = null;
                Date lastDate = null;
                //获取当前周第一天：
                Calendar c = Calendar.getInstance();
                c.add(Calendar.DAY_OF_MONTH, -1 * dayOfWeek);
                c.set(Calendar.HOUR, 23);
                c.set(Calendar.MINUTE, 59);
                c.set(Calendar.SECOND, 59);
                firstDate = c.getTime();
                System.out.println("===============first:" + DateUtil.dateFormat(firstDate, DateConstant.DATE_FORMAT_SECOND));
                //获取当前周最后一天
                Calendar ca = Calendar.getInstance();
                ca.add(Calendar.DAY_OF_MONTH, 7 - dayOfWeek);
                ca.set(Calendar.HOUR, 23);
                ca.set(Calendar.MINUTE, 59);
                ca.set(Calendar.SECOND, 59);
                lastDate = ca.getTime();
                System.out.println("===============last:" + DateUtil.dateFormat(lastDate, DateConstant.DATE_FORMAT_SECOND));
                criteria.andStartTimeBetween(firstDate, lastDate);
            } else if (WorkPlanConstant.PERIOD_DAY.equals(queryWorkPlanReq.getPeriod())) {
                Date firstDate = null;
                Date lastDate = null;
                //获取当前周第一天：
                Calendar c = Calendar.getInstance();
                // 时
                c.set(Calendar.HOUR_OF_DAY, 0);
                // 分
                c.set(Calendar.MINUTE, 0);
                // 秒
                c.set(Calendar.SECOND, 0);
                // 毫秒
                c.set(Calendar.MILLISECOND, 0);
                firstDate = c.getTime();
                System.out.println("===============first:" + DateUtil.dateFormat(firstDate, DateConstant.DATE_FORMAT_SECOND));
                //获取当前周最后一天
                Calendar ca = Calendar.getInstance();
                // 时
                ca.set(Calendar.HOUR_OF_DAY, 23);
                // 分
                ca.set(Calendar.MINUTE, 59);
                // 秒
                ca.set(Calendar.SECOND, 59);
                lastDate = ca.getTime();
                System.out.println("===============last:" + DateUtil.dateFormat(lastDate, DateConstant.DATE_FORMAT_SECOND));
                criteria.andStartTimeBetween(firstDate, lastDate);
            }
        }
        criteria.andStateNotEqualTo(WorkPlanConstant.WORK_PLAN_DELETE_STATE);
        List<StewWorkPlan> list = stewWorkPlanMapper.selectByExample(example);
        List<WorkPlanVo> workPlanVos = new ArrayList<>();
        for (StewWorkPlan stewWorkPlan : list) {
            WorkPlanVo workPlanVo = new WorkPlanVo();
            BeanUtils.copyProperties(stewWorkPlan, workPlanVo);
            switch (stewWorkPlan.getState()) {
                case WorkPlanConstant.WORK_PLAN_DONE_STATE:
                    workPlanVo.setColor(WorkPlanConstant.TODAY_DONE_COLOR);
                    break;
                case WorkPlanConstant.WORK_PLAN_TODO_STATE:
                    workPlanVo.setColor(WorkPlanConstant.TODAY_TODO_COLOR);
                    break;
                case WorkPlanConstant.WORK_PLAN_WAR_STATE:
                    workPlanVo.setColor(WorkPlanConstant.TODAY_WARNING_COLOR);
                    break;
                case WorkPlanConstant.WORK_PLAN_EXPIRE_STATE:
                    workPlanVo.setColor(WorkPlanConstant.TODAY_EXPIRE_COLOR);
                    break;
                default:
                    break;
            }
            workPlanVo.setId(stewWorkPlan.getPlanId());
            workPlanVo.setTitle(stewWorkPlan.getPlanName());
            workPlanVo.setStart(DateUtil.dateFormat(stewWorkPlan.getStartTime(),DateConstant.DATE_FORMAT_SECOND));
            workPlanVo.setEnd(DateUtil.dateFormat(stewWorkPlan.getEndTime(),DateConstant.DATE_FORMAT_SECOND));
            workPlanVo.setContent(stewWorkPlan.getPlanContent());
            workPlanVos.add(workPlanVo);
        }
        result.setData(workPlanVos);
        return result;
    }
}
