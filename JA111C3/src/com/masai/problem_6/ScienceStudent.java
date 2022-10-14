package com.masai.problem_6;

public class ScienceStudent implements Student {

    @Override
    public double findPercentage() {
        // TODO Auto-generated method stub
        double perS=this.getBiologyMarks() +this.getChemistryMarks()+this.getMathsMarks()+this.getPhysicsMarks();
        perS=perS/4;

        return perS;
    }

    private int physicsMarks;
    private int chemistryMarks;
    private int mathsMarks;
    private int biologyMarks;

    public int getPhysicsMarks() {
        return physicsMarks;
    }
    public void setPhysicsMarks(int physicsMarks) {
        this.physicsMarks = physicsMarks;
    }
    public int getChemistryMarks() {
        return chemistryMarks;
    }
    public void setChemistryMarks(int chemistryMarks) {
        this.chemistryMarks = chemistryMarks;
    }
    public int getMathsMarks() {
        return mathsMarks;
    }
    public void setMathsMarks(int mathsMarks) {
        this.mathsMarks = mathsMarks;
    }
    public int getBiologyMarks() {
        return biologyMarks;
    }
    public void setBiologyMarks(int biologyMarks) {
        this.biologyMarks = biologyMarks;
    }




}
