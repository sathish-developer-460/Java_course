import Vehicles.TwoWheeler.Bike;
import Vehicles.FourWheeler.Car;

public class VehicleExample {
    public static void main(String[] args) {
        // creating an object of Car class
        Car car1 = new Car();
        car1.display();
        // creating an object of Bike class
        Bike bike1 = new Bike();
        bike1.display();
    }
}

/*
 * Output:-
 * This is a Car.
 * This is a Bike.
 */