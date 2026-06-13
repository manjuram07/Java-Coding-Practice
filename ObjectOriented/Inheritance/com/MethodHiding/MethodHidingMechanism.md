Method Hiding Mechanism in Java
What is Method Hiding?
Method hiding occurs when a child class defines a static method with the same signature as a static method in the parent class. method hiding is resolved at compile-time based on the reference type, not the actual object type.

Your Code Example
class Parent {
    public static void display() {
        System.out.println("Display method in Parent class");
    }
}
class Child extends Parent {
    public static void display() {
        System.out.println("Display method in Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); 
        // Output: Display method in Parent class

        Child child = new Child();
        child.display(); 
        // Output: Display method in Child class

        Parent parentRefChild = new Child();
        parentRefChild.display(); 
        // Output: Display method in Parent class (method hiding!)
    }
}
Key Observations
1. Line 21-22: Direct Parent reference
Parent parent = new Parent();
parent.display(); // Calls Parent's display()
✅ Calls Parent's method

2. Line 24-25: Direct Child reference
Child child = new Child();
child.display(); // Calls Child's display()
✅ Calls Child's method

3. Line 27-28: Parent reference pointing to Child object (METHOD HIDING!)
Parent parentRefChild = new Child();
parentRefChild.display(); // Calls Parent's display()
⚠️ Calls Parent's method, NOT Child's method!

This is method hiding: the choice is made based on the reference type (Parent), not the object type (Child).

Method Hiding vs. Method Overriding
Feature	Method Hiding (Static)	Method Overriding (Instance)
Applied To	Static methods	Instance methods
Binding	Compile-time (Static binding)	Runtime (Dynamic binding)
Reference Type	Decision made by reference type	Decision made by object type
Polymorphism	❌ No polymorphic behavior	✅ True polymorphism
Example: Comparison with Method Overriding
class Parent {
    public void display() {  // Instance method (can be overridden)
        System.out.println("Parent's display");
    }
}

class Child extends Parent {
    @Override
    public void display() {  // Instance method (overrides parent)
        System.out.println("Child's display");
    }
}

Parent ref = new Child();
ref.display(); // Output: Child's display (polymorphic behavior - runtime binding)
With an instance method, it calls Child's method (dynamic/runtime binding). With a static method, it calls Parent's method (compile-time binding).

Why Does This Happen?
Static methods belong to the class, not the object
Compiler decides which method to call based on the reference type at compile-time
Runtime cannot override static methods because they are not tied to instance objects
Best Practice
❌ Avoid static method "overriding" because it can be confusing:

Parent ref = new Child();
ref.display(); // Which display() is called? Confusing!
✅ Better approach: Call static methods directly from the class:

Parent.display();  // Clear: calling Parent's static method
Child.display();   // Clear: calling Child's static method
Or use instance methods if you want true polymorphic behavior.