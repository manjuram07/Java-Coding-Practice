package Junit_Class.Junit_Class;

/**
 * Hello world!
 *
 */

class Parent {
    static void display()
    {
        System.out.print("P-Static ");
    }
    void show()
    {
        System.out.print("P-Instance ");
    }
}

class Child extends Parent {
    static void display()
    {
        System.out.print("C-Static ");
    }
    void show() {
        System.out.print("C-Instance ");
    }
}

public class App {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
        obj.show();
    }
}
