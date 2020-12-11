package top.duanhong.steward.controller.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.duanhong.steward.controller.sys.params.StewMenuVo;
import top.duanhong.steward.entity.po.StewMenu;
import top.duanhong.steward.enumeration.StatusCodeEnum;
import top.duanhong.steward.response.BaseResponse;
import top.duanhong.steward.service.sys.MenuService;

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

    @GetMapping("list")
    public BaseResponse querySysMenu() {
        return BaseResponse.builder()
                .errorCode(StatusCodeEnum.SUCCESS_CODE.getCode())
                .errorMessage(StatusCodeEnum.SUCCESS_CODE.getMessage())
                .body(null)
                .build();
    }
}
