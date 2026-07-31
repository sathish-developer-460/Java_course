/*
InnerClass:-

*/

class ChaiShop {
    String branchName = "Bahubali Adda";

    class ChaiThings {
        String primaryThing = "Milk";
    }
}

class InnerClassExample {
    public static void main(String[] args) {
        // Creating a new object
        ChaiShop branch1 = new ChaiShop();
        System.out.println(branch1.branchName); // Bahubali Adda
        // Creating a new object
        // here we are using branch1 which is the object created by the ChaiShop
        // branch1 => is the outer class branch
        ChaiShop.ChaiThings ch = branch1.new ChaiThings();
        System.out.println(ch.primaryThing); // Milk
    }
}