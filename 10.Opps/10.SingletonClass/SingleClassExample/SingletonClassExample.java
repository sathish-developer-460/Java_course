/*
 * #Singleton class:-
 * It a class that allows only one object to be created.
 */

class Singleton {
    // step2: Private static instance
    private static final Singleton instance = new Singleton();

    // Step 1: Private constructor
    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    // Step 3: Public static method to access the instance
    public static Singleton getInstance() {
        return instance;
    }
}

public class SingletonClassExample {

    public static void main(string[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 = s2); // true, both refer to the same instance
    }
}