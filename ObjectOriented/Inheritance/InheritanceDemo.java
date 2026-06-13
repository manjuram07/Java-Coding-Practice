

class A{
    public void m1(){
        System.out.println("this is class A");
    }
}

class B extends A{
    public void m2(){
        System.out.println("this is class B");
    }
}
public class InheritanceDemo {
  public static void main(String args[]) {
     B b = new B();
     b.m1();
     b.m2();
    
  }
}