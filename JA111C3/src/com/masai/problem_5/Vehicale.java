package com.masai.problem_5;


public interface Vehicale {
    void run();

    default  void service() {
        System.out.println("Car needs service");
    }

}