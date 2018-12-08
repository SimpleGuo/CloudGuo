package com.gtg.function;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.log4j.Logger;

import static io.restassured.RestAssured.given;

public class PortalLogin {
    private static Logger log = Logger.getLogger(PortalLogin.class);
    private static final String CONTENT_TYPE = "application/json";
    private String user = "admin";
    private String password = "gtg@123";
    private String type = "account";

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getSessiond(String body){
        String url = "https://8.8.8.8:8080/test";
        log.info("请求的url为："+url);
        RestAssured.useRelaxedHTTPSValidation();
        Response response = given().header("Content-Type",CONTENT_TYPE).body(body).
                when().post(url);
        response.then().log().all();
        return response.sessionId();

    }

}
