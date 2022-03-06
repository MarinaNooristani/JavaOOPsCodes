package com.syntax.class17;

public class Students {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students
    String studentName;
    int studentId;
    static int numberOfStudents = 181;

    public static void main(String[] args) {
        Students student1 = new Students();
        student1.studentName = "John";
        student1.studentId = 78101;
        Students.numberOfStudents++;

        Students student2 = new Students();
        student2.studentName = "Alex";
        student2.studentId = 78102;
        Students.numberOfStudents++;

        Students student3 = new Students();
        student3.studentName = "David";
        student3.studentId = 78103;
        Students.numberOfStudents++;
        System.out.println("total number of students : " + Students.numberOfStudents);
    }
}


