//creating a Car Class
class Car {
    String brandName = "Audi";

    // method
    void displayBrandName() {
        System.out.println("BrandName: " + brandName);
    }
}

// creating a child class
class Sedan extends Car {
    // method
    void ShowDetails() {
        System.out.println("BrandName From Sedan Child Class: " + brandName);
    }

}

// Main class
class DefaultModifierExample {
    public static void main(String[] args) {
        // creating an object of Car class
        Car car1 = new Car();
        car1.brandName = "Honda";
        car1.displayBrandName();// calling the method of Car Class

    }
}
/*
 * Output:-
 * BrandName: Honda
 */