package top.duanhong.steward.utils;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author duanhong
 * @description 文件下载工具类
 * @date 2020/2/3
 */
public class FileUtil {

    public static final String separator = File.separator;
    public static final String filePath="file_template";

    /**
     * 文件下載
     * @param fileName
     * @param newName
     * @return
     */
    public static ResponseEntity<InputStreamResource> download(String fileName, String newName) {
        String route = "static" + separator + filePath + separator;
        String path = null;
        ResponseEntity<InputStreamResource> response = null;
        try {
            path = route + fileName;
            ClassPathResource classPathResource = new ClassPathResource(path);
            InputStream inputStream = classPathResource.getInputStream();
            HttpHeaders headers = new HttpHeaders();
            headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
            headers.add("Content-Disposition",
                    "attachment; filename="
                            + new String(newName.getBytes("gbk"), "iso8859-1") + ".xls");
            headers.add("Pragma", "no-cache");
            headers.add("Expires", "0");
            response = ResponseEntity.ok().headers(headers)
                    .contentType(MediaType.parseMediaType("application/octet-stream"))
                    .body(new InputStreamResource(inputStream));
        } catch (FileNotFoundException e1) {
            System.out.println("找不到指定的文件");
        } catch (IOException e) {
            System.out.println("获取不到文件流");
        }
        return response;
    }
}
