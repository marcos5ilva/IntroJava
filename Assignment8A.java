import java.util.Scanner;


public class Assignment8A {

    //Method to find the larger number in the array
    public static int indexOfMax(int []ints){
        int max = ints[0];
        int indexMax =0;

        //Traversing array and comparing values
        //returning the position of the largest number
        for(int i=0; i<ints.length;i++){
            if (max < ints[i]){
                max = ints[i];
                indexMax = i;
            }
        }
        return indexMax;
    }

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        //Reading numbers from user

        System.out.println("How many elements you will have in the array? :");
        int arraySize = scan.nextInt();
        int [] ints = new int[arraySize];


        //Receiving user values for the array
        System.out.println("Enter "+arraySize +" values :");
        for(int i=0; i<ints.length; i++){

            ints[i] = scan.nextInt();
        }

        //Invoking the method indexOfMax and print the index
        //of the larger number of the array

        System.out.println("The index of the largest number in the array is : "+ indexOfMax(ints) );
    }
}
