package top.duanhong.steward.ws;

import javax.xml.ws.Endpoint;

public class Publisher {
    public static void main(String[] args) {
        String address="http://localhost:9998/ws";
        Endpoint.publish(address, new WebServiceImpl());
    }
}
