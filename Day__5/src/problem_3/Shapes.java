package problem_3;

//public class Shapes{
//    void area(double x){
//        double z = 3.14 * x * x;
//        System.out.println("The area of the circle is "+z+" sq units");
//    }
//    void area(float x, float y){
//        System.out.println("The area of the rectangle is "+x*y+" sq units");
//    }
//    void area(float x){
//        System.out.println("The area of the square is "+Math.pow(x, 2)+" sq units");
//    }
//
//    public static void main(String[] args) {
//        Shapes obj=new Shapes();
//        obj.area(2.5);
//        obj.area(11,12);
//        obj.area(5);
//    }
//}

public class Shapes {
    public void circle(int radius)
    {
        int pi=22/7;
        int ans=pi*radius*radius;
        double x=ans;
        System.out.println("Area circle "+x);
    }
    public void rectangle(int length , int breadth )
    {
        int ans=length*breadth;
        double x=ans;
        System.out.println("Area Rectangle "+x);
    }
    public void Square(int sides)
    {
        int ans=sides*sides;
        double x=ans;
        System.out.println("Area Square "+x);
    }

    public static void main(String args[])
    {
        Shapes d=new Shapes();
        d.circle(25);
        d.rectangle(2, 4);
        d.Square(5);
    }

}
