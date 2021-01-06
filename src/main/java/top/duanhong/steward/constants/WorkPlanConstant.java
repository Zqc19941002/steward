package top.duanhong.steward.constants;

public class WorkPlanConstant {
    public static final String WORK_PLAN_NORMAL_STATE="1";
    public static final String WORK_PLAN_DELETE_STATE="0";
    public static final String WORK_PLAN_DONE_STATE="2";
    public static final String WORK_PLAN_WAR_STATE="3";
    public static final String WORK_PLAN_TODO_STATE="4";
    public static final String WORK_PLAN_EXPIRE_STATE="5";
    public static final String PERIOD_MONTH="m";
    public static final String PERIOD_WEEK="w";
    public static final String PERIOD_DAY="d";

    public static final String TODAY_DONE_COLOR="rgba(19,206,102, 0.8)"; //当天已完成
    public static final String TODAY_TODO_COLOR="rgba(59,145,255, 0.8)"; //当天待完成
    public static final String TODAY_WARNING_COLOR="rgba(255,174,0, 0.8)"; //未来
    public static final String TODAY_EXPIRE_COLOR="rgba(9, 9, 9, 0.2, 0.8)"; //未来
}
