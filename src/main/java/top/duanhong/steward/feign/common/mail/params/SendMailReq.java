package top.duanhong.steward.feign.common.mail.params;

import lombok.Data;

@Data
public class SendMailReq<T> {
    private String title;
    private String toMail;
    private String content;
    private String subject;

}
