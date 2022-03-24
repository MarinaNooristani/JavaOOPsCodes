package com.syntax.class24;

public class BrowserTester {
    public static void main(String[] args) {
        /*
        GoogleChrome chrome=new GoogleChrome();
        chrome.openBrowser();
        chrome.loadPage("www.google.com");
        chrome.testThePage();
        chrome.closeBrowser();

        Firefox firefox=new Firefox();
        firefox.openBrowser();
        firefox.loadPage("www.google.com");
        firefox.testThePage();
        firefox.closeBrowser();

        Safari safari=new Safari();
        safari.openBrowser();
        safari.loadPage("www.google.com");
        safari.testThePage();
        safari.closeBrowser();

        IE ie=new IE();
        ie.openBrowser();
        ie.loadPage("www.google.com");
        ie.testThePage();
        ie.closeBrowser();

         */
        //instead of these line of codes we can use polymorphism
        //array and each object is an element here
        Browser[] browser = {new GoogleChrome(), new Firefox(), new Safari(), new IE()};
        for(Browser b:browser){
            b.openBrowser();
            b.loadPage("www.google.com");
            b.testThePage();
            b.closeBrowser();
        }

    }

}
