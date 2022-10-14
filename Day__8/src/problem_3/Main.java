package problem_3;

import java.util.Arrays;

public class Main {

        public int[] findAndReturnPrimeNumbers(int[] inputArray){
            //write the logic to iterate through the supplied inputArray and
            //determine each element whether it is prime or not
            //create a second array of int
            //if any number is prime inside the inputArray then add that number inside the second
            //array
            //and return the second array
            //if no prime number is found then return the empty array.
            int l=0;
            int[]  secondArray= {};

            for(int i=0;i<inputArray.length;i++) {
                int j=0;

                for(int k=2;k<=inputArray[i];k++)
                    if(inputArray[i]%k==0) {
                        j++;
                    }
                if(j==1) {

//				System.out.println(inputArray[i]);
                    l++;
                    secondArray = Arrays.copyOf(secondArray, 0+ l);

                    secondArray[l-1]=inputArray[i];

//				System.out.println();
                }
            }
            return secondArray;
        }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Main obj=new Main();
        int[] inputArray= {10,12,5,50,11,14,15,13};
        int[] result=obj.findAndReturnPrimeNumbers(inputArray);
        if(result.length>0) {
            for(int index=0;index<result.length;index++) {
                System.out.println(result[index]);
            }
        }else {
            System.out.println("Prime number not found in the supplied Array");
        }


    }

}


