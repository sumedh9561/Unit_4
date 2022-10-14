package com.masai.problem_6;

public class ArtStudent implements Student {
    private int hindiMarks;
    private int englishMarks;
    private int historyMarks;



    public ArtStudent() {
        super();
    }



    public ArtStudent(int hindiMarks, int englishMarks, int historyMarks) {
        super();
        this.hindiMarks = hindiMarks;
        this.englishMarks = englishMarks;
        this.historyMarks = historyMarks;
    }



    @Override
    public double findPercentage() {
        // TODO Auto-generated method stub
        double per=this.getEnglishMarks()+this.getHindiMarks()+this.getHindiMarks();
        per=per/3;
        return per;
    }

    public int getHindiMarks() {
        return hindiMarks;
    }

    public void setHindiMarks(int hindiMarks) {
        this.hindiMarks = hindiMarks;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public int getHistoryMarks() {
        return historyMarks;
    }

    public void setHistoryMarks(int historyMarks) {
        this.historyMarks = historyMarks;
    }




}
