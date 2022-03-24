package com.syntax.class26;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionDemo1 {
    public static void main(String[] args) {
        String name="Yazgul";
        String name2="Marina";

        String[] names={"Yazgul","Andrew"};
       // names[2]="Teyfur";//ArrayIndexOutOfBound

        String[] names2=new String[1000];
        names2[0]="Elena";
        names2[2]="Andrew";
        System.out.println(Arrays.toString(names2));

        ArrayList<String> syntaxStudent=new ArrayList<>();
        //ArrayList name of class
        //<> diamond operator
        //String datatype
        syntaxStudent.add("Alex");
        syntaxStudent.add("Mike");
        syntaxStudent.add("Andrew");
        System.out.println(syntaxStudent);

    }
}
