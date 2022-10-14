package com.masai.problem_3;


public class CodingEvaluation extends Evaluation {

    @Override
    void evaluationTiming() {

        System.out.println("Evaluation timing is 2:00 to 3:30");
    }

    CodingEvaluation(String a) {
        if (a == "CodingEvaluation")
            System.out.println("Its a Coding Evaluation");
        evaluationTiming();
        super.printNoOfQuestions(4);
        System.out.println("__________________________________________________________");
    }
}
