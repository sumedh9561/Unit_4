package problem_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number");
        int num=sc.nextInt();

        Test t=new Test();
        int[] arr= t.display(num);//Take this argument from user using the Scanner class


        for(int ar:arr) {
            System.out.println(ar);
        }


    }
}
