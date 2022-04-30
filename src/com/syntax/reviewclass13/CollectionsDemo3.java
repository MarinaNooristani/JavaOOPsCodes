package com.syntax.reviewclass13;

import java.util.ArrayList;

public class CollectionsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            names.add("adfafnjkdsfnksfnkjsdfnksjfns");
        }
        long startTime=System.currentTimeMillis();
        long count= names.stream().filter(x->x.length()>5).count();//it performs the action like regular loop
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
        long startTime1=System.currentTimeMillis();
        long count1= names.parallelStream().filter(x->x.length()>5).count();
        //parallelStream :it will divide the task to multiple cores and the process will be faster
        long endTime1=System.currentTimeMillis();
        System.out.println(endTime1-startTime1);

    }
}
