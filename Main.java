package com.chapter2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        String name;

        System.out.println("What is your name?");
        name = scan.nextLine();

        System.out.println("Nice to meet you "+name+"!");
        System.out.printf("I am %.2f years old",32.0);

    }
}
