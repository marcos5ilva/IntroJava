import java.util.Scanner;
public class inputoutput {


        public static void main(String [] args){
          /*  Scanner scan = new Scanner(System.in);
            // Declarations
            String name;

            System.out.println("What is your name?");
            name= scan.nextLine();

            System.out.println("Nice to meet you "+name+"");
            System.out.printf("I am %.2f year old", 32.0);
            */


          /* Assignment 3a


            Scanner scan = new Scanner(System.in);

            // Declarations
            double area,volume, radius,length;
            //pi= ;


            System.out.print("Radius? ");
            radius = scan.nextDouble();

            System.out.println("Length? ");
            length = scan.nextDouble();

            area = radius*radius*3.14159;
            volume = area*length;

            System.out.println("This the area "+area+"");
            System.out.println("This the volume "+volume+"");

            //System.out.printf("I am %.2f year old", 32.0);

           */

          /* Assignment 3b */
          double monthly, r, t,result;
          Scanner scan = new Scanner(System.in);

          System.out.println("Enter the monthly saivings amount :");
          monthly = scan.nextDouble();

            System.out.println("Enter the interest rate :");
            r = scan.nextDouble();


        //First month result
          result =1.0;
          System.out.println("After the first month, the account value is : "+result);

        }
}
