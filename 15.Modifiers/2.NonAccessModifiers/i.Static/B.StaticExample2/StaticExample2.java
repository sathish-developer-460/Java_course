/*
 * Static member belongs to class not object.
 * Can be directly accessed through class no need of object creation.
 * Will be initialized only once.
 */

/*
 * //Example:-
 * i. if we want to access variable of Chaishop class then we create a new
 * object
 * (new ChaiShop()) then we access variables it is a normal flow regurally we
 * using it.
 * ii. here we have one method which is "static"
 * iii. by using the static method we can access variable of class directly
 * without creating a new object.
 */

/*1. Regular Method with creating new object */

/*
class ChaiShop {
String branchName = "Bahubali Adda";
}

class StaticExample {
public static void main(String[] args) {
// creating a new object
ChaiShop branch1 = new ChaiShop();
System.out.println(branch1.branchName); // Bahubali Adda

}
}

*/

/*2. static Method(with creating a new object)*/

class ChaiShop {
    static String branchName = "Bahubali Adda";
    // Will be initialized only once.
    int count = 0;
}

class StaticExample2 {
    public static void main(String[] args) {
        System.out.println(ChaiShop.branchName); // Bahubali Adda
        // here i am creating new two objects to increment the count
        ChaiShop branch1 = new ChaiShop(); // branch1={counter=0};
        ChaiShop branch2 = new ChaiShop();// branch2={counter=0};
        branch1.count++;
        branch2.count++;
        System.out.println("Count of Branch1: " + branch1.count);
        System.out.println("Count of Branch2: " + branch2.count);

    }
}
/*
 * Output:-
 * Bahubali Adda
 * Count of Branch1: 1
 * Count of Branch2: 1
 */