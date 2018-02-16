package com.chapter2;
import java.util.Scanner;
import java.util.Calendar;

public class IndividualAssignment1 {

    private static int yearsUntilRetire( int currentAge, int retireAge){

        int yearsToRetirement = retireAge - currentAge;
            return yearsToRetirement;
    }

    private static int currentYear(){
       int currentYear = Calendar.getInstance().get(Calendar.YEAR);
       return currentYear;
    }

    private static int yearOfRetirement(int yearsToRetire){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear + yearsToRetire;
    }

    public static void main(String [] args){

        int currentAge, retirementAge;

        Scanner scan = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("           Retirement Plan");
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("What is your current age?");

        currentAge = scan.nextInt();

        System.out.println();
        System.out.println("At what age would you like to retire?");

        retirementAge = scan.nextInt();
        System.out.println();


        System.out.printf("You have %d years left until you can retire",yearsUntilRetire(currentAge, retirementAge) );
        System.out.println();
        System.out.println();
        System.out.printf("It's %d, so you can retire in %d",currentYear() ,yearOfRetirement(yearsUntilRetire(currentAge, retirementAge)));
        System.out.println();
        System.out.println();
        System.out.println("Good Luck!");




    }
}
