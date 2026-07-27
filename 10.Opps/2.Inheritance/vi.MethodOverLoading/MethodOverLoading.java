// What is Method OverLoading:- 
// Same method name but it should be different in any one of the below. 
// ➔ Number of Parameters 
// ➔ Type of Parameters 
// ➔ Order of parameters 
// (single class Example) 
// With display(int a,int s) 

// Method Overloading = having multiple methods with the same name but different parameters in the same class.

//Example1: 

//creating a ChaiShop class
class ChaiShop {
    String branchName;
    int cupsSold;
    int pricePerCup;
    int numberOfEmployees;

    // creating a Constructor Function
    public ChaiShop(String branchName, int cupsSold, int pricePerCup, int numberOfEmployees) {
        this.branchName = branchName;
        this.cupsSold = cupsSold;
        this.pricePerCup = pricePerCup;
        this.numberOfEmployees = numberOfEmployees;
    }

    // writing the method
    // 1.
    void fun() {
        System.out.println("Fun Method: " + 1); // Fun Method: 1
    }
    // 2. we cant write two methods with same name.
    // public void fun() {
    // System.out.println("fUn Method :" + 2);
    // }
    // output
    // MethodOverLoading.java:20: error: method fun() is already defined in class
    // ChaiShop
    // public void fun() {
    // ^
    // 1 error

    // 3.
    void fun(int a) { // one parameter
        System.out.println("Fun Method: " + a); // Fun Method: 2
    }

    // 4.
    void fun(int a, int b) { // two parameter
        System.out.println("Fun Method: " + a + " + " + b + " = " + (a + b));
        // Fun Method: 2 + 3 = 5
    }

    // 5.
    void fun(int a, String b) { // two parameter one is int second is String
        System.out.println("Fun Method:" + "a =" + a + " " + "And" + " " + "b =" + b);
        // Fun Method:a =2 And b =Sathish
    }

    // 6.
    void fun(String a, int b) { // two parameter one is String second is int
        System.out.println("Fun Method:" + "a =" + a + " " + "And" + " " + "b =" + b);
        // Fun Method:a =Sathish And b =2
    }

}

// class Main{ //or
class MethodOverLoadingExample {
    public static void main(String[] args) {
        // creating new Object (object1);
        ChaiShop branch1 = new ChaiShop("Bahubali Adda", 20, 10, 3);

        branch1.fun();// calling the method
        branch1.fun(2);// calling the same method with passing single argument
        branch1.fun(2, 3); // calling the same method with passing two arguments
        branch1.fun(2, "Sathish"); // calling the same method with passing two arguments
        branch1.fun("Sathish", 2); // calling the same method with passing two arguments

    }
}