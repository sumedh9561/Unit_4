package problem_1;

import java.util.Scanner;

public class Main {

    public static String reversString(String input){

        //write the logic
        String bag="";
        for(int i=input.length()-1;i>=0;i--) {
            bag+=input.charAt(i);
        }
        return bag;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");

        String originalString=sc.next();
        String result = reversString(originalString);
        System.out.println("Original String is :"+originalString);
        System.out.println("Reversed String is :"+ result);

    }
    }
