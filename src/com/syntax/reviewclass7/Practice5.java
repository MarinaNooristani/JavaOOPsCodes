package com.syntax.reviewclass7;

import java.util.Locale;

public class Practice5 {
    String weekDay(String day) {
        day = day.toLowerCase();
        switch (day) {
            case "monday":
                return "It is a lazy day";
            case "tuesday":
                return "It is a productive day";
            case "wednesday":
                return "It is a gloomy day";
            default:
                return "No correct option found";
        }
    }

    public static void main(String[] args) {
        Practice5 p = new Practice5();
        System.out.println(p.weekDay("MONDAY"));

    }
}
