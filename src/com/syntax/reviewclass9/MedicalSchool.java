package com.syntax.reviewclass9;

public class MedicalSchool {
    public static void main(String[] args) {
        //I want to test accessibility
        Doctor doc = new Doctor("Marina", "Nooristani", "Dermatologist");
        doc.printInfo();//public
        Doctor.work();//protected
        doc.hello();//default
      //  doc.getPaid();  'getPaid()' has private access in 'com.syntax.reviewclass9.Doctor'
        System.out.println(doc.firstName);
        System.out.println(doc.lastName);
        System.out.println(doc.speciality);
       // System.out.println(doc.salary);  'salary' has private access

    }
}
