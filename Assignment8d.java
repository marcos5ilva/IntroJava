
import java.util.Scanner;

public class Assignment8d {
    public static boolean equals(int[][] m1, int[][] m2){
        //Method compare two arrays and check if they are
        //strictly identical or not

        int count =0;
        boolean result;

        //Comparing the array's elements
        //and counting the matches
        for (int i=0; i<3;i++){
            for (int j=0; j<3; j++){
                if (m1[i][j]==m2[i][j]){
                    count++;
                }
            }
        }

        if (count==9){
            result = true;
        }else {
            result = false;
        }

    return result;
    }


    public static void main (String[] args){

            Scanner in = new Scanner(System.in);
            int[][] m1 = new int[3][3];
            int[][] m2 = new int[3][3];

            //Explain the program for the user
            System.out.println("We will compare two 3x3 arrays to determine if they are strictly identical");
            System.out.println();
            System.out.println("Enter the 9 values for the first array :");

            //Storing values on the first array
            for (int i=0; i<3;i++){
                for (int j=0; j<3; j++){
                    m1[i][j]= in.nextInt();
                }
            }
            System.out.println();
            System.out.println("Enter the 9 values for the second array :");

            //Storing values on the second array
            for (int i=0; i<3;i++){
                for (int j=0; j<3; j++){
                    m2[i][j]= in.nextInt();
                }
            }

            //Invoking the method equals
            //and storing the result
            boolean result = equals(m1,m2);

            //Printing array m1
            System.out.println();
            System.out.print("Array m1: [");
            for (int i=0; i<3;i++){
                for (int j=0; j<3; j++){
                    System.out.print(" "+m1[i][j]);
                }
            }
            System.out.println("]");
            System.out.println();

            //Printing array m2
            System.out.print("Array m2: [");
            for (int i=0; i<3;i++){
                for (int j=0; j<3; j++){
                    System.out.print(" "+m2[i][j]);
                }
            }
            System.out.println("]");
            System.out.println();

            //Checking the result give the right answer to the user
            if (result){
                System.out.println();
                System.out.println("The two arrays are strictly identical");

            }else{
                System.out.println();
                System.out.println("The two arrays are not strictly identical");
            }
    }
}