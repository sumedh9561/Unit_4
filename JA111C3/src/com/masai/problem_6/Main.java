package com.masai.problem_6;

import java.util.Scanner;
public class Main {

    public static double getStudent(int choice) {
        Scanner sc=new Scanner(System.in);
        switch(choice) {
            case 1:
                ArtStudent a=new  ArtStudent();

                System.out.println("Enter the Marks for hindiMarks:");
                int h=sc.nextInt();
                a.setHindiMarks(h);

                System.out.println("Enter the Marks for englishMarks:");
                int e=sc.nextInt();
                a.setEnglishMarks(e);

                System.out.println("Enter the Marks for historyMarks:");
                int his=sc.nextInt();
                a.setHistoryMarks(his);

                double artp= a.findPercentage();
                return artp;

            case 2:
                ScienceStudent s=new ScienceStudent();
                System.out.println("Enter the Marks for Maths:");
                int m=sc.nextInt();
                s.setMathsMarks(m);;

                System.out.println("Enter the Marks for Chemistry:");
                int c=sc.nextInt();
                s.setChemistryMarks(c);

                System.out.println("Enter the Marks for Biology:");
                int b=sc.nextInt();
                s.setBiologyMarks(b);

                System.out.println("Enter the Marks for Physics:");
                int phy=sc.nextInt();
                s.setPhysicsMarks(phy);;

                double scip=s.findPercentage();
                return scip;



            case 3:

                CommerceStudent comm=new  CommerceStudent();

                System.out.println("Enter the Marks for accountMarks:");
                int acc=sc.nextInt();
                comm.setAccountMarks(acc);

                System.out.println("Enter the Marks for economicsMarks:");
                int eco=sc.nextInt();
                comm.setEconomicsMarks(eco);;

                System.out.println("Enter the Marks for  businessStudiesMarks:");
                int bus=sc.nextInt();
                comm.setBusinessStudiesMarks(bus);
                double commp= comm.findPercentage();
                return commp;


            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Which Student percentage do you want to find:");
        System.out.println("1. ArtStudent");
        System.out.println("2. ScienceStudent");
        System.out.println("3. CommerceStudent");
        int n=sc.nextInt();

        double ans=Main.getStudent(n);
        System.out.println(" Percentage is: "+ans);

    }

}
