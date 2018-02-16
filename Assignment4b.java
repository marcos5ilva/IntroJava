package com.chapter2;

import java.util.Scanner;

public class Assignment4b {


        private static void  showsCurrentTime (int timeZone) {


           long gmtTime = System.currentTimeMillis();
           long gmtTimeSec;
           long gmtTimeMin;
           long gmtTimeHour;

           //Time zone offset conversion

            //Converting from ms to hours min sec
            gmtTimeSec = ((gmtTime/1000))%60;
            gmtTimeMin = ((gmtTime/1000)/60)%60;
            gmtTimeHour = ((gmtTime/1000)/(60*60))%24;

            //Subtracting time offset
            gmtTimeHour = (gmtTimeHour + timeZone);
            System.out.println();
            System.out.println("---------------------------------");
            System.out.printf("  Current time is   %d : %02d : %02d",gmtTimeHour, gmtTimeMin, gmtTimeSec);
            System.out.println();
            System.out.println("---------------------------------");
        }

        public static void main(String [] args){

            int timeZone;

            Scanner scan = new Scanner(System.in);
            System.out.println("---------------------------------");
            System.out.println("   GMT Current Time Converter");
            System.out.println("---------------------------------");
            System.out.println();


            System.out.println("What is the time zone offset?: ");
            timeZone = scan.nextInt();

            showsCurrentTime(timeZone);




    }
}
