package top.duanhong.steward.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.duanhong.steward.entity.vo.Account;
import top.duanhong.steward.response.SysBaseResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author duanhong
 * @description 账户信息
 * @date 2019/8/12
 */
@RestController
@RequestMapping("/account")
@Slf4j
public class AccountController {

    @GetMapping("/info")
    public SysBaseResponse getInfo(){
        List<String> list=new ArrayList<>();
        list.add("平易近人");
        list.add("热爱运动");
        list.add("为人忠实");
        Account account=new Account("断鸿","执着于理想，纯粹于当下","zhangqc@asiainfo.com","亚信（中国）科技有限公司","CMC","全栈开发工程师","北京",list,"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1568223113&di=806980252eb8f351f3d6b7f916870cea&imgtype=jpg&er=1&src=http%3A%2F%2Fnews.youth.cn%2Fyl%2F201704%2FW020170403332736642656.jpg");
        log.info("++++++++++++++++++++++++账号信息查询"+account.toString());
        return SysBaseResponse.builder()
                .errorCode("0000")
                .errorMessage("测试成功")
                .body(account)
                .build();
    }

}
