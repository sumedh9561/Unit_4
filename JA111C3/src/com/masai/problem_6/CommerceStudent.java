package com.masai.problem_6;

public class CommerceStudent implements Student {

    @Override
    public double findPercentage() {
        double perc=this.getAccountMarks()+this.getBusinessStudiesMarks()+this.getEconomicsMarks();
        perc=perc/3;
        return perc;
    }


    private int accountMarks;
    private int economicsMarks;
    private int businessStudiesMarks;

    public CommerceStudent() {

    }

    public CommerceStudent(int accountMarks, int economicsMarks, int businessStudiesMarks) {
        super();
        this.accountMarks = accountMarks;
        this.economicsMarks = economicsMarks;
        this.businessStudiesMarks = businessStudiesMarks;
    }

    public int getAccountMarks() {
        return accountMarks;
    }

    public void setAccountMarks(int accountMarks) {
        this.accountMarks = accountMarks;
    }

    public int getBusinessStudiesMarks() {
        return businessStudiesMarks;
    }

    public void setBusinessStudiesMarks(int businessStudiesMarks) {
        this.businessStudiesMarks = businessStudiesMarks;
    }

    public int getEconomicsMarks() {
        return economicsMarks;
    }

    public void setEconomicsMarks(int economicsMarks) {
        this.economicsMarks = economicsMarks;
    }









}
