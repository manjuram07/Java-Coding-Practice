public interface Calculator {
    void add();

    default int sub() {
        return 10;
    }

    static void multiply() {
        System.out.println("Multiplication method");
    }
}
