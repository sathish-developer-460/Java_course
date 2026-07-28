
/*
 * //Example1:- Same Class
 * 
 * import Example1.OwnerExample.Owner;
 * 
 * public class ChaiShop extends Owner {
 * public String branchName = "Bahubali Adda";
 * public String publicn = "publicn";
 * protected String protectedn = "protectedn";
 * String defaultn = "defaultn";
 * private String privaten = "privaten";
 * 
 * void display() {
 * System.out.println(publicn);// publicn
 * System.out.println(protectedn);// protectedn
 * System.out.println(defaultn);// defaultn
 * System.out.println(privaten);// privaten
 * }
 * }
 */

/*
 * //Example2:- Same Package (Same Folder Structure)
 * //If two files created in same root folder then we can access both files
 * without import & export.
 * 
 * import Example1.OwnerExample.Owner;
 * 
 * public class ChaiShop extends Owner {
 * public String branchName = "Bahubali Adda";
 * public String publicn = "publicn";
 * protected String protectedn = "protectedn";
 * String defaultn = "defaultn";
 * private String privaten = "privaten";
 * 
 * }
 */

/*
 * //Example3:- SubClass (Different Package)
 * 
 * //default & private can not accessible in child class(sub class)
 * import Example1.OwnerExample.Owner;
 * 
 * public class ChaiShop extends Owner {
 * public String branchName = "Bahubali Adda";
 * 
 * void display() {
 * System.out.println(publicn);// publicn
 * System.out.println(protectedn);// protectedn
 * // System.out.println(defaultn);
 * // System.out.println(privaten);
 * // both default and private can not be accessible in child class (sub class)
 * }
 * }
 */

/*
// Example4:- Other class (Different Package)

import Example1.OwnerExample.Owner;
public class ChaiShop extends Owner {
    public String branchName = "Bahubali Adda";
}
*/

// Example5 :- using methods

import Example1.OwnerExample.Owner;

public class ChaiShop extends Owner {
    public void publicMethod() {
        System.out.println("Public Method");// Public Method
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");// Protected Method
    }

    // Default Method
    void defaultMethod() {
        System.out.println("Default Method");// Default Method
    }

    private void privateMethod() {
        System.out.println("Private Method");// Private Method
    }

    void disply() {
        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}
