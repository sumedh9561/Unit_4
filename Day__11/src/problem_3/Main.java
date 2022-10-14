package problem_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Length");
        int length=sc.nextInt();

        System.out.println("Enter Breadth");
        int breadth=sc.nextInt();

        System.out.println("Enter Side");
        int side=sc.nextInt();

        System.out.println("Enter Radius");
        int radius=sc.nextInt();
        sc.close();

        Shape area=new Area();

        int circle=area.circleArea(radius);
        int rectangle=	area.rectangleArea(length, breadth);
        int squre=area.squareArea(side);

        System.out.println("Rectangle Area : " +rectangle);
        System.out.println("Squre Area     : "+squre);
        System.out.println("Circle Area    : "+circle);
    }
}
