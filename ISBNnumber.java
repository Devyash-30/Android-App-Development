package com.company;

import java.util.Scanner;
import java.lang.Math;

public class ISBNnumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long x,dc=0,a,z=1,k=0,y=1,rem,nos=0,e=1,p;

        System.out.println("Enter a Number");
        x= in.nextLong();
        a=x;

        p=x;
        while(p>0)
        {
            p=p/10;
            dc++;
        }

        while (y<=dc)
        {
            rem=a%10;
            nos=rem*y;
            z=1;

            while (z<=1) {
                k=nos+k;
                z++;
            }
            a=a/10;
            y++;
        }

        e=k%11;
        if (e==0) {
            System.out.println("ISBN");
        }

        else{
            System.out.println("Not");
        }
    }
}