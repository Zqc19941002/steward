package top.duanhong.steward.utils;

import org.apache.commons.codec.binary.StringUtils;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class HmacSHA1Util {

    private static final String MAC_NAME = "HmacSHA1";
    private static final String ENCODING = "UTF-8";

    /*
     * 展示了一个生成指定算法密钥的过程 初始化HMAC密钥
     * @return
     * @throws Exception
     *
      public static String initMacKey() throws Exception {
      //得到一个 指定算法密钥的密钥生成器
      KeyGenerator KeyGenerator keyGenerator =KeyGenerator.getInstance(MAC_NAME);
      //生成一个密钥
      SecretKey secretKey =keyGenerator.generateKey();
      return null;
      }
     */

    /**
     * 使用 HMAC-SHA1 签名方法对对encryptText进行签名
     * @param encryptText 被签名的字符串
     * @param encryptKey  密钥
     * @return
     * @throws Exception
     */
    public static byte[] HmacSHA1Encrypt(String encryptText, String encryptKey) throws Exception
    {
        byte[] data= StringUtils.getBytesUtf8(encryptKey);
        //生成一个指定 Mac 算法 的 Mac 对象
        Mac mac = Mac.getInstance(MAC_NAME);
        //用给定密钥初始化 Mac 对象
        SecretKeySpec secretKeySpec=new SecretKeySpec(data,MAC_NAME);
        mac.init(secretKeySpec);
        byte[] text = encryptText.getBytes(ENCODING);
        //完成 Mac 操作
        return mac.doFinal(text);
    }
}
