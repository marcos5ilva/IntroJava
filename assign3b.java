package com.chapter2;
import java.util.Scanner;

public class assign3b {
    public static void main(String [] args) {
        /* Assignment 3b */
        double monthly, r,result;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the monthly saivings amount :");
        monthly = scan.nextDouble();

        System.out.println("Enter the interest rate :");
        r = scan.nextDouble();

        //Converting r in a monthly percentage
        r=(r/100)/12;

        result = 0;

        //Sixth month compound interest result

            for(int i=1; i<=6; i++) {
                result+=monthly;
                result+=(result*r);

            }

        System.out.println("After the sixth month, the account value is : "+result);
    }

}
