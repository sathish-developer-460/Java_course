// What is Method Overriding:-
// Same method name with same number and type and order of parameters.
// Child class replaces parent's behavior
// Java runs the child's version automatically
// @Override annotation.

//My version:- 
//If the same method exists in the parent class, and you write it again in the child class, then the child class's method is considered — not the parent class's method. This is called method overriding.

//why we use @override:- 
// @Override is not compulsory, but it's a safety check
// It prevents typo/signature mistakes
// It makes the code clearer for other developers

//Example 1:

//creating Owner Class (Parent Class)
class Owner {
    String ownerName = "Animuthyam";
    int age = 21;
    int num = 123;

    void fun() {
        System.out.println("Fun Method :" + 2);
    }
}

// creating ChaiShop class (Child Class)
class ChaiShop extends Owner {
    String branchName;
    int cupsSold;
    int pricePerCup;
    int numberOfEmplpyees;

    // creating constructor function
    public ChaiShop(String branchName, int cupsSold, int pricePerCup, int numberOfEmplpyees) {
        this.branchName = branchName;
        this.cupsSold = cupsSold;
        this.pricePerCup = pricePerCup;
        this.numberOfEmplpyees = numberOfEmplpyees;
    }

    // writing the method
    @Override
    void fun() {
        System.out.println("Fun Method: " + 1); // Fun Method: 1
    }

}

// class Main{ // or
class MethodOverridingExample {
    public static void main(String[] args) {
        // creating four objects(branch1)
        ChaiShop branch1 = new ChaiShop("Bahubali Adda", 10, 5, 2);
        branch1.fun();// calling the method
    }
}
