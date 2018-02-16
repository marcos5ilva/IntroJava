package com.chapter2;
import java.util.Scanner;

public class Assignment4c {

    private static int  snark(int numSnarks){
        return numSnarks = numSnarks+1;
    }

    private static int  moreSnarks(int multiSnarks){
        return multiSnarks = multiSnarks +10;
    }

    private static int  powerSnarks(int lotsOfSnarks){
        return lotsOfSnarks =  (int)Math.pow(lotsOfSnarks, 5);

    }

    public static void main(String [] args){

        int snarkStart;

        Scanner scan = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.println("           More Snarks");
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("How many snarks to start with?");

        snarkStart = scan.nextInt();
        System.out.println();
        System.out.println("RESULT: ");
        System.out.println();

        //Call snark method and print result
        System.out.println(snark(snarkStart));

        //Call moreSnarks method and print result
        System.out.println(moreSnarks(snark(snarkStart)));

        //Call powerSnarks method and print result
        System.out.println(powerSnarks(moreSnarks(snark(snarkStart))));

    }
}
