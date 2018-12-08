package com.gtg.test;

import org.apache.log4j.Logger;
import org.junit.Test;

public class LogPrint {
    private static Logger log = Logger.getLogger(LogPrint.class);

    @Test
    public void test(){
        log.info("你好！");
        log.debug("测试一下哦！");
        log.error("报错了！");
        log.warn("哈哈！");
    }
}
