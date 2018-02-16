package com.chapter2;
import java.util.Scanner;


public class Assignment5b {
    public static void main(String [] args){

        double amount,remainder,amountQuarter, amountDime,amountNickel, amountPenny;
        int amountDollar;

        Scanner scan = new Scanner(System.in);

        //Require user input
        System.out.println("Enter an amount in dollars: ");
        amount = scan.nextDouble();
        System.out.println();
        System.out.println("You have:");
        System.out.println();

        //Subtracting Unit portion
        amountDollar = (int)amount;

        //Checking if we have more than 1 dollar
        if(amountDollar>=1){
            if(amountDollar> 1) {

                System.out.println(amountDollar + " dollars");

            }else {
                System.out.println(amountDollar + " dollar");
            }
        }

        //Subtracting the quarter part
        remainder = amount - amountDollar;
        amountQuarter = remainder / 0.25;
        remainder = (amountQuarter - (int)amountQuarter)*0.25;
        amountQuarter = (int)amountQuarter;

        //Checking if we have more than 1 quarter
        if(amountQuarter >=1){
            if(amountQuarter > 1) {
                System.out.println((int)amountQuarter + " quarters");
            }else {
                System.out.println((int)amountQuarter + " quarter");
            }
        }


        //Subtracting the dime part
        amountDime = remainder / 0.10;
        remainder = (amountDime - (int)amountDime)/10;
        remainder = Math.round(remainder * 100.0) / 100.0;

        amountDime = (int)amountDime;

        //Checking if we have more than 1 dime
        if(amountDime>=1){
            if(amountDime> 1) {
                System.out.println((int)amountDime + " dimes");
            }else {
                System.out.println((int)amountDime + " dime");
            }
        }


        //Checking the nickel part
           if(remainder >= 0.05){
            remainder = remainder - 0.05;
            remainder = Math.round(remainder * 100.0) / 100.0;

            System.out.println("1 nickel");
        }



        //Checking  the pennie part
        amountPenny = remainder * 100;

        //Checking if we have more than 1 penny
        if(amountPenny>=1){
            if(amountPenny> 1) {
                System.out.println((int)amountPenny + " pennies");
            }else {
                System.out.println((int)amountPenny + " penny");
            }
        }

    }
}
