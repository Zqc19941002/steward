package top.duanhong.steward.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.duanhong.steward.entity.po.StewGrid;
import top.duanhong.steward.entity.po.StewGridExample;
import top.duanhong.steward.mapper.gmapper.StewGridMapper;
import top.duanhong.steward.request.AddGridReq;
import top.duanhong.steward.utils.MethodExcuResult;

import java.util.List;

/**
 * @author zhangqc
 * @description
 * @date 2020/2/21
 */
@Service
public class GridService {

    @Autowired
    private StewGridMapper stewGridMapper;

    public List<StewGrid> getGridList() {
        StewGridExample example = new StewGridExample();
        StewGridExample.Criteria criteria = example.createCriteria();
        List<StewGrid> list = stewGridMapper.selectByExample(example);
        return list;
    }

    public MethodExcuResult saveGrid(AddGridReq addGridReq) {
        StewGrid stwGrid = new StewGrid();
        BeanUtils.copyProperties(addGridReq, stwGrid);
        int num = stewGridMapper.insert(stwGrid);
        if (num > 0) {
            return MethodExcuResult.builder().isSuccess(true).mess("保存栅格成功").result(num).build();
        } else {
            return MethodExcuResult.builder().isSuccess(false).mess("保存栅格失败").result(null).build();
        }
    }
}
