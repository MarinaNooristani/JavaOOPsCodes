package com.syntax.reviewclass8;

public class StringClass3 {
    public static void main(String[] args) {
        String batch="batch 12";
        String course="SDET";
        String company="       syntax    tech   ";
        System.out.println(company.trim());
        String name=" nasir   aryan";
        System.out.println(name.replace("   "," "));

     if("Batch 12".equals(batch) && "SDET".equals(course)){
         System.out.println("you will get the link to lecture");
     }else{
         System.out.println("Watch my youtube channel");
     }
        if("Batch 12".equalsIgnoreCase(batch) && "SDET".equalsIgnoreCase(course)){
            System.out.println("Now all types of input are accepted");
        }
    }
}
