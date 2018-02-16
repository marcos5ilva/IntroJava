package com.chapter2;
import java.util.Random;
import java.util.Scanner;


public class Assignment5a {
    public static void main(String [] args){

        int num1, num2, num3, num4, sumNum,sumUser;

        Random rndNum = new Random();
        Scanner scanner = new Scanner(System.in);

        //Generate random numbers
        num1 = rndNum.nextInt(10);
        num2 = rndNum.nextInt(10);
        num3 = rndNum.nextInt(10);
        num4 = rndNum.nextInt(10);

        //Summ all numbers
        sumNum = num1 + num2 + num3 + num4 ;

        System.out.println(" What is "+ num1+ "+"+num2+"+"+num3+"+"+num4+" = ");

        sumUser = scanner.nextInt();

        if(sumNum == sumUser) {
            System.out.println( + num1+ "+"+num2+"+"+num3+"+"+num4+" = "+sumUser+" is true");
        }else {
            System.out.println( + num1+ "+"+num2+"+"+num3+"+"+num4+" = "+sumUser+" is false");
        }

    }
}
