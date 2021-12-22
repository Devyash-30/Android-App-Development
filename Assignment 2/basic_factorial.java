package com.company;
import java.util.Scanner;
public class basic_factorial {
    public static void main(String[] args) {
        int y,factorial=1;
        Scanner hm = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = hm.nextInt();
        for(y=1;y<=x;y++){
            factorial=factorial*y;
        }
        System.out.println("Factorial of the entered number is: "+factorial);

    }
}
