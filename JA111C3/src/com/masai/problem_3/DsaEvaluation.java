package com.masai.problem_3;


public class DsaEvaluation extends Evaluation {

    @Override
    void evaluationTiming() {

        System.out.println("Evaluation timing is 09:30 to 11:00");
    }

    DsaEvaluation(String a) {
        if (a == "DsaEvaluation")
            System.out.println("Its a Dsa Evaluation");
        evaluationTiming();
        super.printNoOfQuestions(5);
        System.out.println("_______________________________________________________");

    }
}

