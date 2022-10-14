package com.masai.problem_5;

import java.util.*;

public class Countword {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Student's Article");
        StringBuilder sb=new StringBuilder(sc.nextLine());

        String str=sb.toString().toLowerCase().replaceAll("[,;:.?!]","");

        List<String> list = Arrays.asList(str.split(" "));

        System.out.println("Number of words "+list.size());

        SortedSet<String> uniqueWords = new TreeSet<String>(list);
        System.out.println("unique charecter "+ uniqueWords.size());
        System.out.println("Words with the count");

        for(String s:uniqueWords)
        {
            int freq=Collections.frequency(list,s);
            System.out.println(s+": "+freq);
        }

    }
}
