// All classes below are in the SAME package (default package) — no "package" line needed.
class Car {
    protected String brandName = "Audi";

    // method
    protected void displayBrand() {
        System.out.println("BrandName From Car Class: " + brandName);
    }
}

// 1) SUBCLASS in the same package — protected member accessible via inheritance
class Sedan extends Car {
    // method
    void showDetails() {
        brandName = "Toyato"; // Accessible in subclass
        displayBrand(); // Accessible in subclass
    }
}

/*
 * 2) ANOTHER CLASS (NOT a subclass) but in the SAME package — still accessible
 * This is the part people often get wrong: protected also allows
 * same-package access even without inheritance.
 */
class AnotherCarClass {
    // method
    void displayBrandNameFromAnotherClass() {
        // creating an object of Car class From AnotherCarClass
        Car c = new Car();
        c.brandName = "Honda";
        System.out.println("BrandName From AnotherCarClass: " + c.brandName);
        c.displayBrand();// calling the method of Car class from AnotherCarClass
    }
}

public class ProtectedModifierExample {
    public static void main(String[] args) {
        // creating an object of Car child
        Sedan myCar = new Sedan(); // Using subClass
        myCar.showDetails();// calling the method

        // creating an object of AnotherCarClass ||
        // Using another class in the same package(Same Folder Structure)
        AnotherCarClass car1 = new AnotherCarClass();
        car1.displayBrandNameFromAnotherClass();
    }
}

/*
 * Output:-
 * BrandName From Car Class: Toyato
 * BrandName From AnotherCarClass: Honda
 * BrandName From Car Class: Honda
 */