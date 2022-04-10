package com.syntax.class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo3 {
    public static void main(String[] args) throws IOException {
        /**
         * How to create a file
         */
        String path = "C:\\Users\\marin\\OneDrive\\Desktop\\files to read\\trump.properties";

        FileOutputStream fileOutputStream = new FileOutputStream(path);//to write data

        Properties properties = new Properties();

        properties.put("isCrazy", "false");
        properties.put("isRich", "true");
        properties.store(fileOutputStream, "Added some new fields");//like we add comment in git commit
    }
}
