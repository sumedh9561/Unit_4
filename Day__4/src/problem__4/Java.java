package problem__4;

public class Java {
    int number ;

    void checkNumber() {

        int temp = (int) (number - (number%10)+10) ;

        if(number<0) {
            System.out.println("Error");
        }else {
            if(number % 2 == 1) {
                System.out.println(number);
            }else {
                System.out.println(temp);
            }
        }

    }

    public static void main( String[] args ) {

        Java num = new Java();
        num.number = 44;

        num.checkNumber() ;
    }
}
