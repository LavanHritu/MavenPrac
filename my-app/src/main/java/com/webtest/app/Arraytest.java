package com.webtest.app;

/**
 * Created by Lavanya on 2/07/2017.
 */
public class Arraytest {


    public static void main(String[] args)
    {

        Arraytest at =new Arraytest();
        System.out.println("Print the animals name :");
        at.getanimalname();


    }

    public void getanimalname()
    {
        Arraytest at = new Arraytest();

        String animals [] = new String[5];
        animals[0] = "Tiger";
        animals[1] = "Lion";
        animals[2] = "Elephant";
        animals[3] = "Bear";
        animals[4] = "Deer";
        int i =0;
        while(i<= animals.length-1)
        {
            System.out.println(animals[i]);
            i++;
        }
    }
}
