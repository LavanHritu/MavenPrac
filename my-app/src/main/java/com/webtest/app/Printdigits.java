package com.webtest.app;

/**
 * Created by Lavanya on 2/07/2017.
 */
public class Printdigits {

    public static void main(String[] args) {

        Printdigits pd = new Printdigits();

        pd.getnumber(1,10);

    }

    public void getnumber(int a, int b)
    {
        int nos;
        System.out.println("Print number from 1 to 10 :");
        for(int i=a;i<=b;i++)
        {
            System.out.println(i);
        }


    }
}