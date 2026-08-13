// ================================
// APPROACH 1: Abstract Class (Mandatory Override)
// ================================
abstract class Owner {
    String ownerName = "Animuthyam";
    int age = 21;

    // No body — every child MUST implement this
    abstract void displayDetails();

    // Abstract classes CAN also have normal (concrete) methods
    void greet() {
        System.out.println("Welcome to our Chai Shop!");
    }
}

// ================================
// APPROACH 2: Concrete Class (Optional Override)
// ================================
class Shop {
    String shopType = "Tea Stall";

    // Has a body — this is the DEFAULT behavior
    void openingHours() {
        System.out.println("Default Timing: 6 AM to 10 PM");
    }
}

// ================================
// Child class using BOTH parents' concepts
// ================================
class ChaiShop extends Owner {
    String branchName;
    int cupsSold;
    int pricePerCup;

    ChaiShop(String branchName, int cupsSold, int pricePerCup) {
        this.branchName = branchName;
        this.cupsSold = cupsSold;
        this.pricePerCup = pricePerCup;
    }

    // MANDATORY override — Owner class forces this
    @Override
    void displayDetails() {
        System.out.println("Owner: " + ownerName + " | Branch: " + branchName
                + " | Cups Sold: " + cupsSold);
    }
}

// A branch that does NOT override Shop's method
class SimpleBranch extends Shop {
    // Nothing written — will just use Shop's default openingHours()
}

// A branch that DOES override Shop's method
class SpecialBranch extends Shop {
    @Override
    void openingHours() {
        System.out.println("Special Timing: 5 AM to 12 AM (Midnight)");
    }
}

class MethodOverridingExample3 {
    public static void main(String[] args) {

        // ---- Approach 1 demo ----
        ChaiShop branch1 = new ChaiShop("Bahubali Adda", 50, 10);
        branch1.displayDetails();   // MUST have been overridden — compiler forced it
        branch1.greet();            // inherited concrete method, no override needed

        // Owner owner = new Owner();  // ❌ ERROR: cannot instantiate abstract class

        System.out.println("-----------");

        // ---- Approach 2 demo ----
        SimpleBranch b2 = new SimpleBranch();
        b2.openingHours();   // uses PARENT's default version (not overridden)

        SpecialBranch b3 = new SpecialBranch();
        b3.openingHours();   // uses CHILD's own version (overridden)
    }
}

/*
Output:-

Owner: Animuthyam | Branch: Bahubali Adda | Cups Sold: 50
Welcome to our Chai Shop!
-----------
Default Timing: 6 AM to 10 PM
Special Timing: 5 AM to 12 AM (Midnight)
*/