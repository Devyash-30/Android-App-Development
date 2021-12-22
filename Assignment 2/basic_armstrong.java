package com.company;
import java.util.Scanner;
import java.lang.Math;

public class basic_armstrong {

    public static void main(String[] args) {

        int number, sum = 0, num, r, count=0, num2;


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = sc.nextInt();
        num = number;
        num2 = number;


        while (num>0) {
            num=num/10;
            count++;
        }


        while (num2 > 0) {
            r = num2 % 10;
            sum = (int) (sum + Math.pow(r,count));
            num2 = num2 / 10;
        }

        if(number == sum)
            System.out.println("Its an Armstrong Number.");
        else
            System.out.println("Its not an Armstrong Number.");
    }
}