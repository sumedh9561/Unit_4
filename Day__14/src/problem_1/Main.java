package problem_1;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<String>();
        a1.add("Mango");
        a1.add("Apple");
        a1.add("Orange");
        a1.add("Banana");


        //using for loop

        for(int i=0;i<a1.size();i++) {
            System.out.println("fruit name is: "+a1.get(i));
        }
        System.out.println("========================================");

        //using enhance for loop

        for(String s:a1) {
            System.out.println(s);
        }

    }

}
