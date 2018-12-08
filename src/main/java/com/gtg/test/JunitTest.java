package com.gtg.test;

import com.alibaba.fastjson.JSON;
import com.gtg.function.GetConfig;
import com.gtg.function.PortalLogin;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

public class JunitTest {
    private static Logger log = Logger.getLogger(JunitTest.class);

    @Before
    public void init()  {

    }

    @Test
    public void Test() throws IOException {
        Properties prop = GetConfig.getFile();
        System.out.println(prop.getProperty("user"));
        PortalLogin login = new PortalLogin();
        String loginBody = JSON.toJSONString(login);
        log.info("请求的body为：" + loginBody);

    }

    @After
    public void clear(){

    }
}
