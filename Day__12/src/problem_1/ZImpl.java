package problem_1;

public class ZImpl implements Z {
    @Override
    public void absX() {
        System.out.println("abs of X");
    }

    @Override
    public void absY() {
        System.out.println("abs of Y");
    }

    @Override
    public void absZ() {
        System.out.println("abs of Z");

    }

    @Override
    public void defX() {

        System.out.println("X of overriden default");
    }
}
