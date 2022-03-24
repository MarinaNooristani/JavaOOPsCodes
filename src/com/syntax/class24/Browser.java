package com.syntax.class24;

public class Browser {
    void openBrowser(){
        System.out.println("Opening the browser");
    }
    void loadPage(String URL){
        System.out.println("loading the websites"+URL);
    }
    void testThePage(){
        System.out.println("Testing the page");
    }
    void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class GoogleChrome extends Browser{
    void openBrowser(){
        System.out.println("Opening the browser GoogleChrome");
    }
    void loadPage(String URL){
        System.out.println("loading the websites "+URL+" in GoogleChrome");
    }
    void testThePage(){
        System.out.println("Testing the page GoogleChrome");
    }
    void closeBrowser(){
        System.out.println("Closing the browser GoogleChrome");
    }
}
class Firefox extends Browser{
    void openBrowser(){
        System.out.println("Opening the browser Firefox");
    }
    void loadPage(String URL){
        System.out.println("loading the websites "+URL+" in Firefox");
    }
    void testThePage(){
        System.out.println("Testing the page Firefox");
    }
    void closeBrowser(){
        System.out.println("Closing the browser Firefox");
    }
}
class Safari extends Browser{
    void openBrowser(){
        System.out.println("Opening the browser Safari");
    }
    void loadPage(String URL){
        System.out.println("loading the websites "+URL+" in Safari");
    }
    void testThePage(){
        System.out.println("Testing the page Safari");
    }
    void closeBrowser(){
        System.out.println("Closing the browser Safari");
    }
}
class IE extends Browser{
    void openBrowser(){
        System.out.println("Opening the browser IE");
    }
    void loadPage(String URL){
        System.out.println("loading the websites "+URL+" in IE");
    }
    void testThePage(){
        System.out.println("Testing the page IE");
    }
    void closeBrowser(){
        System.out.println("Closing the browser IE");
    }
}