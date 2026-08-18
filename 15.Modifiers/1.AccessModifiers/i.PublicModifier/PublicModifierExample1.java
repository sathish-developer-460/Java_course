/*
# Java Modifiers

We divide modifiers into two groups: 
• Access Modifiers - controls the access level 
• Non-Access Modifiers - do not control access level, but provides other functionality 

Access Modifiers in Java:-

Access modifiers in Java control the visibility and accessibility of classes, methods, and 
variables. They are used to enforce encapsulation and maintain control over how different 
parts of a program interact. 
 
 
#Table  
 Access Modifiers:- Access Modifiers are 4 Types
i.public : class(Same Class)+ same Package(Same Folder Structure)+ subClass(extends or in different package)+ Other class(different package or outside package);
ii.protected : class (Same Class)+ same Package(Same Folder Structure) + subClass(extends or in different package)
iii.default : class (Same Class)+ same Package(Same Folder Structure)
iv.private : class (Same Class)
 


 Access Modifiers:- Access Modifiers are 4 Types
 * 1. public -> accessible everywhere
 * 2. protected -> accessible in same package + subclasses (even in other
 * packages)
 * 3. default -> (no keyword) accessible only within the same package
 * 4. private -> accessible only within the same class
 * 
*/



/*
1. Public Modifier 
• Description: The public modifier allows the member to be accessed from anywhere, 
without restrictions. 
• Scope: Accessible in the same class, same package, subclasses, and outside packages.

*/


class Car {
    public String brand="Audi";

    // method
    public void dispalyBrand() {
        System.out.println("Brand: " + brand);
    }
}

class PublicModifierExample1 {
    public static void main(String[] args) {
        // creating an object of Car class
        Car car1 = new Car();
        car1.brand = "Toyota";// Accessible from anywhere
        car1.dispalyBrand();// Accessible from anywhere
    }
}

/*
Output:-
Brand: Toyota
*/