package com.gtg.function;

import java.io.*;
import java.util.Properties;

public class GetConfig {
    public static Properties getFile() throws IOException {
        Properties prop = new Properties();

        InputStream in = new BufferedInputStream(GetConfig.class.getClassLoader().getResourceAsStream("config.properties"));

        prop.load(in);

        in.close();

        return prop;
    }
}