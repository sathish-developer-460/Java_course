/*
Multiple Inheritance:- 
i. A Child class inherits from multiple parent class 
ii. Lets try to check this with ChaiPodiSupplier example
iii.In Java single class can't extend multiple parent classes. 


Interface:-
i. A single class can inherit mutiple interfaces.
Syntax:- Class implements interface1, interface2.
ii. All variables should be initialized in interface
iii. Method should not have body.
iv. Every Method should be overrided in its child class.

if we don't write the same method in the child class it should get the below error
// Main.java:22: error: ChaiShop is not abstract and does not override abstract method display() in Owner
// class ChaiShop implements Owner, ChaiPodiSupplier {
// ^
// 1 error

v. MultipleInheritance is possible with Interface only not possible with class
Parent classes: Owner and ChaiPodiSupplier
Child Class: ChaiShop which is the only one child class for both parent classes (Owner and ChaiPodiSupplier).

*/

//Example1:-

//interface instead of class
// Creating Parent interface (Owner)

interface Owner {
    String ownerName = "Animuthyam";
    int age = 21;
    int num = 123;

    // iii. Method should not have body.
    void display();
}

// Creating Parent interface (ChaiPodiSupplier)
interface ChaiPodiSupplier {
    String supplierName = "Sathish";
}

// Creating Child Class (ChaiShop)
// which is the child class for both parents
// Child class implementing BOTH interfaces
class ChaiShop implements Owner, ChaiPodiSupplier {
    String branchName = "Booom";

    public void display() {
        System.out.println(1); // 1
    }
}

class MultipleInheritanceExample2 {
    public static void main(String[] args) {
        ChaiShop branch1 = new ChaiShop();
        System.out.println(branch1.ownerName); // Animuthyam
        System.out.println(branch1.supplierName);// Sathish
        System.out.println(branch1.branchName); // Booom
        branch1.display();
    }
}

/*
 * Output:-
 * Animuthyam
 * Sathish
 * Booom
 * 1
 */

// Example2:-
interface Owner {
    String ownerName = "Sathish";
    int age = 20;
    int number = 123;

    void display();
}

interface ChaiPodiThings {
    String chaiPodiSupplier = "Sathya";

    void supply();
}

class ChaiShop implements Owner, ChaiPodiThings {
    String brandName = "Bahubali Adda";

    @Override
    public void display() {
        System.out.println(ownerName + " is the owner of the ChaiShop.");
    }

    @Override
    public void supply() {
        System.out.println(chaiPodiSupplier + " is the supplier of the Chaishop.");
    }

    // method
    void displayBrandName() {
        System.out.println(brandName);
    }

}

class Main {
    public static void main(String[] args) {
        // creating an object of child class
        ChaiShop chaiShop1 = new ChaiShop();
        chaiShop1.display();
        // chaiShop1.ownerName= "Harsha"; //can't reassign a final variable
        chaiShop1.supply();
        chaiShop1.brandName = "Pushpa Adda";
        chaiShop1.displayBrandName();

    }
}
/*
 * Output:-
 * Sathish is the owner of the ChaiShop.
 * Sathya is the supplier of the Chaishop.
 * Pushpa Adda
 */
/*
 * Fields in an interface are automatically public static final (constants),
 * even if you don't write those keywords.
 * final means they can't be reassigned after their initial value.
 * So chaiShop1.ownerName = "Harsha"; fails — you're trying to change a
 * constant.
 */