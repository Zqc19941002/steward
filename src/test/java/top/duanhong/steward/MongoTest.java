package top.duanhong.steward;


import com.google.inject.internal.cglib.core.$TypeUtils;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import com.mongodb.client.gridfs.GridFSFindIterable;
import com.mongodb.client.gridfs.model.GridFSFile;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import top.duanhong.steward.utils.MongoFileSystemUtil;

import javax.annotation.Resource;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author duanhong
 * @description mongo测试
 * @date 2019/8/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoTest {

    public static MongoDatabase mongoDatabase=mongoInit();

    @Resource
    private GridFsTemplate gridFsTemplate;

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


    @Test
    public void up() throws Exception{
        //5fd217e62a1a5569a45009c5
        // 获取文件流
        File file = new File("F:\\共享文件夹\\mongodb-windows-x86_64-4.4.2-signed.msi");
        InputStream in = new FileInputStream(file);
        // 创建一个容器，传入一个`MongoDatabase`类实例db
        GridFSBucket bucket = GridFSBuckets.create(MongoFileSystemUtil.mongoDatabase());
        // 上传
        ObjectId fileId = bucket.uploadFromStream(UUID.randomUUID().toString(), in);
        System.out.println("上传完成。 文件ID："+fileId);
    }

    @Test
    public void findOne() throws Exception {
        // 获取文件ID
        String objectId = "5fd217e62a1a5569a45009c5";
        // 创建一个容器，传入一个`MongoDatabase`类实例db
        GridFSBucket bucket = GridFSBuckets.create(MongoFileSystemUtil.mongoDatabase());
        // 获取内容
        GridFSFindIterable gridFSFindIterable = bucket.find(Filters.eq("_id", new ObjectId(objectId)));
        GridFSFile gridFSFile = gridFSFindIterable.first();
        //filename:146902f4-946d-495d-84c7-071013763d4d
        System.out.println("filename: " + gridFSFile.getFilename());
    }

    @Test
    public void download() throws Exception {
        // 获取文件ID
        String objectId = "5fd217e62a1a5569a45009c5";
        // 获取文件流
        File file = new File("F:\\共享文件夹\\mongo下载\\234242.txt");
        // 创建一个容器，传入一个`MongoDatabase`类实例db
        GridFSBucket bucket = GridFSBuckets.create(MongoFileSystemUtil.mongoDatabase());
        // 创建输出流
        OutputStream os = new FileOutputStream(file);
        // 下载
        bucket.downloadToStream(new ObjectId(objectId), os);
        System.out.println("下载完成。");
    }

    @Test
    public void delete() throws Exception {
        // 获取文件ID
        String objectId = "57fbaffcec773716ecc54ef4";
        // 创建一个容器，传入一个`MongoDatabase`类实例db
        GridFSBucket bucket = GridFSBuckets.create(MongoFileSystemUtil.mongoDatabase());
        // 删除
        bucket.delete(new ObjectId(objectId));
        System.out.println("删除完成。");
    }

    @Test
    public void upFile() throws Exception{
        File file = new File("F:\\共享文件夹\\mongo下载\\静夜思.txt");
        InputStream in = new FileInputStream(file);
        ObjectId objectId=gridFsTemplate.store(in,"静夜思-2423424");
        System.out.println(objectId);
    }


}
