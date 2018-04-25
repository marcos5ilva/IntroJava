import java.util.Scanner;

public class IndivitualAssignment2 {

    public static int randomSecretNum(){
        //Generates a random number between 100 and 1000
        //Returns the secret 3 digit number with no repeats
        String secretNum = Integer.toString((int) (100 + (Math.random()* 900 +1)));
        return (int)(100 + (Math.random()* 900 +1)) ;
    }

    public static void comparingStrings(String str1, String str2){

        int matchStr= 0;

        for(int i=0;i<=2;i++){
            if(str1.charAt(i) == str2.charAt(i)){
                System.out.print(" FERMI ");

                matchStr++;
            }

            for(int j=0;j<=2;j++){
                if( (str1.charAt(i)== str2.charAt(j)) && i != j){
                    System.out.print(" PICO ");

                    matchStr++;
                }

            }
        }

        if(matchStr == 0){
            System.out.print("BAGLE");
        }

        System.out.println();


    }

    public static void main(String [] args){

        int playerGuess = 0;
        int  secretNumber;
        int playerGuessCounter=20;


        //Generating the 3 digit secret number
        secretNumber = randomSecretNum();
        //System.out.println(secretNumber);

        //Converting Secret Number to String
        String strSecretNumber = String.valueOf(secretNumber);

        //Program Header
        System.out.println("------------------------------------------------");
        System.out.println("             PICO FERMI BAGLES GAME");
        System.out.println("------------------------------------------------");



        while ( playerGuess != 6 ) {
            System.out.println();
            System.out.println("You still have  [" + playerGuessCounter + "] guesses | [ Press 6 to exit]");

            Scanner scan = new Scanner(System.in);

            //Reading numbers from user
            System.out.println("Enter your 3 digit number guess: ");
            playerGuess = scan.nextInt();

            //System.out.println(playerGuess);
            //Converting Player Guess to String
            String strPlayerGuess = String.valueOf(playerGuess);

            //Leaving the Game
            if (playerGuess == 6 ) {
                System.out.println("Exiting the game.");
                System.exit(0);

            }

            //Checking if the players guess it's right
            if(playerGuess == secretNumber) {
                System.out.println("FERMI FERMI FERMI");
                System.out.println("You win!!!");
                System.out.println("The Secret Number is: "+strSecretNumber);
                System.exit(0);
            } else {

                //Invoking comparingStrings Method
                comparingStrings(strPlayerGuess, strSecretNumber);
            }


            //Decrementing the number of guesses of the player
            playerGuessCounter--;
        }


    }
}
