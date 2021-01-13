package top.duanhong.steward.service.workplan.impl;

import com.alibaba.druid.support.spring.stat.annotation.Stat;
import com.sun.corba.se.spi.orbutil.threadpool.Work;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import top.duanhong.steward.constants.DateConstant;
import top.duanhong.steward.constants.WorkPlanConstant;
import top.duanhong.steward.controller.workplan.param.AddNewWorkPlanReq;
import top.duanhong.steward.controller.workplan.param.QueryWorkPlanReq;
import top.duanhong.steward.controller.workplan.param.ScanOverWorkPlan;
import top.duanhong.steward.controller.workplan.param.ScanWorkPlanStatesReq;
import top.duanhong.steward.entity.po.StewWorkPlan;
import top.duanhong.steward.entity.po.StewWorkPlanExample;
import top.duanhong.steward.entity.vo.WorkPlanVo;
import top.duanhong.steward.enumeration.SequenceEnum;
import top.duanhong.steward.enumeration.StatusCodeEnum;
import top.duanhong.steward.feign.common.mail.MailFeignService;
import top.duanhong.steward.feign.common.mail.params.SendMailReq;
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
@Slf4j
public class WorkPlanServiceImpl implements WorkPlanService {

    @Resource
    private StewWorkPlanMapper stewWorkPlanMapper;

    @Autowired
    private RedisSequenceService redisSequenceService;

    @Autowired
    private MailFeignService mailFeignService;

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
        stewWorkPlan.setState(WorkPlanConstant.WORK_PLAN_NORMAL_STATE);
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
            //设置日期
            if (StringUtils.isNotBlank(queryWorkPlanReq.getDay())) {
                c.set(Calendar.DAY_OF_MONTH, Integer.parseInt(queryWorkPlanReq.getDay()));
            }
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
            if (StringUtils.isNotBlank(queryWorkPlanReq.getDay())) {
                ca.set(Calendar.DAY_OF_MONTH, Integer.parseInt(queryWorkPlanReq.getDay()));
            }
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
                case WorkPlanConstant.PASS_USELESS_STATE:
                    workPlanVo.setColor(WorkPlanConstant.PASS_USELESS_COLOR);
                    break;
                default:
                    break;
            }
            workPlanVo.setId(stewWorkPlan.getPlanId());
            workPlanVo.setTitle(stewWorkPlan.getPlanName());
            if (stewWorkPlan.getStartTime() != null) {
                workPlanVo.setStart(DateUtil.dateFormat(stewWorkPlan.getStartTime(), DateConstant.DATE_FORMAT_SECOND));
            }
            if (stewWorkPlan.getEndTime() != null) {
                workPlanVo.setEnd(DateUtil.dateFormat(stewWorkPlan.getEndTime(), DateConstant.DATE_FORMAT_SECOND));
            }
            workPlanVo.setContent(stewWorkPlan.getPlanContent());
            workPlanVos.add(workPlanVo);
        }
        result.setData(workPlanVos);
        return result;
    }

    @Override
    public MethodExecuteResult scanWorkPlanStates(ScanWorkPlanStatesReq scanWorkPlanStatesReq) {
        MethodExecuteResult result = new MethodExecuteResult(StatusCodeEnum.SUCCESS_CODE.getMessage(), true, StatusCodeEnum.SUCCESS_CODE.getCode());
        StewWorkPlanExample example = new StewWorkPlanExample();
        StewWorkPlanExample.Criteria criteria = example.createCriteria();
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
        //获取当前周最后一天
        Calendar ca = Calendar.getInstance();
        // 时
        ca.set(Calendar.HOUR_OF_DAY, 23);
        // 分
        ca.set(Calendar.MINUTE, 59);
        // 秒
        ca.set(Calendar.SECOND, 59);
        lastDate = ca.getTime();
        criteria.andStartTimeBetween(firstDate, lastDate);
        criteria.andStateNotEqualTo(WorkPlanConstant.WORK_PLAN_DELETE_STATE);
        List<StewWorkPlan> list = stewWorkPlanMapper.selectByExample(example);

        /**
         * 状态判断开始
         * 1、今天已完成为done
         * 2、今天未来两小时要完成的为war,发送邮件或者短信给用户提醒
         * 3、今天两小时以后为todo
         */
        if (CollectionUtils.isEmpty(list)){
            log.info("未查询到当天工作计划！");
            result.setMessage("未查询到当天工作计划！");
        }else {
            Date currTime = new Date();
            long[] futureTwoHours = DateUtil.getCurrentAfterTwoHours();
            for (StewWorkPlan stewWorkPlan : list) {
                StewWorkPlan newStewWorkPlan = new StewWorkPlan();
                //只处理未完成的
                if (!WorkPlanConstant.WORK_PLAN_DONE_STATE.equals(stewWorkPlan.getState())){
                    //未完成并且已过时的标记为过期
                    if (stewWorkPlan.getStartTime().getTime() < currTime.getTime()) {
                        newStewWorkPlan.setState(WorkPlanConstant.WORK_PLAN_EXPIRE_STATE);
                    }
                    //未来两小时以内标记为提醒
                    if (stewWorkPlan.getStartTime().getTime() >= futureTwoHours[0] && stewWorkPlan.getStartTime().getTime() <= futureTwoHours[1]) {
                        newStewWorkPlan.setState(WorkPlanConstant.WORK_PLAN_WAR_STATE);
                        //查询出两小时内的工作计划准备发送邮件或者短信
                        //最后一次发送短信或者邮件
                        SendMailReq sendMailReq=new SendMailReq();
                        sendMailReq.setSubject("您最近两个小时将有工作计划需要处理，请注意！");
                        sendMailReq.setTitle("工作计划提醒");
                        sendMailReq.setToMail("980528586@qq.com");
                        sendMailReq.setContent("最近两个小时将有工作计划提醒");
                        mailFeignService.sendMail(sendMailReq);
                    }
                    //两小时以后标记为待办
                    if (stewWorkPlan.getStartTime().getTime()>futureTwoHours[1]){
                        newStewWorkPlan.setState(WorkPlanConstant.WORK_PLAN_TODO_STATE);
                    }
                    StewWorkPlanExample updateExample=new StewWorkPlanExample();
                    StewWorkPlanExample.Criteria updateCriteria=updateExample.createCriteria();
                    updateCriteria.andPlanIdEqualTo(stewWorkPlan.getPlanId());
                    int updateNum=stewWorkPlanMapper.updateByExampleSelective(newStewWorkPlan,updateExample);
                    if (updateNum>0){
                        log.info("工作计划：{}，状态已更新为：{}",stewWorkPlan.getPlanName(),newStewWorkPlan.getState());
                    }
                }
            }
        }
        return result;
    }

    @Override
    public MethodExecuteResult scanOverWorkPlan(ScanOverWorkPlan scanOverWorkPlan) {
        MethodExecuteResult result = new MethodExecuteResult(StatusCodeEnum.SUCCESS_CODE.getMessage(), true, StatusCodeEnum.SUCCESS_CODE.getCode());
        //扫描昨天的工作计划，未完成的标记为过期，已完成为失效，每天凌晨执行
        Calendar yesterday=Calendar.getInstance();
        yesterday.add(Calendar.DAY_OF_MONTH,-1);
        // 时
        yesterday.set(Calendar.HOUR_OF_DAY, 0);
        // 分
        yesterday.set(Calendar.MINUTE, 0);
        // 秒
        yesterday.set(Calendar.SECOND, 0);
        // 毫秒
        yesterday.set(Calendar.MILLISECOND, 0);

        Calendar today=Calendar.getInstance();
        // 时
        today.set(Calendar.HOUR_OF_DAY, 0);
        // 分
        today.set(Calendar.MINUTE, 0);
        // 秒
        today.set(Calendar.SECOND, 0);
        // 毫秒
        today.set(Calendar.MILLISECOND, 0);

        StewWorkPlanExample example=new StewWorkPlanExample();
        StewWorkPlanExample.Criteria criteria=example.createCriteria();
        criteria.andStartTimeBetween(yesterday.getTime(),today.getTime());
        criteria.andStateNotEqualTo(WorkPlanConstant.WORK_PLAN_DELETE_STATE);
        List<StewWorkPlan> list=stewWorkPlanMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(list)){
            for (StewWorkPlan stewWorkPlan:list) {
                StewWorkPlan newStewWorkPlan=new StewWorkPlan();
                if (WorkPlanConstant.WORK_PLAN_DONE_STATE.equals(stewWorkPlan.getState())){
                    //已完成则工作计划已失效
                    newStewWorkPlan.setState(WorkPlanConstant.PASS_USELESS_STATE);
                }else {
                    newStewWorkPlan.setState(WorkPlanConstant.WORK_PLAN_EXPIRE_STATE);
                    //最后一次发送短信或者邮件
                    SendMailReq sendMailReq=new SendMailReq();
                    sendMailReq.setSubject("工作计划最后一次提醒，请及时处理！");
                    sendMailReq.setTitle("工作计划提醒");
                    sendMailReq.setToMail("980528586@qq.com");
                    sendMailReq.setContent("工作计划最后一次提醒，请及时处理！");
                    mailFeignService.sendMail(sendMailReq);
                }
                StewWorkPlanExample updateExample=new StewWorkPlanExample();
                StewWorkPlanExample.Criteria updateCriteria=updateExample.createCriteria();
                updateCriteria.andPlanIdEqualTo(stewWorkPlan.getPlanId());
                int resultNum=stewWorkPlanMapper.updateByExampleSelective(newStewWorkPlan,updateExample);
                if (resultNum>0){
                    log.info("工作计划：{}，状态更新为：{}",stewWorkPlan.getPlanName(),newStewWorkPlan.getState());
                }
            }
        }
        return result;
    }
}
