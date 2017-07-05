package com.webtest.app;

/**
 * Created by user on 4/07/2017.
 */
public class Bikes extends Cars {

    public static void main(String[] args)
    {
        String type;
        Bikes b = new Bikes();
        type = b.getcarstype(1);
        System.out.println(type);
    }

}
