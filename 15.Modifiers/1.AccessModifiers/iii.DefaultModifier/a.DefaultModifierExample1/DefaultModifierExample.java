/*
 * 3. Default (Package-Private) Modifier
 * • Description: When no modifier is specified, the member is accessible only
 * within the same package.
 * • Scope: Accessible in the same class and package, but not in subclasses or
 * other packages.
 */

class Car {
    String brand; // Default modifier

    void displayBrand() {// Default Method
        System.out.println("Brand: " + brand);
    }
}

class DefaultModifierExample {
    public static void main(String[] args) {
        // creating an object
        Car car1 = new Car();
        car1.brand = "Hyundai"; // accessible in the same package(Same Folder Structure)
        car1.displayBrand();// calling the methodof Car class
    }
}

/*
 * Output:-
 * Brand: Hyundai
 */