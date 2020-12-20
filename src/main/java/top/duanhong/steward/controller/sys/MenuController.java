package top.duanhong.steward.controller.sys;

import org.apache.zookeeper.proto.DeleteRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import top.duanhong.steward.controller.sys.params.AddSysMenuReq;
import top.duanhong.steward.controller.sys.params.DeleteMenuReq;
import top.duanhong.steward.controller.sys.params.MenuNode;
import top.duanhong.steward.enumeration.StatusCodeEnum;
import top.duanhong.steward.response.BaseResponse;
import top.duanhong.steward.response.MethodExecuteResult;
import top.duanhong.steward.service.sys.MenuService;

import javax.validation.Valid;
import java.util.List;

/**
 * @author duanhong
 * @description 菜单
 * @date 2019/8/11
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    /**
     * 查询菜单节点
     * @return
     */
    @GetMapping("/menuNode")
    public BaseResponse<List<MenuNode>> querySysMenuNode() {
        BaseResponse<List<MenuNode>> baseResponse=new BaseResponse(StatusCodeEnum.SUCCESS_CODE.getMessage(),StatusCodeEnum.SUCCESS_CODE.getCode());
        MethodExecuteResult<List<MenuNode>> methodExecuteResult=menuService.querySysMenu();
        if (methodExecuteResult.isSuccess()){
            baseResponse.setData(methodExecuteResult.getData());
        }else {
            baseResponse.setResultCode(StatusCodeEnum.NO_MENU.getCode());
            baseResponse.setMessage(StatusCodeEnum.NO_MENU.getMessage());
            baseResponse.setData(null);
        }
        return baseResponse;
    }

    /**
     * 查询菜单节点
     * @return
     */
    @PostMapping("/addMenu")
    public BaseResponse addSysMenu(@RequestBody @Valid AddSysMenuReq addSysMenuReq, BindingResult bindingResult) {
        BaseResponse baseResponse=new BaseResponse(StatusCodeEnum.SUCCESS_CODE.getMessage(),StatusCodeEnum.SUCCESS_CODE.getCode());
        if (bindingResult.hasErrors()){
            baseResponse.setResultCode(StatusCodeEnum.ERROR_CODE.getCode());
            baseResponse.setMessage(StatusCodeEnum.ERROR_CODE.getMessage());
            baseResponse.setExtra(bindingResult.getAllErrors());
            return baseResponse;
        }
        MethodExecuteResult methodExecuteResult=menuService.addSysMenu(addSysMenuReq);
        if (methodExecuteResult.isSuccess()){
            baseResponse.setData(methodExecuteResult.getData());
        }else {
            baseResponse.setResultCode(StatusCodeEnum.ERROR_CODE.getCode());
            baseResponse.setMessage(StatusCodeEnum.ERROR_CODE.getMessage());
            baseResponse.setData(null);
        }
        return baseResponse;
    }

    @PostMapping("/deleteMenu")
    public BaseResponse deleteMenu(@RequestBody @Valid DeleteMenuReq deleteMenuReq,BindingResult bindingResult){
        BaseResponse baseResponse=new BaseResponse(StatusCodeEnum.SUCCESS_CODE.getMessage(),StatusCodeEnum.SUCCESS_CODE.getCode());
        if (bindingResult.hasErrors()){
            baseResponse.setResultCode(StatusCodeEnum.ERROR_CODE.getCode());
            baseResponse.setMessage(StatusCodeEnum.ERROR_CODE.getMessage());
            baseResponse.setExtra(bindingResult.getAllErrors());
            return baseResponse;
        }
        MethodExecuteResult methodExecuteResult=menuService.deleteMenu(deleteMenuReq);
        if (methodExecuteResult.isSuccess()){
            baseResponse.setData(methodExecuteResult.getData());
        }else {
            baseResponse.setResultCode(StatusCodeEnum.ERROR_CODE.getCode());
            baseResponse.setMessage(StatusCodeEnum.ERROR_CODE.getMessage());
            baseResponse.setData(null);
        }
        return baseResponse;
    }


}
