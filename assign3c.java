import java.util.Scanner;
public class assign3c {
    public static void main(String [] args){
        String name;
        double hours,hourly,federal,state,net,gross,federalw,statew,deduction;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee’s name: ");
        name = scan.nextLine();

        System.out.println("Enter the number of hours worked in a week: ");
        hours = scan.nextDouble();

        System.out.println("Enter hourly pay rate: ");
        hourly = scan.nextDouble();

        System.out.println("Enter federal tax rate:  ");
        federal = scan.nextDouble();

        System.out.println("Enter state tax rate:   ");
        state = scan.nextDouble();
        gross=(hours*hourly);
        federalw= (gross * 0.08);
        statew= (gross * 0.06);
        System.out.println("Employee Name: "+name);
        System.out.println("Hours Worked: "+hours);
        System.out.println("Pay Rate: $"+hourly);
        System.out.println("Gross Pay: $"+gross);
        System.out.println("Deductions");
        System.out.println("      Federal Withholding (8.0%):  $"+federalw);
        System.out.println("      State Withholding (6.0%):  $"+statew);
        System.out.println("      Total Deduction:  $"+(federalw+statew));
        System.out.println("Net Pay: $"+(gross-(federalw+statew)));






    }
}
