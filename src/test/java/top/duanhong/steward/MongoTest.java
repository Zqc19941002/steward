package top.duanhong.steward;


import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * @author duanhong
 * @description mongo测试
 * @date 2019/8/20
 */
public class MongoTest {

    public static MongoDatabase mongoDatabase=mongoInit();

    public static void main(String[] args) {
        if (mongoDatabase!=null){
            System.out.println("mongo初始化成功");
        }
//        getDoc(mongoDatabase);
//        update(mongoDatabase);
        delete(mongoDatabase);
    }



    /**
     * mongo初始化
     * @return
     */
    public static MongoDatabase mongoInit(){
        List<ServerAddress> serverAddressList=new ArrayList<>();
        serverAddressList.add(new ServerAddress("119.23.21.152",27017));
        MongoCredential mongoCredential=MongoCredential.createCredential("steward","steward","steward".toCharArray());
        List<MongoCredential> credentialList=new ArrayList<>();
        credentialList.add(mongoCredential);
        MongoClient mongoClient=new MongoClient(serverAddressList,credentialList);
        return mongoClient.getDatabase("steward");
    }

    /**
     * 添加文档
     * @param mongoDatabase
     */
    public static void addDoc(MongoDatabase mongoDatabase){
        MongoCollection<Document> collection=mongoDatabase.getCollection("test");
        Document document = new Document("title", "MongoDB").append("description", "database").append("likes", 100);  //新建文档
        List<Document> documents = new ArrayList<Document>();
        documents.add(document);
        collection.insertMany(documents);  //添加文档（对应的BSON数据）
        System.out.println("文档插入成功");
    }

    /**
     * 获取文档数据
     * @param mongoDatabase
     */
    public static void getDoc(MongoDatabase mongoDatabase) {
        MongoCollection<Document> collection = mongoDatabase.getCollection("test"); //获取集合
        System.out.println("集合 test 选择成功");
        FindIterable<Document> findIterable = collection.find();  //获取迭代器
        MongoCursor<Document> mongoCursor = findIterable.iterator();  //获取游标
        while (mongoCursor.hasNext()) {  //循环获取数据
            System.out.println(mongoCursor.next());
        }
    }

    /**
     * 更新
     * @param mongoDatabase
     */
    public static void update(MongoDatabase mongoDatabase){
        MongoCollection<Document> collection = mongoDatabase.getCollection("test");
        System.out.println("集合 test 选择成功");
        collection.updateMany(Filters.eq("likes", 100), new Document("$set",new Document("likes",200)));  //更新文档 将文档中likes=100的文档修改为likes=200
        //查看
        getDoc(mongoDatabase);
    }

    public static void delete(MongoDatabase mongoDatabase){
        MongoCollection<Document> collection = mongoDatabase.getCollection("test");
        System.out.println("集合 test 选择成功");
        collection.deleteOne(Filters.eq("likes", 200));  //删除符合条件的第一个文档
        collection.deleteMany (Filters.eq("likes", 200));  //删除所有符合条件的文档
        getDoc(mongoDatabase);
    }


}
