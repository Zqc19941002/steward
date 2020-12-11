package top.duanhong.steward.service.mongo.impl;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.duanhong.steward.service.mongo.MongoService;
import top.duanhong.steward.utils.MongoFileSystemUtil;

@Service
public class MongoServiceImpl implements MongoService {

    @Autowired
    private MongoFileSystemUtil mongoFileSystemUtil;



}
