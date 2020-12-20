package top.duanhong.steward.service.sys.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import top.duanhong.steward.controller.sys.params.AddSysMenuReq;
import top.duanhong.steward.controller.sys.params.DeleteMenuReq;
import top.duanhong.steward.controller.sys.params.MenuNode;
import top.duanhong.steward.entity.po.StewMenu;
import top.duanhong.steward.entity.po.StewMenuExample;
import top.duanhong.steward.enumeration.SequenceEnum;
import top.duanhong.steward.mapper.gmapper.StewMenuMapper;
import top.duanhong.steward.response.MethodExecuteResult;
import top.duanhong.steward.service.RedisSequenceService;
import top.duanhong.steward.service.sys.MenuService;
import top.duanhong.steward.utils.TreeMenuUtil;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Resource
    private StewMenuMapper stewMenuMapper;

    @Autowired
    private RedisSequenceService redisSequenceService;


    @Override
    public MethodExecuteResult<List<MenuNode>> querySysMenu() {
        MethodExecuteResult result=new MethodExecuteResult();
        StewMenuExample example=new StewMenuExample();
        StewMenuExample.Criteria criteria=example.createCriteria();
        List<StewMenu> menuList=stewMenuMapper.selectByExample(example);
        List<MenuNode> nodeList=new ArrayList<>();
        for (StewMenu menu: menuList) {
            MenuNode node=new MenuNode();
            BeanUtils.copyProperties(menu,node);
            nodeList.add(node);
        }
        if (!CollectionUtils.isEmpty(nodeList)){
            List<MenuNode> list= TreeMenuUtil.toTree(nodeList);
            result.setData(list);
            result.setSuccess(true);
        }else {
            result.setData(new ArrayList<>());
            result.setSuccess(false);
        }
        return result;
    }

    @Override
    public MethodExecuteResult addSysMenu(AddSysMenuReq addSysMenuReq) {
        MethodExecuteResult result=new MethodExecuteResult();
        StewMenu stewMenu=new StewMenu();
        stewMenu.setCreateBy("duanhong");
        stewMenu.setCreateDate(new Date());
        stewMenu.setMenuKey(addSysMenuReq.getMenuKey());
        stewMenu.setMenuName(addSysMenuReq.getMenuName());
        stewMenu.setParentId(addSysMenuReq.getParentMenuId());
        stewMenu.setRemarks(addSysMenuReq.getMenuRemarks());
        stewMenu.setUpdateDate(new Date());
        stewMenu.setIcon(addSysMenuReq.getMenuIcon());
        stewMenu.setId(redisSequenceService.generateWithPrefix(SequenceEnum.STEW_MENU_SEQ));
        int resultNum=stewMenuMapper.insert(stewMenu);
        if (resultNum>0){
            result.setSuccess(true);
            result.setData(resultNum);
        }else {
            result.setSuccess(false);
        }
        return result;
    }

    @Override
    public MethodExecuteResult deleteMenu(DeleteMenuReq deleteMenuReq) {
        MethodExecuteResult result=new MethodExecuteResult();
//        =stewMenuMapper.deleteByPrimaryKey(deleteMenuReq.getMenuId());

        StewMenuExample example=new StewMenuExample();
        //公共条件
        StewMenuExample.Criteria criteria=example.createCriteria();


        StewMenuExample.Criteria criteria1=example.createCriteria();
        criteria1.getCriteria().clear();
        criteria1.getCriteria().addAll(criteria.getCriteria());
        criteria1.andIdEqualTo(deleteMenuReq.getMenuId());

        StewMenuExample.Criteria criteria2=example.createCriteria();
        criteria2.getCriteria().clear();
        criteria2.getCriteria().addAll(criteria.getCriteria());
        criteria2.andParentIdEqualTo(deleteMenuReq.getMenuId());


        example.or(criteria1);
        example.or(criteria2);

        int resultNum=stewMenuMapper.deleteByExample(example);

        if (resultNum>0){
            result.setSuccess(true);
            result.setData(resultNum);
        }else {
            result.setSuccess(false);
        }
        return result;
    }
}
