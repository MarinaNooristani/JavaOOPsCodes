package com.syntax.class33;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyDemo {
    public static void main(String[] args) throws IOException {//JVM calls this main method
        //throws IOException it means we give the responsibility to JVM to handle this exception
        //but JVM says I will go with the default behavior if this main method throws an error on me,
        //I will terminate your program and throw the error on you, and I will completely shut down your program
        //this is the default behavior of JVM so JVM has a default handler and this handler simply terminates
        //your program right away the moment you encounter an exception, and it displays the error message
        //so that's why it's not a good idea so the good idea is to use try catch block
        FileInputStream fileInputStream = null;
        try {
            String path = "C:\\Users\\marin\\OneDrive\\Desktop\\files to read\\Names.xlsx";

            fileInputStream = new FileInputStream(path);//alt + enter to add the exception

            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);//these exceptions are forced by java which is mandatory

            Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        } catch (FileNotFoundException exception) {
            System.out.println("The File that you are trying to read is not present" +
                    " on provided path please check your path again");
        } catch (IOException ioException) {
            System.out.println("Something with hard drive went wrong");

        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println(" error while closing the file");
            }
            //no matter what happens inside the any of catch and try blocks
            // java will execute this code and close your resource
        }
        //if debug we cannot delete this file Names
        //as a good practice once we are done using a system resource we should close that resource

        System.out.println("Now you should be able to perform other operations");
        //close the resources that are shared and used by others
        //as a good user or programmer make sure that you're always closing the resources like scanner, driver, file, database connections,
        //so you don't put too much stress on your CPU or memory
        //they continue to stay in the memory if you don't close them
    }
}
