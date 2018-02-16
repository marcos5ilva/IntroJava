import java.util.Scanner;

public class Assignment7B {

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
    //Returns d for draw, p for player win, c for computer win
    public static char runGame (int player){

        char result = 'n';
        int comp = (int) (Math.random() * 2);

        //Checking for a draw
        if(player == comp){
            System.out.println("The computer is "+ translate(comp) +".You are "+ translate(player) + ". Its a draw!");
            result = 'd';
        } else if (player == 1 & comp == 0){
            System.out.println("The computer is "+ translate(comp) +".You are "+ translate(player) + ". You win!");
            result = 'p';
        } else if (player == 1 & comp == 2){
            System.out.println("The computer is "+ translate(comp) +".You are "+ translate(player) + ". You lose!");
            result = 'c';
        } else if(player == 0 & comp == 1){
            System.out.println("The computer is "+ translate(comp) +".You are "+ translate(player) + ". You lose!");
            result = 'c';
        } else if(player == 0 & comp == 2){
            System.out.println("The computer is "+ translate(comp) +".You are "+ translate(player) + ". You win!");
            result = 'p';
        } else if(player == 2 & comp == 0){
            System.out.println("The computer is "+ translate(comp) +".You are "+ translate(player) + ". You lose!");
            result = 'c';
        } else if(player == 2 & comp == 1){
            System.out.println("The computer is "+ translate(comp) +".You are "+ translate(player) + ". You win!");
            result = 'p';
        }

        return result;
    }

    public static void main (String [] args) {

        int playerChoice = 4;
        int scorePlayer = 0;
        int scoreComp = 0;
        char result = 'd';
        Scanner scan = new Scanner(System.in);

        while (playerChoice != 6 ) {
            System.out.println("---------------------------------");
            System.out.println("     Rock, Paper, Scissors Game");
            System.out.println("---------------------------------");
            System.out.println("SCORE:  Player ["+scorePlayer+"] vs Computer["+scoreComp+"]");

            //Requiring user information
            System.out.println("Please choose: 0 for Scissors | 1 for Rock | 2 for Paper  [ Press 6 to exit]");
            System.out.println();
            System.out.println("Enter your choice:");
            playerChoice = scan.nextInt();

            System.out.println();


            if (playerChoice == 0 || playerChoice == 1 || playerChoice == 2) {
                runGame(playerChoice);

                if(result == 'p'){
                    scorePlayer=scorePlayer+1;
                }
                if(result == 'c'){
                    scoreComp=scoreComp+1;
                }


            } else if (playerChoice == 6 ) {
                System.out.println("Exiting the game.");
                System.exit(0);

            } else {
                System.out.println("You MUST enter a 0, 1, or 2.");
                System.out.print("\033\143");
                System.out.flush();
            }
        }

    }



}
