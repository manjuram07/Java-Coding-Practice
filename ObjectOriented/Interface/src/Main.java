abstract class Demo implements Calculator {
    public void add() {
        System.out.println(20+30+ " Addition method");
    }

    static void multiply() {
        System.out.println(30*50 + " Multiplication");
    }

}

class Test extends Demo {
    public int sub() {
        int val = super.sub();
        System.out.println(50-20+ " Subtraction method");
        return val;
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Test();
        calc.add();
        System.out.println(calc.sub());

        Demo.multiply(); // Calls static method from Calculator interface

    }
}