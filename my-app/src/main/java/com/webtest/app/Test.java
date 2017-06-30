package com.webtest.app;

/**
 * Created by user on 30/06/2017.
 */
public class Test {
    public static void main(String[] args) {
        // write your code
        System.out.println("Hello world");

        City city = new City();

        String country = "New Zealand";
        final String question1 = "What is the capital of ";
        System.out.println(question1 +country+"?");
        System.out.println("The capital of "+country+ " is :"+city.getcapitalCityof(country));

        System.out.println("");
        country = "Australia";
        System.out.println(question1 +country+"?");
        System.out.println("The capital of "+country+ " is :"+city.getcapitalCityof(country));
    }

}
