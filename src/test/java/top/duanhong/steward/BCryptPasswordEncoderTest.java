package top.duanhong.steward;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author duanhong
 * @description 密码加密
 * @date 2019/11/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BCryptPasswordEncoderTest {


    @Test
    public void BCryptPasswordEncoderTest(){
        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
        String src=bCryptPasswordEncoder.encode("zqc19941002");
        System.out.println("密码"+src);
    }
}
