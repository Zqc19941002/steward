package top.duanhong.steward;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.duanhong.steward.entity.bo.FileDocument;
import top.duanhong.steward.entity.po.NetTag;
import top.duanhong.steward.request.*;
import top.duanhong.steward.service.*;
import top.duanhong.steward.service.file.QiNiuFileService;
import top.duanhong.steward.service.sys.impl.DictService;
import top.duanhong.steward.service.sys.impl.MessageService;
import top.duanhong.steward.service.tag.NetTabService;
import top.duanhong.steward.utils.MethodExcuResult;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StewardApplicationTests {

    @Resource
    private NetTabService netTabService;

    @Autowired
    private DictService dictService;

    @Autowired
    private MessageService messageService;

    @Autowired
    private MongoFileService mongoFileService;

    @Autowired
    private FileTypeService fileTypeService;

    @Autowired FileService fileService;

    @Autowired
    private QiNiuFileService qiNiuFileService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void netTagInsertTest(){
//        MethodExcuResult result=netTabService.netTagInsert(netTagAddReq);
//        System.out.println(result.toString());
    }

    @Test
    public void netTagSelectByExample(){
        NetTagSelectReq netTagSelectReq=new NetTagSelectReq();
        netTagSelectReq.setNetTagTitle("测试");
        netTagSelectReq.setTagRemark("测试");
        netTagSelectReq.setTheme("ha");

        MethodExcuResult result=netTabService.netTagSelectByExample(netTagSelectReq);
        List<NetTag> resultList= (List<NetTag>) result.getResult();
        for (NetTag n:resultList
             ) {
            System.out.println(n.toString());
        }
    }


    @Test
    public void dictTest(){
        DictAddReq req=new DictAddReq();
        req.setKey("2");
        req.setValue("橘子");
        MethodExcuResult result=dictService.insertDict(req);
        System.out.println(result.toString());
    }
    @Test
    public void dictQueryTest(){
        MethodExcuResult result=dictService.queryDict(new QueryDictReq());
        System.out.println(result.toString());
    }

    @Test
    public void messageInsertTest(){
        InsertMessageReq req=new InsertMessageReq();
        req.setTitle("明天下雨");
        req.setDesc("下雨就下雨呗");
        req.setContent("nkasdnviaheoivrnaldfnvolandfovjadlf");
        MethodExcuResult result=messageService.insertMessage(req);
        result.toString();
    }

    @Test
    public void messageQueryTest(){
        QueryMessageReq req=new QueryMessageReq();
        MethodExcuResult result=messageService.queryMessage(req);
        result.toString();
    }

    @Test
    public void setMongoFileTest(){
        List<FileDocument> list=mongoFileService.listFilesByPage(0,10);
        System.out.println(list.toString());
    }

    @Test
    public void fileTypeTest(){
        AddFileTypeReq req=new AddFileTypeReq();
        req.setTypeCode("file-type-code2");
        req.setTypeLabel("随笔");
        req.setUserId("duanhong");
        MethodExcuResult methodExcuResult=fileTypeService.addFileType(req);
        System.out.println(methodExcuResult.toString());
    }

    @Test
    public void fileTypeSelectTest(){
        QueryFileTypesReq req=new QueryFileTypesReq();
        req.setUserId("helloKitty");
        MethodExcuResult methodExcuResult=fileTypeService.getFileTypes(req);
        System.out.println(methodExcuResult.toString());
    }

    @Test
    public void deleteTest(){
        DeleteFileTypeReq req=new DeleteFileTypeReq();
        req.setFileTypeId("sft6");
        req.setUserId("duanhong");
        MethodExcuResult methodExcuResult=fileTypeService.deleteFileType(req);
        System.out.println(methodExcuResult.toString());
    }

    @Test
    public void addFile(){
        FileAddReq req=new FileAddReq();
        req.setUserId("duanhong");
        req.setName("测试你大爷7");
        req.setFileTypeId("sft6");
        req.setType("file");
        req.setParentId("sf4");
        req.setRemark("测试文件");
        req.setContent("nmcdvknsdfnvsdnvis;fvn");
        MethodExcuResult methodExcuResult=fileService.saveFileOrFolder(req);
        System.out.println(methodExcuResult);

        FileSelectReq req1=new FileSelectReq();
        req1.setFileTypeId("sft6");
        req1.setUserId("duanhong");
        fileService.getAllFileListByType(req1);
    }

    @Test
    public void uploadQiniuFile(){
        qiNiuFileService.uploadQiNiuFile(new File("E:\\资料\\简历\\简历-北京.pdf"));
    }

}
