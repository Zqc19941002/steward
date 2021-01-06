package top.duanhong.steward.controller.workplan.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class AddNewWorkPlanReq {

    @NotBlank(message = "计划名称不能为空")
    private String planName;

    @NotBlank(message = "计划内容不能为空")
    private String planContent;

    private Date startTime;
    private Date endTime;
    private String remark;
}
