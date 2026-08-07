/*
 * 2) Parameterized Constructor:
 * • A constructor that accepts parameters to initialize the object with
 * specific values
 */

class Car {
    String brand; // attribute1 or Instance variable
    int speed; // attribute2 or Instance variable

    // creating a Constructor Function (Parameterized Constructor)
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // calling the method to display the values of the attributes
    public void display() {
        System.out.println("Brand: " + brand + " Speed: " + speed);
        // Brand: Audi Speed: 120
    }
}

class ParameterizedConstructorExample {
    public static void main(String[] args) {
        // creating a new Object of the Car class and passing values to the constructor
        Car car1 = new Car("Audi", 120);
        car1.display(); // Parameterized constructor is called
    }
}
