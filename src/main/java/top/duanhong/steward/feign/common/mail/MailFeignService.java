package top.duanhong.steward.feign.common.mail;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import top.duanhong.steward.feign.common.mail.params.SendMailReq;
import top.duanhong.steward.response.BaseResponse;

@FeignClient("common-tools")
public interface MailFeignService {

    @PostMapping("common-tools/mail/send")
    BaseResponse sendMail(SendMailReq sendMailReq);

}
