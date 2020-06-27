package top.duanhong.steward.config;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;

/**
 * @author duanhong
 * @description mongo配置
 * @date 2019/8/17
 */
@Configuration
public class MongoConfig {
    @Autowired
    private MongoDbFactory mongoDbFactory;


    @Bean
    public GridFSBucket getGridFSBucket(){
        MongoDatabase db = mongoDbFactory.getDb();
        return GridFSBuckets.create(db);
    }
}
