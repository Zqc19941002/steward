package top.duanhong.steward.utils;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * mongodb文件系统工具类
 */
@Component
@RefreshScope
public class MongoFileSystemUtil {

    //@Value("${spring.data.mongodb.database}")
    public static String dataBase="steward";

    //@Value("${spring.data.mongodb.host}")
    public static String mongoHost="192.168.0.111";

    //@Value("${spring.data.mongodb.port}")
    public static int mongoPort=27017;

    /**
     * 获取文件存储数据库
     * @return
     * @throws Exception
     */
    public static MongoDatabase mongoDatabase() throws Exception{
        MongoClient mongoClient = new MongoClient(mongoHost, mongoPort);
        return mongoClient.getDatabase(dataBase);
    }
}
