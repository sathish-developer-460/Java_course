
//3.
/*
Static: All objects share the same one variable. If any object changes it,
everyone sees the new value. (Will be initialized only once.)
Instance: Each object gets its own separate variable. Changing one object's
copy doesn't touch any other object's copy.
*/

class ChaiShop {
    static String branchName = "Bahubali Adda";
    // Will be initialized only once.
    static int count = 0;
    int btn = 0;
}

class StaticExample3 {
    public static void main(String[] args) {
        System.out.println(ChaiShop.branchName); // Bahubali Adda
        // // here i am creating new two objects to increment the count
        ChaiShop branch1 = new ChaiShop(); // branch1={counter=0};
        ChaiShop branch2 = new ChaiShop();// branch2={counter=0};
        System.out.println("Count of Branch1: " + branch1.count);// Count of Branch1: 0
        System.out.println("Count of Branch2: " + branch2.count);// Count of Branch2: 0
        ChaiShop.count++; // 0+1 =1
        System.out.println("Count of Branch1: " + branch1.count);// Count of Branch1: 1
        ChaiShop.count++; // 1+1 =2
        branch1.btn++; // 0+1 =1
        System.out.println("Count of Branch1: " + branch1.count);// Count of Branch1: 2
        System.out.println("Btn of Branch1: " + branch1.btn);// Btn of Branch1: 1
        branch2.btn++; // 0+1 = 1
        System.out.println("Count of Branch1: " + branch1.count);// Count of Branch1: 2
        // Count of Branch1: 2 (same memory location so, 1+1 = 2)

        System.out.println("Count of Branch2: " + branch2.count);// Count of Branch2: 2
        System.out.println("Btn of Branch1: " + branch1.btn);
        // Btn of Branch1: 1 (Each object gets its own separate variable)

        System.out.println("Btn of Branch2: " + branch2.btn);
        // Btn of Branch2: 1 (Each object gets its own separate variable)

    }
}

/*
 * Bahubali Adda
 * Count of Branch1: 0
 * Count of Branch2: 0
 * Count of Branch1: 1
 * Count of Branch1: 2
 * Btn of Branch1: 1
 * Count of Branch1: 2
 * Count of Branch2: 2
 * Btn of Branch1: 1
 * Btn of Branch2: 1
 */