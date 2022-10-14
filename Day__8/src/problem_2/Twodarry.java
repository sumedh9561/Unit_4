package problem_2;


import java.util.Scanner;


public class Twodarry {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row:");
        int n = sc.nextInt();

        System.out.print("Enter the Colomn:");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        int a=1;

        for(int i=0; i<n; i++) {

            for(int j=0; j<m; j++) {
                arr[i][j] = a;
                System.out.print(a+" ");
                a++;
            }
            System.out.println("");
        }

        System.out.println("****output*****");

        for(int j=0;j<m;j++) {
            int sum=0;
            for(int i=0;i<n;i++) {

                if(arr[i][j] % 2 == 0) {
                    sum+= arr[i][j];
                }
            }
            System.out.println(sum);
        }

    }
}
