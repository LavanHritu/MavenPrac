package com.webtest.app;

/**
 * Created by user on 4/07/2017.
 */
public class Cars {

    public static void main(String[] args)
    {
        Cars c = new Cars();
        float salary=40000;

        int Cartype=2;
        String Features;

        Features = c.getcarstype(21);
        System.out.println(Features);


    }
    public String getcarstype(int Cartype)
    {
        String Features;
        switch(Cartype) {
            case 1:
                Features = "4 wheels, Passenger capacity is 5";
                //System.out.println(Features);
                break;
            case 2:
                Features = "8 wheels, Has more passenger capacity ";
                //System.out.println(Features);
                break;
            case 3:
                Features = "4 wheels,Passenger capacity is 6";
                //System.out.println(Features);
                break;
            default:
                //throw new IllegalArgumentException("Invalid Vehicle type: " + Cartype);
                Features = "Invalid Vehicle type : "+ Cartype;
        }
        return Features;
    }
}
