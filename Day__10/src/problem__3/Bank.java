package problem__3;

public class Bank {

    private Bank(){
        System.out.println("Inside private constructor of Bank");
    }

    static Bank getter() {
        Bank b1=new Bank();
        return b1;

    }
}
