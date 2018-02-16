import java.util.Scanner;

public class Assignment6B {
    private static int maxNum(int n, int m, int o){

        int large;
        if(n>m & n>o){
            large = n;
        }
        else if(m>n & m>o){
            large = m;
        }
        else {
            large = o;}
            return large;
    }
    public static void main(String [] args){
        int m,n,o;
        String numberString;
        Scanner scan = new Scanner(System.in);

        //Program Header
        System.out.println("------------------------------------------------");
        System.out.println("               The Largest Number");
        System.out.println("------------------------------------------------");
        System.out.println();


        //Reading numbers from user
        System.out.println("Enter three numbers separated by space: " );
        System.out.println();
        numberString = scan.nextLine();


        //Separate numbers by space

        String separatedStr [] = numberString.split(" ");

        //Parsing string to int
        n = Integer.parseInt( separatedStr[0]  );

        m = Integer.parseInt( separatedStr[1]  );

        o = Integer.parseInt( separatedStr[2]  );
        /*System.out.println("Enter first number: " );
        n = scan.nextInt();

        System.out.println("Enter second number: " );
        m = scan.nextInt();

        System.out.println("Enter third number: " );
        o = scan.nextInt();*/

        System.out.println("Largest number is " + maxNum(n,m,o));






    }
}
