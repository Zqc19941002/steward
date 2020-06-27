package top.duanhong.steward.utils;

import top.duanhong.steward.enumeration.StatusCodeEnum;
import top.duanhong.steward.response.BaseResponse;

/**
 * @author duanhong
 * @description 请求响应工具类
 * @date 2019/8/15
 */
public class ResponseUtil {
    public static BaseResponse getFailedRes(String errorCode,String errorMessage){
        return BaseResponse.builder()
                .errorCode(errorCode)
                .errorMessage(errorMessage)
                .body("")
                .build();
    }

    public static BaseResponse getSuccessRes(Object result){
        return BaseResponse.builder()
                .errorCode(StatusCodeEnum.SUCCESS_CODE.getCode())
                .errorMessage(StatusCodeEnum.SUCCESS_CODE.getMessage())
                .body(result)
                .build();
    }

}
