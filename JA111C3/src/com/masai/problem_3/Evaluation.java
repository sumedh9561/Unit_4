package com.masai.problem_3;

public abstract class Evaluation {

    private final int numberOfQuestions;

    abstract void evaluationTiming();

    public Evaluation() {
        this.numberOfQuestions = 0;
    }

    void printNoOfQuestions(int p) {
        System.out.println("No. of Questions in Evaluation is :" + p);
    }

}