package problem_2;

import java.util.Scanner;

public class Demo {
    public static Hotel provideFood(int amount) {
        if(amount>1000) {
            return new TajHotel();
        }else if(amount>200 &&amount<1000) {

            return new RoadsideHotel();
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a valid amount;");
        int amount=sc.nextInt();
        Hotel hotel= provideFood(amount);

        while(hotel==null) {
            System.out.println("Please Enter  a valid amount;");
            int am=sc.nextInt();
            hotel= provideFood(am);
        }

        if(hotel instanceof  TajHotel) {
            TajHotel taj=(TajHotel)hotel;
            taj.chickenBiryani();
            taj.masalaDosa();
            taj.welcomeDrink();
        }else {
            RoadsideHotel roadside=(RoadsideHotel)hotel;
            roadside.chickenBiryani();
            roadside.masalaDosa();
        }

    }

}
