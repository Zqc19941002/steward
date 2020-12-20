package top.duanhong.steward.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import top.duanhong.steward.enumeration.StatusCodeEnum;
import top.duanhong.steward.request.AddGridReq;
import top.duanhong.steward.response.SysBaseResponse;
import top.duanhong.steward.service.GridService;
import top.duanhong.steward.utils.MethodExcuResult;
import top.duanhong.steward.utils.ResponseUtil;

import javax.validation.Valid;
import java.util.List;

/**
 * @author zhangqc
 * @description 栅格
 * @date 2020/2/21
 */
@RestController
@RequestMapping("/grid")
public class GridController {

    @Autowired
    private GridService gridService;

    @GetMapping("/list")
    public SysBaseResponse getGridList(){
        List result=gridService.getGridList();
        if (result==null){
            return ResponseUtil.getFailedRes("31651","查询失败");
        }else{
            return ResponseUtil.getSuccessRes(result);
        }
    }

    @PostMapping("/save")
    public SysBaseResponse saveGrid(@RequestBody @Valid AddGridReq addGridReq, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return ResponseUtil.getFailedRes("21665","参数错误");
        }
        MethodExcuResult result =gridService.saveGrid(addGridReq);
        if (result.isSuccess()){
            return SysBaseResponse.builder()
                    .errorCode(StatusCodeEnum.SUCCESS_CODE.getCode())
                    .errorMessage(result.getMess())
                    .body(result.getResult())
                    .build();
        }else{
            return ResponseUtil.getFailedRes(result.getCode(),result.getMess());
        }
    }


}
