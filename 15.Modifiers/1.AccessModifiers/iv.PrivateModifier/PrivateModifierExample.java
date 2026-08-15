/*
 * 4. Private Modifier
 * • Description: The private modifier restricts access to within the class
 * only.
 * • Scope: Accessible only in the same class
 */

// public class Car{
// private String brand="Toyota";
// //method
// private void displayBrand(){
// System.out.println("Brand: "+ brand);
// }
// public void setBrand(String brand){
// this.brand= brand;
// }
// public void showBrand(){
// displayBrand(); //Can be accessed within the class
// }
// }
// public class PrivateModifierExample{
// public static void main(String[] args){
// //creating an object of car class
// Car car1= new Car();
// car1.setBrand("Ford");
// car1.showBrand(); //Indirect access through public method
// }
// }

// Example

class Car {
    private String brandName = "Audi";

    private void displayBrandName() {
        System.out.println("BrandName: " + brandName);
    }

    // public method used to access private members from OUTSIDE the class
    public void showBrandName() {
        displayBrandName(); // ✅ OK - called from within Car itself
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName; // ✅ OK - called from within Car itself
    }
}

public class PrivateModifierExample {
    public static void main(String[] args) {
        Car car1 = new Car();

        // car1.brandName = "Honda"; ❌ COMPILE ERROR - brandName has private access in
        // Car
        // car1.displayBrandName(); ❌ COMPILE ERROR - displayBrandName() has private
        // access in Car

        car1.setBrandName("Honda"); // ✅ allowed - going through a public method
        car1.showBrandName(); // ✅ allowed - going through a public method
    }
}