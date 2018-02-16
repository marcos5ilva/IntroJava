package com.chapter2;
import java.util.Scanner;



public class Assignment5c {

    private static void membersClass(int age, char gender){

        //Classifying users by age and gender
        System.out.println("---------------------------------");
        if(age < 1){

            System.out.println("Member Class: Babe In Arms");

        } else if(age >= 1 && age < 3){

            System.out.println("Member Class: Nursery");

        } else if (age >= 3 && age < 12){

            System.out.println("Member Class: Primary");

        }else if ((age >= 12 &&  age < 18)  && ((gender == 'M') || (gender == 'm'))){

            System.out.println("Member Class: Young Men’s");

        }else if ((age >= 12 && age < 18) && ((gender == 'F') || (gender == 'f'))){

            System.out.println("Member Class: Young Women’s");

        }else if (age >= 18 && ((gender == 'M') || (gender == 'm'))){

            System.out.println("Member Class: Priesthood");

        } else{

            System.out.println("Member Class: Relief Society");
        }

        System.out.println("---------------------------------");

    }


    public static void main(String [] args){
        int age;
        char gender;


        Scanner scan = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.println("    Church Members Classifier");
        System.out.println("---------------------------------");
        System.out.println();

        //Requiring user information
        System.out.println("Enter your age: ");
        age = scan.nextInt();
        System.out.println("Enter your gender (M / F): ");
        gender = scan.next().charAt(0);
        System.out.println();


        //Calling classifying users by age and gender method
        membersClass(age, gender);



    }
}
