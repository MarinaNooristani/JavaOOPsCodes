package com.syntax.class33;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        //exceptions should be written from more specific(ArithmeticException....) to more general(Exception)


        System.out.println("0");
        try {
            //System.out.println(10/0);
            String name = null;
            name.length();//it will catch the exception for this line and will ignore the rest
            int[] arr = new int[-5];
            String[] strArr = new String[2];
            strArr[5] = "Issues";
            //throw new RuntimeException();
        } catch (ArithmeticException arithmeticException) {
            System.out.println("1");
        } catch (NullPointerException nullPointerException) {//and will only print the code inside this block and ignore the rest
            System.out.println("2");
        } catch (NegativeArraySizeException negativeArraySizeException) {
            System.out.println("3");
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("4");

        } catch (Exception exception) {
            System.out.println("Something went wrong");
        }
        System.out.println("6");

    }
}