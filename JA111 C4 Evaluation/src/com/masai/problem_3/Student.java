package com.masai.problem_3;

public class Student implements Comparable<Student>{

    private int rollNo;
    private String name;
    private int mathsMarks;
    private int scienceMarks;
    private int engMarks;

    public Student(int roll,String name,int mm,int sm,int em){
        this.rollNo=roll;
        this.name=name;
        this.engMarks=em;
        this.mathsMarks=mm;
        this.scienceMarks=sm;
    }
    Student(){}
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMathsMarks() {
        return mathsMarks;
    }
    public void setMathsMarks(int mathsMarks) {
        this.mathsMarks = mathsMarks;
    }
    public int getScienceMarks() {
        return scienceMarks;
    }
    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }
    public int getEngMarks() {
        return engMarks;
    }
    public void setEngMarks(int engMarks) {
        this.engMarks = engMarks;
    }
    @Override
    public int compareTo(Student s2) {

        Student s1=this;
        if(s1.getEngMarks()+s1.getMathsMarks()+s1.getScienceMarks()<s2.getEngMarks()+s2.getMathsMarks()+s2.getScienceMarks()) {
            return +1;

        }
        else if( s1.getEngMarks()+s1.getMathsMarks()+s1.getScienceMarks()>s2.getEngMarks()+s2.getMathsMarks()+s2.getScienceMarks()) {

            return -1;
        }
        else
//		 return -1;

//			System.out.println(s2.getName().compareTo(s1.getName()));
            if(s2.getName().compareTo(s1.getName())!=0) {
                return s2.getName().compareTo(s1.getName());
            }
            else
            if(s1.getRollNo()<s2.getRollNo()) {
                return +1;

            }
            else
                return -1;
//			return s2.getName().compareTo(s1.getName());




    }
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", mathsMarks=" + mathsMarks + ", scienceMarks="
                + scienceMarks + ", engMarks=" + engMarks + "]";
    }



}