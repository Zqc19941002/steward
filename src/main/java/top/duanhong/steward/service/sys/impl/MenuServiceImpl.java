package top.duanhong.steward.service.sys.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.duanhong.steward.mapper.gmapper.StewMenuMapper;
import top.duanhong.steward.service.sys.MenuService;

import javax.annotation.Resource;

@Service
public class MenuServiceImpl implements MenuService {

    @Resource
    private StewMenuMapper stewMenuMapper;



}
