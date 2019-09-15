package top.duanhong.steward.service;

import cn.hutool.core.io.IoUtil;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSDownloadStream;
import com.mongodb.client.gridfs.model.GridFSFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Field;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;
import top.duanhong.steward.entity.bo.FileDocument;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

/**
 * @author duanhong
 * @description mongo文件服务
 * @date 2019/8/20
 */
@Service
public class MongoFileService {

    private static String collectionName = "steward";

    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private GridFsTemplate gridFsTemplate;
    @Autowired
    private GridFSBucket gridFSBucket;


    /**
     * 文件列表
     * @param pageIndex
     * @param pageSize
     * @return
     */
    public List<FileDocument> listFilesByPage(int pageIndex, int pageSize) {
        Query query = new Query().with(new Sort(Sort.Direction.DESC, "uploadDate"));
        long skip = (pageIndex -1) * pageSize;
        query.skip(skip);
        query.limit(pageSize);
        Field field = query.fields();
        field.exclude("content");
        List<FileDocument> files = mongoTemplate.find(query , FileDocument.class , collectionName);
        return files;
    }


    /**
     * 查询附件
     * @param id 文件id
     * @return
     * @throws IOException
     */
    public Optional<FileDocument> getById(String id){
        FileDocument fileDocument = mongoTemplate.findById(id , FileDocument.class , collectionName);
        if(fileDocument != null){
            Query gridQuery = new Query().addCriteria(Criteria.where("filename").is(fileDocument.getGridfsId()));
            try {
                GridFSFile fsFile = gridFsTemplate.findOne(gridQuery);
                GridFSDownloadStream in = gridFSBucket.openDownloadStream(fsFile.getObjectId());
                if(in.getGridFSFile().getLength() > 0){
                    GridFsResource resource = new GridFsResource(fsFile, in);
                    fileDocument.setContent(IoUtil.readBytes(resource.getInputStream()));
                    return Optional.of(fileDocument);
                }else {
                    fileDocument = null;
                    return Optional.empty();
                }
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
        return Optional.empty();
    }
}
