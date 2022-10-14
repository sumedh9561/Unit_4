package problem_2;

public class TajHotel implements Hotel{

    public void welcomeDrink(){
        System.out.println("Welcome Drink from the TajHotel");
    }


    @Override
    public void chickenBiryani() {
        // TODO Auto-generated method stub
        System.out.println(" chicken Biryani from the TajHotel");
    }

    @Override
    public void masalaDosa() {
        // TODO Auto-generated method stub
        System.out.println(" masala Dosa from the TajHotel");
    }
}
