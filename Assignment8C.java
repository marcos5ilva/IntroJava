import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Assignment8C {

    public static void frequenceCount(List<Integer> numbers){
            //Method counts the frequence that a number
            //appears on the array

            //Storing the list in a 100 sized array
            int[] counts = new int[101];

            //Counting numbers occurrences
            for(int number : numbers){
                counts[number]++;
            }

            //Print results
            for(int i=0; i< counts.length; i++){
                if(counts[i]>0 && counts[i] == 1) {

                    System.out.println(i + " occurs " + counts[i] + " time");
                } else if(counts[i]>0) {
                    System.out.println(i + " occurs " + counts[i] + " times");

                }
            }
    }

    public static void main(String [] args){
        List<Integer> list = new ArrayList<>();

        int userNumb = 42;

        Scanner scan = new Scanner(System.in);

        //Requiring user information
        System.out.println("Enter with a list of integers between 1 and 100: ");
        System.out.println("[ Press 0 when finish]");

        //Receiving data until user press 0
        while(userNumb !=0){
            System.out.println("Enter next number: ");
            userNumb = scan.nextInt();

            if(userNumb < 0 || userNumb>100)
            {
                System.out.printf("The numbers must be between 1 and 100:");
            }
            if(userNumb >= 0 && userNumb <=100){
                list.add(userNumb);
            }

        }

        //removing 0 from the list
        list.remove(list.size()-1);

        //Involing frequenceCount method
        frequenceCount(list);



    }


}
