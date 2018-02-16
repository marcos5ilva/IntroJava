package com.chapter2;
import java.util.Scanner;

public class assign3a {
    public static void main(String [] args) {
        //Assignment 3a


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

    }
}
