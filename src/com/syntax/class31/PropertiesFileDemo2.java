package com.syntax.class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo2 {
    public static void main(String[] args) throws IOException {
        /**
         * How to read files from anywhere in your computer
         */
        //first step locating the file that we want to read.
        //right click on config.properties --> copy path/reference --> path from content root --> then paste within the quotes
        String path = "C:\\Users\\marin\\OneDrive\\Desktop\\files to read\\config.properties";//we can use either single / or double \\

        //navigating to that location
        FileInputStream fileInputStream = new FileInputStream(path);//FileInputStream will throw this exception-->throws FileNotFoundException
        //FileInputStream to write data

        //that special class which knows how to read the properties files.or we select the proper software to read that file
        Properties properties = new Properties();

        //loading all the data from the file to properties object
        // so this method(load()) will read all the information from this file, and it will store the information inside this properties object
        properties.load(fileInputStream);//throw exception-->throws IOException.

        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));

    }
}
