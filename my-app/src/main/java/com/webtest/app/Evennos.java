package com.webtest.app;

/**
 * Created by user on 2/07/2017.
 */
public class Evennos {

    public static void main(String[] args)
    {

        Evennos en = new Evennos();
        System.out.println("Even numbers are :");
        en.getevennos(1,30);
    }

    public void getevennos(int a, int b)
    {
        for(int i=a;i<=b;i++)
        {
            int j;
            j = i%2;
            if(j==0)
            {
                System.out.println(i);
            }
        }
    }

}
