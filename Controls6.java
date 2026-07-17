/*
 * Java Control Statement || Control Flow in Java
 * # Java provides three types of control flow statements.
 *   1.Decision Making Statements
        * i) Simple if statement
        * ii) if-else statement
        * iii) if-else if statement
        * iv) Nested if statement
 *  2. switch statement
 *  3. Looping Statements
        * i) do while loop
        * ii) while loop
        * iii) for loop
 * 4.Jump statements
        * i) break statement
        * ii) continue statement
 * 
 * # Conditional Statements
    * 1) Simple if statement
    * syntax:
    * if(condition){
    * //code to be executed if condition is true
    * }
    * 
    * 2) if-else statement
    * syntax:
    * if(condition){
    * //code to be executed if condition is true
    * }else{
    * //code to be executed if condition is false
    * }
    * 
    * 3) if-else if statement
    * syntax:
    * if(condition1){
    * //code to be executed if condition1 is true
    * }else if(condition2){
    * //code to be executed if condition2 is true
    * }else{
    * //code to be executed if none of the conditions are true
    * }
    * 
    * 4) Nested if statement
    * syntax:
    * if(condition1){
    * if(condition2){
    * //code to be executed if both conditions are true
    * }
    * }
    * else{
    * //code to be executed if condition1 is false
    * }
    * }
 * 
 * 5. Switch statement
    * The switch case in java is used to select one of many code blocks for execution. 
    * Default Keyword : The keyword is used to specify the code executed when the expression does not match any test case.
    * 1. Two cases cannot have the same value.
    * 2. Duplicates case values are not allowed.
    * 3. There can be one or N number of case values for a switch expression.
    * 4. The case value must be of switch expression type only. The case value must be literal or constant. It doesn't allow variables.
    * 5.Each case statement can have a break statement which is optional. When control reaches to the break statement, it jumps the control after the switch expression. if a break statement is not found,it executes the next case. 
    * 6. The case value can have a default label which is optional.
        * syntax:
        * switch(expression){
        * case value1:
        * //code to be executed if expression equals value1
        * break;
        * case value2:
        * //code to be executed if expression equals value2
        * break;
        * default:
        * //code to be executed if expression doesn't match any case
        * }
 * 
 * # Looping Statements :-
 * When you know exactly how many imes you want to loop throwh
 * In computer programming, loops are used to repeat a block 
    * 1) For loop
    * 2) While loop
    * 3) Do-while loop
 */

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
    }
}