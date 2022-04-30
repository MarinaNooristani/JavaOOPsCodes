package com.syntax.reviewclass13;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;
public class FilesDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        String path="src/com/syntax/reviewclass13/Notes.txt";
        File file=new File(path);

        Scanner scanner=new Scanner(file);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());//to print all the text from Notes in this package
        }
    }
}