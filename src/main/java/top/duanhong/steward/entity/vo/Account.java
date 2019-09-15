package top.duanhong.steward.entity.vo;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author duanhong
 * @description 账号信息
 * @date 2019/8/12
 */
@Data
public class Account {
    private String name;
    private String desc;
    private String email;
    private String org;
    private String dept;
    private String title;
    private String location;
    private List<String> tags;
    private String avatar;

    public Account(String name, String desc, String email, String org, String dept, String title, String location, List<String> tags, String avatar) {
        this.name = name;
        this.desc = desc;
        this.email = email;
        this.org = org;
        this.dept = dept;
        this.title = title;
        this.location = location;
        this.tags = tags;
        this.avatar = avatar;
    }
}
