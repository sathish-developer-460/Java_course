// Creating Constructor Function
// syntax of Constructor Function:-
// public ClassName(parameters) { ... }
// Constructors have NO return type at all — not even void.
// (void is only for methods that explicitly return nothing;
// constructors don't have a return type category at all — it's a special Java
// rule.)

// How the Flow Works:
// i. Main class starts execution (main method)
// ii. `new ChaiShop(...)` is called → this triggers object creation
// iii. The constructor runs immediately, taking the passed-in arguments as
// parameters and assigning them to the object's fields
// (e.g., this.branchName = branchName;)
// iv. Once the constructor finishes, control returns back to Main,
// where you can now call methods on the object, e.g. branch1.display();
// v. The display() method's block of code executes

// /* Example 1 :- My code with constructor function & Methods to creating Class
// & objects. */

// //creating a class
// class ChaiShop {
// String branchName;
// int cupsSold;
// int pricePerCup;
// int totalEmployees;

// // creating a constructor Function
// public ChaiShop(String branchName, int cupsSold, int pricePerCup, int
// totalEmployees) {
// this.branchName = branchName;
// this.cupsSold = cupsSold;
// this.pricePerCup = pricePerCup;
// this.totalEmployees = totalEmployees;
// }

// // method
// void display() {
// // System.out.println(branchName);
// // System.out.println(cupsSold);
// // System.out.println(pricePerCup);
// // System.out.println(totalEmployees);

// /* output */
// // Bahubali
// // 25
// // 12
// // 3
// // jalsaKottu
// // 25
// // 12
// // 3
// // PokiriAdda
// // 30
// // 15
// // 4
// // PushpaAdda
// // 40
// // 20
// // 5
// System.out.println("BranchName: " + branchName + " CupsSold: " + cupsSold + "
// PricePerCup: " + pricePerCup
// + " TotalEmployees " + totalEmployees);

// // output
// // BranchName: Bahubali CupsSold: 25 PricePerCup: 12 TotalEmployees 3
// // BranchName: jalsaKottu CupsSold: 25 PricePerCup: 12 TotalEmployees 3
// // BranchName: PokiriAdda CupsSold: 30 PricePerCup: 15 TotalEmployees 4
// // BranchName: PushpaAdda CupsSold: 40 PricePerCup: 20 TotalEmployees 5
// }
// }

// class WithConstructorFunction {
// public static void main(String[] args) {
// // creating a new Object
// ChaiShop branch1 = new ChaiShop("Bahubali", 25, 12, 3);
// ChaiShop branch2 = new ChaiShop("jalsaKottu", 25, 12, 3);
// ChaiShop branch3 = new ChaiShop("PokiriAdda", 30, 15, 4);
// ChaiShop branch4 = new ChaiShop("PushpaAdda", 40, 20, 5);
// branch1.display();
// branch2.display();
// branch3.display();
// branch4.display();

// }
// }

/*
 * Example 2 :- My code with constructor function & Methods to creating Class &
 * objects.
 */

class ChaiShop {
    String branchName; // attribute1 or Instance variable
    int cupsSold; // attribute2 or Instance variable
    int pricePerCup;
    int numberOfEmplpyees;
    int previousOrderCount;
    int currentOrderCount;

    // creating constructor function
    public ChaiShop(String branchName, int cupsSold, int pricePerCup, int numberOfEmplpyees) {
        this.branchName = branchName;
        this.cupsSold = cupsSold;
        this.pricePerCup = pricePerCup;
        this.numberOfEmplpyees = numberOfEmplpyees;

    }

    // writing a method || functions
    public void display() {
        getRevenue();
        // System.out.println(branchName);
        // System.out.println(cupsSold);
        // System.out.println(pricePerCup);
        // System.out.println(numberOfEmplpyees);
        // System.out.println(previousOrderCount);
        // System.out.println(currentOrderCount);

        // output

        // Bahubali Adda
        // 20
        // 5
        // 2
        // 10
        // 10
        // JalsaKottu
        // 25
        // 7
        // 3
        // 20
        // 5
        // pokiriJaaga
        // 33
        // 10
        // 4
        // 30
        // 3
        // Pushpa Adda
        // 48
        // 15
        // 5
        // 40
        // 8
    }

    // writing a method to get revenue
    public void getRevenue() {
        /*
         * System.out.println(
         * branchName + " revenue : " + previousOrderCount + "prev" + " + " +
         * currentOrderCount + "current"
         * + " = " + (previousOrderCount + currentOrderCount) + "cupsSold" + " * " +
         * pricePerCup + "pricePerCup" + " = " + "Total: " + (cupsSold * pricePerCup));
         */
        // or
        System.out.println(branchName + " revenue : " + previousOrderCount + "prev"
                + " + " + currentOrderCount + "current" + " = " + (cupsSold) + "cupsSold" + " * " + pricePerCup
                + "pricePerCup" + " = " + "Total: " + (cupsSold * pricePerCup));

        // Bahubali Adda revenue : 10prev + 10current = 20cupsSold * 5pricePerCup =
        // Total: 100
        // JalsaKottu revenue : 20prev + 5current = 25cupsSold * 7pricePerCup = Toatl:
        // 175
        // pokiriJaaga revenue : 30prev + 3current = 33cupsSold * 10pricePerCup = Total:
        // 330
        // Pushpa Adda revenue : 40prev + 8current = 48cupsSold * 15pricePerCup = Total:
        // 720

    }

    // writing a method || every order chai count will be increase
    public void chaiOrder(int orderCount) {
        this.previousOrderCount = cupsSold; //// save old total
        this.currentOrderCount = orderCount; //// just this order's count
        this.cupsSold += orderCount; //// update the total
        // or
        // this.cupsSold = previousOrderCount + currentOrderCount; //// update the total
        System.out.println("cupsSold : " + previousOrderCount + "Prev" + " + " +
                currentOrderCount + "Current" + " = "
                + cupsSold + "CupsSold");
        // or
        // System.out.println("cupsSold : " + previousOrderCount +"Prev" + " + " +
        // currentOrderCount + "Current" + " = " +
        // (previousOrderCount+currentOrderCount) + "CupsSold");
        // cupsSold : 10Prev + 10Current = 20CupsSold
        // cupsSold : 20Prev + 5Current = 25CupsSold
        // cupsSold : 30Prev + 3Current = 33CupsSold
        // cupsSold : 40Prev + 8Current = 48CupsSold
    }
}

// class Main { //or
class WithConstructorFunction {
    public static void main(String[] args) {
        // creating four objects(branch1)
        ChaiShop branch1 = new ChaiShop("Bahubali Adda", 10, 5, 2);
        branch1.chaiOrder(10);
        branch1.display();
        // branch1.getRevenue();
        ChaiShop branch2 = new ChaiShop("JalsaKottu", 20, 7, 3);
        branch2.chaiOrder(5);
        branch2.display();
        // branch2.getRevenue();
        ChaiShop branch3 = new ChaiShop("pokiriJaaga", 30, 10, 4);
        branch3.chaiOrder(3);
        branch3.display();
        // branch3.getRevenue();
        ChaiShop branch4 = new ChaiShop("Pushpa Adda", 40, 15, 5);
        branch4.chaiOrder(8);
        branch4.display();
        // branch4.getRevenue();

        // System.out.println(branch1.branchName);
        // System.out.println(branch1.cupsSold);
    }
}

/*
 * output:-
 * cupsSold : 10Prev + 10Current = 20CupsSold
 * Bahubali Adda revenue : 10prev + 10current = 20cupsSold * 5pricePerCup =
 * Total: 100
 * cupsSold : 20Prev + 5Current = 25CupsSold
 * JalsaKottu revenue : 20prev + 5current = 25cupsSold * 7pricePerCup = Total:
 * 175
 * cupsSold : 30Prev + 3Current = 33CupsSold
 * pokiriJaaga revenue : 30prev + 3current = 33cupsSold * 10pricePerCup = Total:
 * 330
 * cupsSold : 40Prev + 8Current = 48CupsSold
 * Pushpa Adda revenue : 40prev + 8current = 48cupsSold * 15pricePerCup = Total:
 * 720
 */