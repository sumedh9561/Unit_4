package problem_4;

public abstract class Parent {
        final int number;
        public int getNumber() {
            return this.number;
        }
        public Parent(int i) {
            number = i;
        }
        public abstract void method1();

        public final void method2() {
            System.out.println("I am inside method 2 of parent");
        }

        public void method3() {
            System.out.println("I am inside method 3 of parent");
        }
    }

