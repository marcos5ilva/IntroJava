import java.util.Scanner;

public class Assignmetn6A {
    private static boolean isDivisible(int n, int m){
        if(n%m == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String [] args){

    int m,n;
    String numberString;

    Scanner scan = new Scanner(System.in);

        //Program Header
        System.out.println("------------------------------------------------");
        System.out.println("  Are the first number divisible by the second?");
        System.out.println("------------------------------------------------");
        System.out.println();

        //Reading numbers from user
        System.out.println("Enter two numbers separated by space: " );
        numberString = scan.nextLine();

        //Separate numbers by space

        String separatedStr [] = numberString.split(" ");

        //Parsing string to int
       n = Integer.parseInt( separatedStr[0]  );

       m = Integer.parseInt( separatedStr[1]  );


       //Checking if m is divisible for n
       System.out.println(isDivisible(n,m));






    }
}
