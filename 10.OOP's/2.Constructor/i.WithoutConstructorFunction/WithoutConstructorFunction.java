/*
 * # Creating a Class & Objects Without using Constructor Function & Methods
 */

//Example 1:-

// class Main{ //or
class WithoutConstructorFunction {
    public static void main(String[] args) {

        // branch1
        String branchName1 = "Bahubali Adda";
        int cupsSold1 = 5;
        int pricePerCup1 = 10;
        int totalNumberOfEmployees1 = 2;

        // branch2
        String branchName2 = "Pokiri Jaaga";
        int cupsSold2 = 10;
        int pricePerCup2 = 10;
        int totalNumberOfEmployees2 = 3;

        // branch3
        String branchName3 = "Pushpa Jaaga";
        int cupsSold3 = 15;
        int pricePerCup3 = 12;
        int totalNumberOfEmployees3 = 5;

        System.out.println(branchName1); // Bahubali Adda
        System.out.println(cupsSold1);// 5
        System.out.println(pricePerCup1);// 10
        System.out.println(totalNumberOfEmployees1);// 2
        System.out.println(branchName2); // Pokiri Jaaga
        System.out.println(cupsSold2);// 10
        System.out.println(pricePerCup2);// 10
        System.out.println(totalNumberOfEmployees2);// 3
        System.out.println(branchName3); // Pushpa Jaaga
        System.out.println(cupsSold3); // 15
        System.out.println(pricePerCup3);// 12
        System.out.println(totalNumberOfEmployees3);// 5
    }
}

/*
 * It is not best practice to give values to object properties here we
 * overcome
 * this issue by using the constructor function
 *
 */

// /* Example 2:- Without using Constructor creating a class and objects */

// // creating a class
// class ChaiShop {
// String branchName;
// int cupsSold;
// int pricePerCup;
// int totalEmployees;

// // method
// void display(String branchName, int cupsSold, int pricePerCup, int
// totalEmployees) {
// this.branchName = branchName;
// this.cupsSold = cupsSold;
// this.pricePerCup = pricePerCup;
// this.totalEmployees = totalEmployees;
// System.out.println("BranchName: " + branchName);
// System.out.println("Cups Sold: " + cupsSold);
// System.out.println("Price Per Cup: " + pricePerCup);
// System.out.println("Total Employees: " + totalEmployees);
// }
// }

// class WithoutConstructorFunction {
// public static void main(String[] args) {
// // creating a new Object
// ChaiShop branch1 = new ChaiShop();
// ChaiShop branch2 = new ChaiShop();
// ChaiShop branch3 = new ChaiShop();
// ChaiShop branch4 = new ChaiShop();
// branch1.display("Bahubali", 25, 12, 2);
// branch2.display("jalsaKottu", 25, 12, 3);
// branch3.display("PokiriAdda", 30, 15, 4);
// branch4.display("PushpaAdda", 40, 20, 5);

// }
// }

// // //output

// // BranchName: Bahubali
// // Cups Sold: 25
// // Price Per Cup: 12
// // Total Employees: 2
// // BranchName: jalsaKottu
// // Cups Sold: 25
// // Price Per Cup: 12
// // Total Employees: 3
// // BranchName: PokiriAdda
// // Cups Sold: 30
// // Price Per Cup: 15
// // Total Employees: 4
// // BranchName: PushpaAdda
// // Cups Sold: 40
// // Price Per Cup: 20
// // Total Employees: 5