import java.util.Scanner;

public class Assignment7C {

    private static double power(double x,int n){

       if (n==0)
           return x=1;

       while (n>0){
           return x * power(x, n-1);
       }
       return x;
    }


    public static void main(String [] args) {

        int n;
        double x;
        String numberString;

        //Program Header
        System.out.println("------------------------------------------------");
        System.out.println("         Calc x to the power of n");
        System.out.println("------------------------------------------------");
        System.out.println();

        Scanner scan = new Scanner(System.in);

        //Reading numbers from user
        System.out.println("Enter x and n separated by space: ");
        numberString = scan.nextLine();

        //Separate numbers by space
        String separatedStr[] = numberString.split(" ");

        //Parsing string to double and int
        x = Double.parseDouble(separatedStr[0]);
        n = Integer.parseInt(separatedStr[1]);


        System.out.println(x + " to the power of " + n + " is:");

        // Call method to calc x to the power of n"
        System.out.println(power(x,n));
    }
}
