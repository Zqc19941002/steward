package top.duanhong.steward;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.duanhong.steward.utils.DateUtil;

import java.util.UUID;

public class UUIDTest {

    public static void main(String[] args) {
        String UUID= java.util.UUID.randomUUID().toString();
        System.out.println("UUID:"+UUID);
    }

}
