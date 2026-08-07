/*
What is a Constructor? 
A constructor is a special method used to initialize objects of a class. It is automatically 
called when an object is created. Constructors set up the initial state of an object by 
initializing its attributes. 
Key Characteristics of Constructors: 
1. Same Name as the Class: The constructor's name must match the class name. 
2. No Return Type: Constructors do not have a return type (not even void). 
3. Called Automatically: The constructor is invoked when an object is created using the 
new keyword. 
 
Types of Constructors in Java 
1. Default Constructor: 
o A constructor with no parameters. 
o It is provided by Java if no constructor is explicitly defined. 
*/

class Car {
    String brand; // attribute1 or Instance variable
    int speed;

    // creating a constructor function (Default Constructor)
    public Car() {
        this.brand = "Audi";
        this.speed = 120;
    }

    public void display() {
        System.out.println("Brand: " + brand + " Speed: " + speed);
        // Brand: Audi Speed: 120
    }
}

class DefaultConstructorExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.display(); // Default constructor is called
    }
}