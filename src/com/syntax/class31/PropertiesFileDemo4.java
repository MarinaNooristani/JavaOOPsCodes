package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo4 {
    public static void main(String[] args) throws IOException {
        //path of file
        String path = "Files/config.properties";

        //FileInputStream helps us read the data from a file
        FileInputStream fileInputStream = new FileInputStream(path);

        // special class that let us read the data from .properties files
        Properties properties = new Properties();//it does not maintain insertion order(in config.properties) as it has been extended from HashTable map

        //Reading the existing data and storing in the properties class
        properties.load(fileInputStream);

        //adding new properties
        properties.put("URL", "www.google.com");

        //Creating a file on mentioned path
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        //Storing all the data from the object inside that file
        properties.store(fileOutputStream, "Added new property URL");
        //the existing data will be gone and new data will be added to avoid that we first use fileInputStream

    }
}
