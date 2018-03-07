import java.util.Scanner;


public class a8b {


    public static boolean areFactors (int n, int[] divisors){

        //areFactors returns true if n is divisible by all the numbers of the array, takes an integer for parameter.

        int count=0;// counts how many times the elements of the array are divisible ny n
        boolean flag2= false; //flag2 will be returned

        for (int i=0; i<divisors.length; i++){

            //n is tested against each element of the array

            int flag = n%divisors[i];

            if (flag == 0){
                count++; //each time n iss divisible by an array element count is added 1
            }

        }

        if (count == divisors.length){
           flag2= true; // if "count" equals the number of elements in the array then n is divisible by all of them
        }

        return flag2;

    }


    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        //Explain the program objective
        System.out.println("We will test if a given number is divisible by a list of the next numbers");

        Scanner scan = new Scanner(System.in);

        //Reading numbers from user

        System.out.println("How many elements you will have in the list? :");
        int arraySize = scan.nextInt();
        int [] ints = new int[arraySize];


        //Receiving user values for the array
        System.out.println("Enter "+arraySize +" values :");
        for(int i=0; i<ints.length; i++){

            ints[i] = scan.nextInt();
        }

        System.out.println("Enter the number you want to check if is divisible by the given list: ");
        int n = in.nextInt();//user's input
        boolean flag3= areFactors(n, ints);//calling the method by passing n and a list of numbers

        System.out.println(flag3);//output the result


    }
}
