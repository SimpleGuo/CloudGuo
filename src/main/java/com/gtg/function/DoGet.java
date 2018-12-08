package com.gtg.function;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class DoGet {
    private String url=null;

    public Response get(){
        /*
        * 信任所有客户端，不用携带任何可信任证书
        * RestAssured.config.getSSLConfig().relaxedHTTPSValidation();
        */
        RestAssured.useRelaxedHTTPSValidation();

        Response response = given().contentType(ContentType.JSON).
                when().get(url);
        /*
        * 打印响应
        **/
        response.then().log().all();

        /*
        * 断言
        */
        response.then().assertThat().statusCode(200).
                body("resultcode",equalTo("0")).
                body("resultdesc",equalTo("Operate Success."));
        return response;
    }
}
