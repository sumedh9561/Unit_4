package package_2;

public class Demo {

    Demo(){
        this(10);
        System.out.println("inside Demo()....");
    }
    Demo(String s){

        System.out.println("inside Demo(String )....");
        System.out.println(s);
    }

    Demo(int i){
        this("hello");
        System.out.println("inside Demo(int )....");
        System.out.println(i);
    }

    Demo(float num){
        this("100");
        System.out.println("inside Demo(float ....");
        System.out.println(num);
    }




    public static void main(String[] args) {

        Demo d1=new Demo(12.12f);


    }
}
