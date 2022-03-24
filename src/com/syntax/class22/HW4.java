package com.syntax.class22;
public class HW4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    private void display(String name, String lastName) {
        System.out.println("Name " + name + " " + lastName);
    }

    private void display(String name, String lastName, int age) {
        System.out.println("Name " + name + " " + lastName + " Age " + age);
    }

    private void display(String lastName, int age, String name) {
        System.out.println("Name " + name + " " + lastName + " Age " + age);
    }
    public static void main(String[] args) {
        HW4 obj = new HW4();
        obj.display("John", "Yaman");
        obj.display("Mike", "Dane", 34);
        obj.display("David", 21, "Alex");
    }
}

