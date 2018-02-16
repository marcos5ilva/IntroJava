import java.util.Scanner;
public class Assign4a {


    public static void printAmerican (String day, int date, String month, int year) {
        System.out.println("American Format: " + day +", " + month +" "+ date+", "+ year);

    }
    public static void printEuropean (String day, int date, String month, int year) {
        System.out.println("European Format: " + day +" " + date  +" "+ month +" "+ year);

    }



    public static void main(String [] args){
        String day, month;
        int date,year;

        Scanner scan = new Scanner(System.in);



        System.out.println("Day:  ");
        day = scan.nextLine();

        System.out.println("Date:  ");
        date = scan.nextInt();

        System.out.println("Month:  ");
        month = scan.nextLine();

        System.out.println("Year:  ");
        year = scan.nextInt();



        printAmerican(day,date,month,year);
         printEuropean(day,date,month,year);
    }

}


