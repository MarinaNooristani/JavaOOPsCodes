package com.syntax.class32;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class HWClass31 {
    public static void main(String[] args) throws IOException {
        /**
         * Create a property file to store following configurations:
         * browser=chrome
         * url=https://facebook.com
         * username
         * password
         * Read file and extract values of browser & url
         */
        String path = "Files/facebook.properties";
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("browser"));
        System.out.println(properties.get("url"));
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));
    }
}
