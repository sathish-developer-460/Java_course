/*
 * 2. Protected Modifier
 * • Description: The protected modifier allows access within the same package
 * and
 * subclasses in different packages.
 * • Scope: Accessible in the same class, same package, and subclasses (even in
 * different
 * packages).
 */
class Car {
    protected String brandName;

    protected void displayBrand() {
        System.out.println("BrandName: " + brandName);
    }
}

class Sedan extends Car {
    // method
    void showDetails() {
        brandName = "Honda"; // Accessible in subclass
        displayBrand();
    }
}

public class ProtectedModifierExample {
    public static void main(String[] args) {
        // creating an object of Car child
        Sedan myCar = new Sedan();
        myCar.showDetails();// calling the method
    }
}

/*
 * Output:-
 * BrandName: Honda
 */
