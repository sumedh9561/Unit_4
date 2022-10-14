package com.masai.problem_3;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Student> index=new TreeSet<>();

        index.add(new Student(1,"A1",15,24,1));
        index.add(new Student(2,"A2",11,23,11));
        index.add(new Student(3,"A3",25,29,31));
        index.add(new Student(4,"A3",25,29,31));
        index.add(new Student(5,"A5",17,22,12));

        System.out.println(index);
        System.out.println(index.size());
    }



}