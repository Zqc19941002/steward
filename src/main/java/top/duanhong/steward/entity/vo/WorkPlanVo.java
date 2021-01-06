package top.duanhong.steward.entity.vo;

import lombok.Data;

import java.util.Date;

@Data
public class WorkPlanVo {
    private String id;

    private String title;

    private String start;

    private String end;

    private String color;

    private String content;
}
