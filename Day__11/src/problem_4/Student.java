package problem_4;

import java.util.Scanner;

 public class Student {
     private int roll;
     private String name;
     private int marks;
     private char grade;

     @Override
     public String toString() {
         return "Student [roll=" + getRoll() + ", name=" + getName() + ", marks=" + getMarks() + ", grade=" + getGrade() + "]";
     }

     public void displayDetails() {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the Roll :");
         int roll = input.nextInt();
         System.out.println("Enter the Name :");
         String name = input.next();
         System.out.println("Enter the Marks :");
         int marks = input.nextInt();

         Student s = new Student(roll, name, marks);
         setRoll(roll);
         setName(name);
         setMarks(marks);

         char grade = calculateGrade();
         setGrade(grade);
         System.out.println(toString());
     }

     private char calculateGrade() {
         char grade;
         int marks = getMarks();
         if (marks >= 500) {
             grade = 'A';
         } else if (marks >= 400) {
             grade = 'B';
         } else {
             grade = 'C';
         }

         return grade;
     }

     public int getRoll() {
         return roll;
     }

     public void setRoll(int roll) {
         this.roll = roll;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getMarks() {
         return marks;
     }

     public void setMarks(int marks) {
         this.marks = marks;
     }

     public char getGrade() {
         return grade;
     }

     public void setGrade(char grade) {
         this.grade = grade;
     }


     public Student() {
         // TODO Auto-generated constructor stub
     }

     public Student(int roll, String name, int marks) {
         super();
         this.roll = roll;
         this.name = name;
         this.marks = marks;
     }
 }


