package problem_4;

import java.util.Scanner;

public class Main {

    static void arr(int[] ar) {

        System.out.println("output");
        if (ar.length == 1) {
            int num = ar[0];
            int tot = 1;
            for (int i = 1; i <= num; i++) {
                tot = tot * i;
            }
            System.out.println(tot);
        }

        else if (ar.length == 3) {
            int num = ar[0] - ar[1];
            num = Math.abs(num);
            int tot = 1;
            for (int i = 1; i <= num; i++) {
                tot = tot * i;
            }
            System.out.println(tot);

        }

        else {
            System.out.println("Error");

        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value");

        String ar = sc.nextLine();

        int[] arr1 = new int[ar.length()];

        String str = "";
        int i = 0;
        for (Character c : ar.toCharArray()) {

            if (Character.isWhitespace(c)) {
                arr1[i] = Integer.parseInt(str);
                i++;
                str = "";
            } else {
                str += c;
            }

        }
        arr1[i] = Integer.parseInt(str);
        i++;
        str = "";

        arr(arr1);

    }

}