package com.syntax.class24;

public abstract class Phone {
    void makePhoneCall() {
        System.out.println("Making a phone call");
    }

    void sendText() {
        System.out.println("Sending a text");
    }

    abstract void displaypicture();

    abstract void unlockPhone();
}

class Iphone extends Phone {//Class 'Iphone' must either be declared abstract or implement abstract method 'unlockPhone()' in 'Phone

    @Override
    void displaypicture() {
        System.out.println("Use photo app to display the pics");
    }

    @Override
    void unlockPhone() {
        System.out.println("use the faceId unlock to open this phone");
    }
}

class Samsung extends Phone {
    @Override
    void displaypicture() {
        System.out.println("Use gallery to display pics");

    }

    @Override
    void unlockPhone() {
        System.out.println("use the finger print unlock to open this phone");
    }
}