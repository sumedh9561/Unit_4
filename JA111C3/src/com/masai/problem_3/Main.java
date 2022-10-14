package com.masai.problem_3;


public class Main {

    void messageToStudents(Evaluation evaluation) {

    }

    public static void main(String[] args) {
        Main obj = new Main() ;

        obj.messageToStudents(new DsaEvaluation("DsaEvaluation"));
        obj.messageToStudents(new CodingEvaluation("CodingEvaluation"));
    }
}