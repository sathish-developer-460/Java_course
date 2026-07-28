/* run the file 
// PS F:\Java-Tutorial\14.JavaPackage> javac ChaiShop.java
// PS F:\Java-Tutorial\14.JavaPackage> java ChaiShop
*/

import Example1.InnerExample.Owner;

class ChaiShop extends Owner {
    // class ChaiShop extends Boom {
    String branchName = "Bahubali Adda";

    public static void main(String args[]) {
        ChaiShop branch1 = new ChaiShop();
        System.out.println(branch1.branchName); // Bahubali Adda
        System.out.println(branch1.ownerName); // Sathish
        // System.out.println(branch1.a); // 2
    }
}
