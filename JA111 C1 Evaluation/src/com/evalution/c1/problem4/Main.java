package com.evalution.c1.problem4;

public class Main {

    public static void runScored(int one, int two, int three, int four ,int six) {
        // write your logic here
        int result =one*one + two*two + three*three + four*four + six*six ;
        System.out.println(result);
    }
    public static void main(String[] args){
        //call runScored with valid parameters
        runScored(1,2,3,4,6);
    }
}
