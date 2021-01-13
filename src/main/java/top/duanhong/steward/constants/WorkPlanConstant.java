package top.duanhong.steward.constants;

public class WorkPlanConstant {
    public static final String WORK_PLAN_NORMAL_STATE="1";
    public static final String WORK_PLAN_DELETE_STATE="0";
    public static final String WORK_PLAN_DONE_STATE="2";//当天已完成
    public static final String WORK_PLAN_WAR_STATE="3";//未来两小时提醒
    public static final String WORK_PLAN_TODO_STATE="4";//当天两小时以后待完成
    public static final String WORK_PLAN_EXPIRE_STATE="5";//当天已过期的
    public static final String PASS_USELESS_STATE="6";//当天以前（过去）已失效的，
    public static final String PERIOD_MONTH="m";
    public static final String PERIOD_WEEK="w";
    public static final String PERIOD_DAY="d";

    public static final String TODAY_DONE_COLOR="rgba(19,206,102, 0.8)"; //当天已完成-蓝
    public static final String TODAY_TODO_COLOR="rgba(59,145,255, 0.8)"; //当天两小时以后待完成-绿
    public static final String TODAY_WARNING_COLOR="rgba(255,174,0, 0.8)"; //未来两小时提醒-黄
    public static final String PASS_USELESS_COLOR="rgba(193,193,193, 0.8)"; //当天以前（过去）已失效的-灰
    public static final String TODAY_EXPIRE_COLOR="rgba(225,22,23, 0.8)"; //当天已过期的-红
}
