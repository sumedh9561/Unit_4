package com.evalution.c1.problem3;

//Q3) Change this block of code according to the given instruction and explain the output?
//
//public class Demo {
//    public static void main(String[] args) {
//        int a = 64;
//        int b = 70;
//        byte c = a+b;//typecast (a+b) to byte
//        System.out.println(c){
//        }
//    }
//    Note: You need to typecast (a+b) to byte
//*******************************************************************************************************




public class Demo {

    public static void main(String[] args) {
        int a = 64;
        int b = 70;

//      byte c = a+b;//typecast (a+b) to byte
        byte c = (byte) (a + b);

        System.out.println(c);

    }
}

//Ans :- The process of converting data from higher data type to lower data type is called as Explicit Type
//Casting.
//To perform explicit type casting we have to use the following pattern.
//P a = (Q) b;
//(Q) → Cast operator
//Where P and Q are two primitive data types, where Q must be either same as P or lower than P .


