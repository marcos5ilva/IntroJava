package com.chapter2;
import  java.util.Scanner;
public class Assignment7A {

    private static double poundsToKg(int p){

        double Kg = p/2.200;
        return Kg;
    }

    private static double kgToPounds(int k){

        double P = k*2.200;
        return P;
    }

    private static void makeTable(int limit){
        //Talbe's header
        System.out.println("pounds\t\tkilograms | kilograms  \tpounds");
        System.out.println("------------------------------------------");

        //Table's body
        for(int i=1; i<= limit; i++){

            System.out.printf("%6d", i);//Align integer 6 positions left
            System.out.print("         ");
            System.out.printf("%6.3f",poundsToKg(i)); //Align double 3 positions left
            System.out.printf(" |");
            System.out.print(" ");
            System.out.printf("%9d", i);//Align integer 9 positions left
            System.out.print(" ");
            System.out.printf("%8.2f",kgToPounds(i));
            System.out.print("\n");

        }

    }


    public static void main (String [] args){
        int  usernum, poundsInt, kgInt;
        double poundsDoub, kgLong;


        Scanner scan = new Scanner(System.in);

        //Require number from user
        System.out.println("Enter a number between 10 - 100: ");
        usernum = scan.nextInt();
        System.out.println();

        //Validating user enter
        if(usernum>= 10 & usernum<=100){

            //Invoke method to create and format table
            makeTable(usernum);

        } else {
            //Error message
            System.err.println("The number must be between 10 - 100");
        }

    }
}
