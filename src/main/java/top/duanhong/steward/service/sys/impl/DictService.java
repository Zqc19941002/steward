package top.duanhong.steward.service.sys.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.duanhong.steward.entity.po.Dict;
import top.duanhong.steward.entity.po.DictExample;
import top.duanhong.steward.mapper.gmapper.DictMapper;
import top.duanhong.steward.request.DictAddReq;
import top.duanhong.steward.request.QueryDictReq;
import top.duanhong.steward.utils.MethodExcuResult;

import java.util.Date;
import java.util.List;

/**
 * @author duanhong
 * @description 字典查询业务
 * @date 2019/8/16
 */
@Service
public class DictService {

    @Autowired
    DictMapper dictMapper;

    @Autowired
    RedisSequenceService redisSequenceService;

    public MethodExcuResult queryDict(QueryDictReq req) {
        DictExample example = new DictExample();
        List<Dict> list = dictMapper.selectByExample(example);
        if (list.size() > 0) {
            return MethodExcuResult.builder()
                    .isSuccess(true)
                    .result(list)
                    .build();
        } else {
            return MethodExcuResult.builder()
                    .isSuccess(false)
                    .code("0005")
                    .mess("暂无字段数据或者，查询出现异常")
                    .build();
        }
    }

    public MethodExcuResult insertDict(DictAddReq req) {
        Dict dict = new Dict();
        String dictId = redisSequenceService.generateWithPrefix("DICT_SEQ");
        dict.setCreateTime(new Date());
        dict.setUpdateTime(new Date());
        dict.setDictKey(req.getKey());
        dict.setDictValue(req.getValue());
        dict.setId(dictId);
        int result = dictMapper.insert(dict);
        if (result > 0) {
            return MethodExcuResult.builder()
                    .isSuccess(true)
                    .result(result)
                    .build();
        } else {
            return MethodExcuResult.builder()
                    .isSuccess(false)
                    .code("0005")
                    .mess("字典新增异常")
                    .build();
        }
    }
}
