package top.duanhong.steward.service.chat.impl;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.duanhong.steward.constants.ChatHelperConstant;
import top.duanhong.steward.controller.chat.params.AddChatRoomReq;
import top.duanhong.steward.controller.chat.params.ChatRoomVo;
import top.duanhong.steward.controller.chat.params.QueryChatRoomReq;
import top.duanhong.steward.entity.po.StewChatRoom;
import top.duanhong.steward.entity.po.StewChatRoomExample;
import top.duanhong.steward.enumeration.SequenceEnum;
import top.duanhong.steward.enumeration.StatusCodeEnum;
import top.duanhong.steward.mapper.gmapper.StewChatRoomMapper;
import top.duanhong.steward.response.MethodExecuteResult;
import top.duanhong.steward.service.chat.ChatRoomService;
import top.duanhong.steward.service.sys.impl.RedisSequenceService;
import top.duanhong.steward.utils.QiNiuUtil;
import top.duanhong.steward.utils.StringUtil;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class ChatRoomServiceImpl implements ChatRoomService {

    @Resource
    private StewChatRoomMapper chatRoomMapper;

    @Autowired
    private RedisSequenceService sequenceService;

    @Override
    public MethodExecuteResult queryChatRoom(QueryChatRoomReq queryRoomReq) {
        MethodExecuteResult result = new MethodExecuteResult(StatusCodeEnum.SUCCESS_CODE.getMessage(), true, StatusCodeEnum.SUCCESS_CODE.getCode());

        StewChatRoomExample example = new StewChatRoomExample();
        StewChatRoomExample.Criteria criteria = example.createCriteria();
        /*Date currentDate=new Date();

        criteria.andExpiryTimeGreaterThanOrEqualTo(currentDate);*/

        //永久聊天室一直可查
        criteria.andRoomStateNotEqualTo(ChatHelperConstant.CHAT_STATE_DELETE);
        criteria.andUserIdEqualTo(queryRoomReq.getUserId());

        List<StewChatRoom> list = chatRoomMapper.selectByExample(example);
        List<ChatRoomVo> chatRoomVos = new ArrayList<>();
        Date currentDate = new Date();
        for (StewChatRoom stewChatRoom : list) {
            ChatRoomVo chatRoomVo = new ChatRoomVo();
            boolean isExpiry = false;
            Date expiryDate = stewChatRoom.getExpiryTime();
            if (expiryDate != null && (expiryDate.getTime() < currentDate.getTime())) {
                isExpiry = true;
            }
            if (ChatHelperConstant.CHAT_STATE_ALWAYS.equals(stewChatRoom.getRoomState()) || !isExpiry) {
                BeanUtils.copyProperties(stewChatRoom, chatRoomVo);
                if (StringUtils.isNotBlank(stewChatRoom.getAvatar()) || !isExpiry) {
                    chatRoomVo.setAvatar(QiNiuUtil.getDownloadUrl(stewChatRoom.getAvatar(), true));
                }
                chatRoomVos.add(chatRoomVo);
            }
        }
        result.setData(chatRoomVos);
        return result;
    }

    @Override
    public MethodExecuteResult addChatRoom(AddChatRoomReq addChatRoomReq) {
        MethodExecuteResult result = new MethodExecuteResult(StatusCodeEnum.SUCCESS_CODE.getMessage(), true, StatusCodeEnum.SUCCESS_CODE.getCode());
        StewChatRoom stewChatRoom = new StewChatRoom();
        stewChatRoom.setCreateTime(new Date());
        stewChatRoom.setUpdateTime(new Date());
        stewChatRoom.setRoomId(sequenceService.generateWithPrefix(SequenceEnum.STEW_CHAT_ROOM_SEQ));
        stewChatRoom.setRoomName(addChatRoomReq.getRoomName());
        stewChatRoom.setRoomDesc(addChatRoomReq.getRoomDesc());
        stewChatRoom.setAvatar(addChatRoomReq.getRoomAvatar());
        stewChatRoom.setUserId(addChatRoomReq.getUserId());
        if (addChatRoomReq.isAlways()) {
            stewChatRoom.setRoomState(ChatHelperConstant.CHAT_STATE_ALWAYS);
        } else {
            stewChatRoom.setRoomState(ChatHelperConstant.CHAT_STATE_NORMAL);
            stewChatRoom.setExpiryTime(addChatRoomReq.getExpiryTime());
        }
        int resultNum = chatRoomMapper.insert(stewChatRoom);
        if (resultNum > 0) {
            result.setData(resultNum);
        } else {
            result.setSuccess(false);
        }
        return result;
    }
}
