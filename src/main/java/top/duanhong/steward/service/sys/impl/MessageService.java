package top.duanhong.steward.service.sys.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.duanhong.steward.constants.MessageConstant;
import top.duanhong.steward.entity.po.Message;
import top.duanhong.steward.entity.po.MessageExample;
import top.duanhong.steward.mapper.gmapper.MessageMapper;
import top.duanhong.steward.request.InsertMessageReq;
import top.duanhong.steward.request.QueryMessageReq;
import top.duanhong.steward.utils.MethodExcuResult;

import java.util.Date;
import java.util.List;

/**
 * @author duanhong
 * @description 消息通知业务
 * @date 2019/8/16
 */
@Service
public class MessageService {
    @Autowired
    private MessageMapper messageMapper;

    @Autowired
    private RedisSequenceService redisSequenceService;

    /*
    初始化时查询未读的消息或者通知
     */
    public MethodExcuResult queryMessage(QueryMessageReq req) {
        MessageExample example=new MessageExample();
        MessageExample.Criteria criteria=example.createCriteria();
        criteria.andStatusEqualTo(MessageConstant.UNREAD);
        List<Message> list=messageMapper.selectByExample(example);
        if (list.size() > 0) {
            return MethodExcuResult.builder()
                    .isSuccess(true)
                    .result(list)
                    .build();
        } else {
            return MethodExcuResult.builder()
                    .isSuccess(false)
                    .code("0006")
                    .mess("暂无消息，或查询出现异常")
                    .build();
        }
    }

    public MethodExcuResult insertMessage(InsertMessageReq req) {
        Message message=new Message();
        message.setContent(req.getContent());
        message.setStatus(MessageConstant.UNREAD);
        message.setTitle(req.getTitle());
        message.setCreateTime(new Date());
        message.setUpdateTime(new Date());
        message.setDescription(req.getDesc());
        message.setMessId(redisSequenceService.generateWithPrefix("MESSAGE_SEQ"));
        int result=messageMapper.insert(message);
        if (result > 0) {
            return MethodExcuResult.builder()
                    .isSuccess(true)
                    .result(result)
                    .build();
        } else {
            return MethodExcuResult.builder()
                    .isSuccess(false)
                    .code("0006")
                    .mess("新增消息时出现异常")
                    .build();
        }
    }
}
