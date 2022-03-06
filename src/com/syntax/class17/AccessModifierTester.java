package com.syntax.class17;

import com.syntax.class18.AccessModifiers;//import from another package
//import package name.class name

public class AccessModifierTester {//shift+f6 refactor/rename
    public static void main(String[] args) {
        AccessModifiers am = new AccessModifiers();
        /*
        can't access name because it has a private access
        can't access age because it has default access
        can't access weight because it has protected access
        can only access color because it has public
        access which can be accessed from anywhere inside
        the same project
         */
        // System.out.println(am.name);
        //  System.out.println(am.age);
        System.out.println(am.color);
        // System.out.println(am.weight);

    }
}
