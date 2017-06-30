package com.webtest.app;

public class City {

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

    public String getcapitalCityof(String country)
    {
        String capital;

        if("New Zealand".equals(country))
        {
            capital = "Wellington";
        }
        else
        {
            capital = "Not found";
        }

        return capital;
    }
}
