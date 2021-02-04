package top.duanhong.steward.ws;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class WebServiceReq implements Serializable {
    private Date operateDateTime;
}
