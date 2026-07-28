/*
 * Access Modifiers:- Access Modifiers are 4 Types
 * 1. public -> accessible everywhere
 * 2. protected -> accessible in same package + subclasses (even in other
 * packages)
 * 3. default -> (no keyword) accessible only within the same package
 * 4. private -> accessible only within the same class
 * 
 * 
 * i.ChaiShop.java and AccessModifiersExample.java these two files are existed
 * in same root or( same package) so no need to import and export
 * so we can access in root level files without using import and export
 * 
 */

/*
 * //Example1:- Same Class
 * 
 * class AccessModifiersExample {
 * 
 * public static void main(String[] args) {
 * // creating a new class
 * ChaiShop branch1 = new ChaiShop();
 * 
 * System.out.println(branch1.branchName);// Bahubali Adda (It comes from
 * ChaiShop class)
 * System.out.println(branch1.ownerName);// Sathish (It comes from Owner class)
 * branch1.display(); // calling the Method of ChaiShop class
 * }
 * }
 */

/*
 * //Example2:- Same Package (Same Folder Structure)
 * //i. If two files created in same root folder then we can access both files
 * without import & export.
 * //ii. private can not accessible in other class (Different Package)
 * class AccessModifiersExample {
 * public static void main(String[] args) {
 * ChaiShop branch1 = new ChaiShop();
 * System.out.println(branch1.branchName);// Bahubali Adda
 * System.out.println(branch1.ownerName);// Sathish
 * 
 * System.out.println(branch1.publicn);// publicn
 * System.out.println(branch1.protectedn);// protectedn
 * System.out.println(branch1.defaultn);// defaultn
 * // System.out.println(branch1.privaten);
 * // private variable is accessible with in the same class only.
 * // we can not access it in child class or other class
 * 
 * }
 * }
 */

/*
 * //Example 3:- SubClass (Different Package)
 * 
 * class AccessModifiersExample {
 * public static void main(String[] args) {
 * ChaiShop branch1 = new ChaiShop();
 * System.out.println(branch1.branchName);// Bahubali Adda
 * System.out.println(branch1.ownerName);// Sathish
 * branch1.display(); // callin the method of ChaiShop class
 * }
 * }
 */

/*
 * // //Example4:- Other Class (Different Package)
 * 
 * //protectedn, defaultn, privaten those three access modifiers are not
 * accessible in Other Class (Differernt Package).
 * //Only public we can access it.
 * 
 * class AccessModifiersExample {
 * public static void main(String[] args) {
 * ChaiShop branch1 = new ChaiShop();
 * System.out.println(branch1.branchName); // Bahubali Adda
 * System.out.println(branch1.ownerName); // Sathish
 * System.out.println(branch1.publicn);// publicn
 * // System.out.println(branch1.protectedn);
 * // System.out.println(branch1.defaultn);
 * // System.out.println(branch1.privaten);
 * }
 * }
 * 
 */

// Example5:- Using Methods

public class AccessModifiersExample {
    public static void main(String[] args) {
        ChaiShop branch1 = new ChaiShop();
        branch1.disply(); // calling the method of ChaiShop class
    }
}