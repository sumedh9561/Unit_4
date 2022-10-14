package com.masai.problem_4;

import java.util.Scanner;

public class Java {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String => ");
        String str = scan.next();

        System.out.println("Enter the Position => ");
        int pos = scan.nextInt();

        boolean p = true;

        while (p) {
            if (pos >= str.length() || pos < 0) {
                System.out.println("Invalid position, Please enter a valid position =>");
                pos = scan.nextInt();
            } else {
                System.out.println("Character at the position  => " + str.charAt(pos));
                break;
            }
        }
    }
}

