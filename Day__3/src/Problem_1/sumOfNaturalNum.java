package Problem_1;

public class sumOfNaturalNum {
    static int sumOfNaturalNumber(int N)
    {
        return N *(N + 1) / 2;
    }

    public static void main(String[] args) {
        int N=5;
        System.out.println("sum of Natural Number is :- " + sumOfNaturalNumber(N));
    }
}
