package top.duanhong.steward.controller.workplan.param;

import lombok.Data;

@Data
public class QueryWorkPlanReq {
    private String month;
    private String week;
    private String day;
    private String period;//m,w,d
}
