public class LocalVariable {
    int instanceVar = 10;
    static int staticVar = 20;

    public static void main(String[] args) {
        // Local variable: Only exists within the method
        int localVar = 30;
        // Print local variable (only inside the main method)
        System.out.println("Local Variable: " + localVar); // Local Variable: 30
        // Print ststic and instance variables (Can access static from anywhere)
        LocalVariable obj1 = new LocalVariable();
        System.out.println("Instance variable (obj1): " + obj1.instanceVar); // Instance variable (obj1): 10
        System.out.println("Static variable (obj1): " + LocalVariable.staticVar); // Static variable (obj1): 20

    }
}
