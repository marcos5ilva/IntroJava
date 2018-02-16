package com.chapter2;
import java.util.Scanner;

public class Assignment5d {

    //Translate the number choices into named options
    public static String translate(int choice){
        String choiceName =" ";

        switch (choice){
            case 0: choiceName = "Scissors";
            break;

            case 1: choiceName = "Rock";
            break;

            case 2: choiceName = "Paper";
            break;
        }

        return choiceName;

    }

    //Game basic mechanic
    public static void runGame (int player){

        int comp = (int) (Math.random() * 2);

        //Checking for a draw
        if(player == comp){
            System.out.println("The computer is "+ translate(comp) +".You are "+ translate(player) + ". Its a draw!");
        } else if (player == 1 & comp == 0){
            System.out.println("The computer is "+ translate(comp) +".You are "+ translate(player) + ". You win!");
        } else if (player == 1 & comp == 2){
            System.out.println("The computer is "+ translate(comp) +".You are "+ translate(player) + ". You lose!");
        } else if(player == 0 & comp == 1){
            System.out.println("The computer is "+ translate(comp) +".You are "+ translate(player) + ". You lose!");
        } else if(player == 0 & comp == 2){
            System.out.println("The computer is "+ translate(comp) +".You are "+ translate(player) + ". You win!");
        } else if(player == 2 & comp == 0){
            System.out.println("The computer is "+ translate(comp) +".You are "+ translate(player) + ". You lose!");
        } else if(player == 2 & comp == 1){
            System.out.println("The computer is "+ translate(comp) +".You are "+ translate(player) + ". You win!");
        }




    }

    public static void main (String [] args) {

        int playerChoice;
        Scanner scan = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.println("     Rock, Paper, Scissors Game");
        System.out.println("---------------------------------");
        System.out.println();

        //Requiring user information
        System.out.println("Please choose:");
        System.out.println();
        System.out.println("0 for Scissors");
        System.out.println("1 for Rock");
        System.out.println("2 for Paper");

        System.out.println();

        System.out.println("Enter your choice:");
        playerChoice = scan.nextInt();

        System.out.println();

        runGame( playerChoice);
    }

}
