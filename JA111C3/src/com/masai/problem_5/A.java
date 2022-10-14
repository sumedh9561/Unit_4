package com.masai.problem_5;

public interface A {
    int i = 111;
}

//        Because interface fields are static and final by default and you can't change
//        their value once they are initialized. In the above code, methodB() is changing
//        value of interface field A.i. It shows compile time error.
