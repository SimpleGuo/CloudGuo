package com.gtg.test;

import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;
import org.mockserver.client.server.MockServerClient;

public class MockTest {
    public static void main(String[] args) {
        MockServerClient client = new MockServerClient("192.168.1.102", 10080);
        client.reset();
        client.when(HttpRequest.request().withMethod("POST").withPath("/test")).respond(HttpResponse.response().withStatusCode(200));
    }
}
