//2. Creating Class & Objects With using Constructor Function & Methods

class Chaishop { // Creating a ChaiShop Class
    String branchName;
    int cupsSold;
    int pricePerCup;
    int numberOfEmployees;

    // Creating Constructor Function
    // syntax of Constructor Function:-
    // public ClassName(parameters) { ... }
    // Constructors have NO return type at all (not even void) — No Need to write
    // void bcz of it doesn't return anything.
    // adding void turns it into a regular method instead of a constructor.

    public Chaishop(String branchName, int cupsSold, int pricePerCup, int numberOfEmployees) {
        this.branchName = branchName; // this.branch means it comes from Chaishop class
        this.cupsSold = cupsSold; // // assigning the parameter value to the instance field (this. resolves naming
                                  // conflict)
        this.pricePerCup = pricePerCup;
        this.numberOfEmployees = numberOfEmployees;
    }

    // Writing the Methods in Class || Functions
    void display() {
        System.out.println("branchName: " + branchName);
        System.out.println("cupsSold " + cupsSold);
        System.out.println("pricePerCup " + pricePerCup);
        System.out.println("numberOfEmployees " + numberOfEmployees);

        // branchName: BahubaliAdda
        // cupsSold 4
        // pricePerCup 5
        // numberOfEmployees 2
        // branchName: PokiriJaaga
        // cupsSold 8
        // pricePerCup 5
        // numberOfEmployees 3
        // branchName: JalsaaKottu
        // cupsSold 10
        // pricePerCup 5
        // numberOfEmployees 4
        // branchName: Pushpa
        // cupsSold 15
        // pricePerCup 5
        // numberOfEmployees 5
    }
}

// class Main { //or
class ClassAndObjectExample2 {
    public static void main(String[] args) {

        // creating new object (branch)
        // Syntax of creating a new object:-
        // ClassName VariableName = new ClassName(arguments)
        Chaishop branch1 = new Chaishop("BahubaliAdda", 4, 5, 2); // Creating object1
        branch1.display(); // Calling the Methods || Function
        Chaishop branch2 = new Chaishop("PokiriJaaga", 8, 5, 3);// Creating object2
        branch2.display();
        Chaishop branch3 = new Chaishop("JalsaaKottu", 10, 5, 4);// Creating object3
        branch3.display();
        Chaishop branch4 = new Chaishop("Pushpa", 15, 5, 5);// Creating object4
        branch4.display();

    }
}
