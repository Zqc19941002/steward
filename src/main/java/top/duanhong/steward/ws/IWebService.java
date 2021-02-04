package top.duanhong.steward.ws;

import top.duanhong.steward.response.BaseResponse;

import javax.jws.WebService;

@WebService
public interface IWebService {

    BaseResponse sayHello(WebServiceReq webServiceReq);

}
