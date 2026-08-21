/*
 * #Abstraction :- example TV Remote
 * 
 * i. Hides implementation details and exposes only the essential features of an
 * object.
 * ii. This can be achieved using abstract classes and interfaces.
 * 
 */

abstract class Shape {
    abstract void draw(); // Abstract Method
}

class Circle extends Shape {
    // Overriding the draw method
    void draw() {
        System.out.println("Drawing a Circle"); // Drawing a Circle
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();// output: Drawing a Circle
    }
}