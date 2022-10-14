package problem_4;

public class Engine {

    int rmp;
    int power;
    String manufacturer;
    boolean hasTurbo;

    public boolean hasTurbo() {
        return true;
    }

    public static void main(String[] str) {

        Car c1 = new Car();
        c1.color = "black";
        c1.companyName = "Toyato";
        c1.model = "2022";
        Engine e = c1.engine;
        e.manufacturer = "Toyato";
        e.rmp = 18000;
        e.power = 370;
        e.hasTurbo();
        System.out.println("Color: " + c1.color);
        System.out.println("Company Name: " + c1.companyName);
        System.out.println("Model: " + c1.model);
        System.out.println("Manufacturer: " + e.manufacturer);
        System.out.println("RMP: " + e.rmp);
        System.out.println("Power: " + e.power);
        System.out.println("Has Turbo: " + e.hasTurbo());


        Engine e1 = new Engine();
        e1.manufacturer = "Maruti";
        e1.rmp = 12000;
        e1.power = 120;
        e1.hasTurbo();

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println();

        Car c2 = new Car("Tata", "Tata", "Maroon", e1);
        System.out.println("Color: " + c2.color);
        System.out.println("Company Name: " + c2.companyName);
        System.out.println("Model: " + c2.model);
        System.out.println("Manufacturer: " + e.manufacturer);
        System.out.println("RMP: " + e.rmp);
        System.out.println("Power: " + e.power);
        System.out.println("Has Turbo: " + e.hasTurbo());


    }
}