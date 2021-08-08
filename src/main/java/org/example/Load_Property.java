package org.example;

import java.io.FileInputStream;

import java.util.Properties;

public class Load_Property {


    static Properties prop;
    static FileInputStream input;

    static String fileLocation = "src/test/TestData/config.properties";

    public String getProperty(String keyName) {
        prop = new Properties();
        try {
            input = new FileInputStream(fileLocation);
            prop.load(input);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop.getProperty(keyName);
    }
}
