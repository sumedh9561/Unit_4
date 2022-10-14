package problem__2;


public class Lion {

    String name;
    boolean isHungry;
    int age;
    static int totalDeaths;
    static void printKillings(){
        System.out.println("Total killings by lions in jungle = "+totalDeaths);
    }

    void thinking(String n,boolean b,int a){

        if(isHungry==false) System.out.println(n + " is sleeping");

        else if ( isHungry==true && a>12){

            System.out.println(n + " has eaten two animal");
            totalDeaths=totalDeaths+2;

        } else if (isHungry==true && a>=2 && a<=12){
            System.out.println(n + " has eaten one animal");
            totalDeaths++ ;

        } else if(isHungry=true && a<2 ){
            System.out.println(n +" is calling Mom");
        }
    }

    public static void main(String[] args) {
        Lion lion1 = new Lion();
        lion1.name = "lion1";
        lion1.isHungry =true;
        lion1.age = 15;
        lion1.thinking(lion1.name,lion1.isHungry,lion1.age);

        Lion lion2 = new Lion();
        lion2.name = "lion2";
        lion2.isHungry =true;
        lion2.age = 11;
        lion2.thinking(lion2.name,lion2.isHungry,lion2.age);

        Lion lion3 = new Lion();
        lion3.name = "lion3";
        lion3.isHungry =true;
        lion3.age = 1;
        lion3.thinking(lion3.name,lion3.isHungry,lion3.age);

        printKillings();



    }
}