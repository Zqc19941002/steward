package top.duanhong.steward.service.qiniu;

import top.duanhong.steward.response.MethodExecuteResult;

import java.io.File;

public interface QINiuFileService {
    MethodExecuteResult uploadQiNiuFile(File file);
}
