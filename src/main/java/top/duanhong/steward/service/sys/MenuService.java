package top.duanhong.steward.service.sys;

import top.duanhong.steward.controller.sys.params.AddSysMenuReq;
import top.duanhong.steward.controller.sys.params.DeleteMenuReq;
import top.duanhong.steward.controller.sys.params.MenuNode;
import top.duanhong.steward.controller.sys.params.StewMenuVo;
import top.duanhong.steward.response.MethodExecuteResult;

import java.util.List;

public interface MenuService {

    MethodExecuteResult<List<MenuNode>> querySysMenu();

    MethodExecuteResult addSysMenu(AddSysMenuReq addSysMenuReq);

    MethodExecuteResult deleteMenu(DeleteMenuReq deleteMenuReq);
}
