package top.duanhong.steward.ws;

import top.duanhong.steward.enumeration.StatusCodeEnum;
import top.duanhong.steward.response.BaseResponse;

import javax.jws.WebService;

@WebService(endpointInterface = "top.duanhong.steward.ws.IWebService")
public class WebServiceImpl implements IWebService{

    @Override
    public BaseResponse sayHello(WebServiceReq webServiceReq) {
        BaseResponse baseResponse=new BaseResponse(StatusCodeEnum.SUCCESS_CODE.getMessage(),StatusCodeEnum.SUCCESS_CODE.getCode());
        baseResponse.setData("Hello World");
        return baseResponse;
    }
}
