package com.company;

import java.util.Scanner;

public class Neonnumber{

    public static void main(String[] args) {

        int num;
        int sqnum;
        int sum=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: " );
        num=sc.nextInt();

        //take square of given number
        sqnum=num*num;

        //loop executes till sqnum comes out to be zero
        while(sqnum>0)
        {
            sum = sum + sqnum % 10;
            sqnum = sqnum / 10;

        }

        //condition for checking sum is equal or not.
        if (sum == num)
            System.out.println("It is a Neon number.");
        else
            System.out.println("It is not a Neon number.");
    }
}
