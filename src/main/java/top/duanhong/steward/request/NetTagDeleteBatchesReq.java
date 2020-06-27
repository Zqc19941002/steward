package top.duanhong.steward.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author duanhong
 * @description 网络标签批量删除请求
 * @date 2019/8/15
 */
@Data
public class NetTagDeleteBatchesReq {
    @NotNull(message = "批量删除必须传入选择的id")
    private List<String> selectDataId;
}
