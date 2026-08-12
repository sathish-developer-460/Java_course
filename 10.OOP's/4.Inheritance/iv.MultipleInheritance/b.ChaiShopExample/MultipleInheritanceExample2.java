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

//Example:-

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