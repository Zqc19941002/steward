package top.duanhong.steward.utils;

import com.qiniu.util.Auth;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class QiNiuUtil {


    public static final String SECRET_KEY = "5DsX2S7MMFaDcoV27TwfPmB9Rh0Uo26utVzTeeg_";
    public static final String ACCESS_KEY = "wSev1gzynuXgxcEYMfGcsli2c4R9hKbErgs0s-7Z";
    public static final String QI_NIU_FILE_URL = "https://img.october2.top/";
    public static final long EXPIRES = 3600;

    /**
     * 获取七牛文件访问token
     *
     * @param fileKey
     * @return
     */
    public static String getDownloadToken(String fileKey) {
        String downloadUrl = QI_NIU_FILE_URL;
        downloadUrl = downloadUrl + fileKey;
        String unixCurrentTimeMillis = Long.toString(System.currentTimeMillis() / 1000L);
        downloadUrl = downloadUrl + "?" + "e=" + unixCurrentTimeMillis;
        String token = "";
        try {
            //HMAC-SHA1签名
            byte[] sign = HmacSHA1Util.HmacSHA1Encrypt(downloadUrl, SECRET_KEY);
            //URL安全的 Base64 编码
            token = Base64Util.safeUrlBase64Encode(sign);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("hmac_sha1编码异常");
        }
        return ACCESS_KEY + ":" + token;
    }

    /**
     * 获取七牛文件下载地址
     * 自己实现的方法有待完善
     *
     * @param fileKey
     * @param useQiNiu
     * @return
     */
    public static String getDownloadUrl(String fileKey, boolean useQiNiu) {
        if (useQiNiu) {
            return Auth.create(ACCESS_KEY, SECRET_KEY).privateDownloadUrl(QI_NIU_FILE_URL + fileKey);
        }
        String token = QiNiuUtil.getDownloadToken(fileKey);
        String downloadUrl = QI_NIU_FILE_URL + fileKey;
        String unixCurrentTimeMillis = Long.toString(System.currentTimeMillis() / 1000L + EXPIRES);
        downloadUrl = downloadUrl + "?" + "e=" + unixCurrentTimeMillis + "&token=" + token;
        return downloadUrl;
    }

    public static void main(String[] args) {
        String url = QiNiuUtil.getDownloadUrl("Fr4FSgy1uAbt9c1gbhGuCITu-7gg", true);
        System.out.println(url);
    }
}
