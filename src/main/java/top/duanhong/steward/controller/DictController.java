package top.duanhong.steward.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import top.duanhong.steward.request.DictAddReq;
import top.duanhong.steward.request.QueryDictReq;
import top.duanhong.steward.response.SysBaseResponse;
import top.duanhong.steward.service.DictService;
import top.duanhong.steward.utils.MethodExcuResult;
import top.duanhong.steward.utils.ResponseUtil;

import javax.validation.Valid;

/**
 * @author duanhong
 * @description 字典接口
 * @date 2019/8/16
 */
@RequestMapping("/dict")
@Slf4j
@RestController
public class DictController {

    @Autowired
    private DictService dictService;

    @GetMapping("/query")
    public SysBaseResponse queryDict(){
        QueryDictReq req=new QueryDictReq();
        MethodExcuResult result=dictService.queryDict(req);
        if (result.isSuccess()){
            return ResponseUtil.getSuccessRes(result.getResult());
        }else {
            return ResponseUtil.getFailedRes(result.getCode(),result.getMess());
        }
    }

    @PostMapping("/insert")
    public SysBaseResponse insertDict(@RequestBody @Valid DictAddReq req, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            log.error("字典新增异常");
            return ResponseUtil.getFailedRes("0005","字典新增异常");
        }
        MethodExcuResult result=dictService.insertDict(req);
        if (result.isSuccess()){
            return ResponseUtil.getSuccessRes(result.getResult());
        }else {
            return ResponseUtil.getFailedRes(result.getCode(),result.getMess());
        }
    }
}
