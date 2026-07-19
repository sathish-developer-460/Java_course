class Functions {
    public static void message() {
        // void is the datatype & message is the function name
        System.out.println("Hello I am learning how to create void function in");
        // Hello I am learning how to create void function in
    }

    public static void sum(int a, int b) {
        int c;
        c = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + c); // Sum of 10 and 20 is 30
    }

    public static void main(String args[]) {
        message();
        sum(10, 20);
    }
}
