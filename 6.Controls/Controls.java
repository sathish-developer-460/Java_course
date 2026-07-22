class ControlStatements {
    public static void main(String[] args) {
        // 1. if - else if -else statement
        // example1
        int x = 10;
        int y = 12;
        if (x + y > 20) { // 22 > 20 //true
            System.out.println("x+y is greater than 20");
        } else if (x < y) { // 10 < 12 //false
            System.out.println("x is less than y");
        } else { // if both conditions are false
            System.out.println("x is equal to y");
        }

        // example2
        String city = "Hyderabad";
        if (city == "Hyderabad") {
            System.out.println("Welcome to Hyderabad");
        } else if (city == "Bangalore") {
            System.out.println("Welcome to Bangalore");
        } else if (city == "Chennai") {
            System.out.println("Welcome to Chennai");
        } else {
            System.out.println("Welcome to India");
        }

        // 2. Nested if statement examples
        // example1
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            if (a < b) {
                System.out.println("a is less than b");
            } else {
                System.out.println("a is equal to b");
            }
        }
        // example2
        int c = 10;
        int d = 20;
        // Outer if condition
        if (c == 10) {
            // Inner if condition
            if (d == 20) {
                System.out.println("c is 10 and d is 20");
            }
        } else {
            System.out.println("c is not 10 or d is not 20");
        }

        // 3. switch statement examples
        // example1
        int number = 20;
        // Switch expression
        switch (number) {
            // case statements
            case 10:
                System.out.println("Number is 10");
                break;
            case 20:
                System.out.println("Number is 20");
                break; // if we give break statement then it will not execute the next case statement
                       // and
            // if we give break statement then it will execute the next case statement also
            // (30).
            case 30:
                System.out.println("Number is 30");
                break;
            default:
                System.out.println("Number is not 10, 20, or 30");
        }

        // 4. Loops
        // i. ForLoop
        int n = 5;
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun i=" + i);
        }
        // ii. while loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        // iii. do while loop example1
        int i = 0;
        do {
            System.out.println(i); // 0 1 2 3 4
            i++;
        } while (i < 5);
        // do whle loop example2
        int i = 0;
        do {
            System.out.println(i); // 0
            i++;
        } while (i < 0);

        // Jumpting Statements
        // 1. beak example
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i); // 0 1 2 3
        }
        // 2. continue example (skip the current iteration and excute the remaining
        // numbers)
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue; // skip the 4th number iteration
            }
            System.out.println(i); // 0 1 2 3 5 6 7 8 9
        }
    }
}