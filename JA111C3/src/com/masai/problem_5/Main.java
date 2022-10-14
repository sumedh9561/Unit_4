package com.masai.problem_5;

public class Main {

    public static void main(String[] args) {
        FuelCar f1=new FuelCar();

        f1.run();//calling run method on fuelcar object

        f1.service();

        System.out.println("********************************");

        ElectricCar c=new ElectricCar();

        c.run();
        c.service();
    }

}
