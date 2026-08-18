/*
 * 4. Private Modifier
 * • Description: The private modifier restricts access to within the class
 * only.
 * • Scope: Accessible only in the same class
 */

class Car {
    private String brandName = "Audi";

    private void displayBrandName() {
        System.out.println("BrandName: " + brandName);
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName; // OK - called from within Car itself
    }
      // public method used to access private members from OUTSIDE the class
    public void showBrandName() {
        displayBrandName(); //Can be accessed within the class
    }

}

public class PrivateModifierExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrandName("Honda"); // allowed - going through a public method
        car1.showBrandName(); // allowed - going through a public method
    }
}
/*
Output:-
BrandName: Honda
*/