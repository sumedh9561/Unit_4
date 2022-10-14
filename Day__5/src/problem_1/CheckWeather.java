package problem_1;

public class CheckWeather {



    public static void main(String[] args) {
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;


        if(isSnowing || isRaining || temperature >50 ){
            System.out.println("if its raining");
        }
        else{
            System.out.println("Let's go out");
        }

    }
}
