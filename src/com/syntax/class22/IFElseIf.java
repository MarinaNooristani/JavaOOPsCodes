package com.syntax.class22;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class IFElseIf {
    int maxNumber(int num1, int num2) {
        //1 using if else if
        // if (num1>num2){
        //     return num1;
        // } else{
        //     return num2;
        //  }
        //2 calling max method
        //return Math.max(num1, num2);
        //3 ternary operator
        return num1 > num2 ? num1 : num2;//ternary operator
        //functional programming
    }

    public static void main(String[] args) {
        int number = 10;
        //the ternary operator has the limitation that it must return something we can't use it to print out things
        //  number>10?System.out.println("number is greater"):System.out.println("number is smaller");

        IFElseIf obj = new IFElseIf();
        System.out.println(obj.maxNumber(3, 4));
    }
}
