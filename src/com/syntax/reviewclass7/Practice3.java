package com.syntax.reviewclass7;

public class Practice3 {
    String studentName;
    String course;
    int studentId;
    int grades;

    void displayStudentsRecord() {
        System.out.println("The student name is " + studentName + " and the course student enrolled for is " + course);
        System.out.println("The student id is " + studentId + " and the grades student achieved are " + grades);
    }

    public static void main(String[] args) {
        Practice3 p1 = new Practice3();
        p1.studentName = "Marina";
        p1.course = "SDET";
        p1.studentId = 123;
        p1.grades = 100;
        p1.displayStudentsRecord();
        System.out.println("________________________");
        Practice3 p2 = new Practice3();
        p2.studentName = "Yazgul";
        p2.course = "SDET";
        p2.studentId = 456;
        p2.grades = 91;
        p2.displayStudentsRecord();


    }
}
