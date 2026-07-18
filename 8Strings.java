/* Java Strings
    In java, a string is a sequence of characters. For example, "kiran" is a string containing a sequence of characters 'k', 'i', 'r', 'a', and 'n'.
    we use double quotes to represents a string in Java.
    //create a string 
    String Name = "JavaLife";
    //create strings
    String first ="Java";
    String second = "JavaLife";
    String third="JavaLifeSathish";

    //Java Strings
    System.out.println(first);
    System.out.println(second);
    System.out.println(third);

#Java String Operations
1. Get the Length of a string:
    To find the length of a string, we use the length() method.
    //create a string 
    String greet ="Namaste Bhai";
    System.out.println("String: "+ greet);

    //get the length of greet
    int length = greet.length();
    System.out.println("Length: "+ length);

2. Join Two Java Strings
    we can join two strings in java using the concat() method.

3.Compare Two Strings
    In Java, we can make comparisons between two strings using the equals() method 
    
4.Java String 
    The contains() method checks whether the specified string (sequence of character) is present in the string or not.

5.Java String replace
    The replace() method replaces each matching occurance of a character/ text in the string with the new character/text.

6.Java String toLowerCase()
    The toLowerCase() method converts all characters in the string to lowercase characters

7.Java String trim()
    The trim() method removes any leading (starting) and trailing(ending) whitespaces

8.Java String isEmpty()
    
=> Create Java Strings Using the New Keyword
        //create a string using new
        String name = new String("Java String");
        System.out.println(name); //print Java String

Create Java Strings using the New Keyword
*/
class StringsEx {
    public static void main(String[] args) {
        // // 1. Get the Length of a string:
        // // create strings
        // String first = "Java";
        // String second = "JavaLife";
        // String third = "JavaLifeSathish";

        // // Java Strings
        // System.out.println(first); // Java
        // System.out.println(second); // JavaLife
        // System.out.println(third); // JavaLifeSathish

        // // create a string
        // String greet = "Namaste Bhai";
        // System.out.println("String: " + greet); // String: Namaste Bhai

        // // get the length of greet
        // int length = greet.length();
        // System.out.println("Length: " + length); // Length: 12

        // // 2.Join Two Java String
        // // create first string
        // String first = "Java";
        // System.out.println("First String: " + first);// First String: Java

        // // create second
        // String second = "Life";
        // System.out.println("Second string: " + second);// Second string: Life

        // // join two strings
        // String joinedString = first.concat(second);
        // System.out.println("Joined string: " + joinedString);// Joined string:
        // JavaLife

        // 3.Compare Two Strings
        // create 3 strings
        String first = "java programming";
        String second = "java programming";
        String third = "python programming";

        // compare first and second strings
        boolean result1 = first.equals(second);
        System.out.println("Strings first and second are equal: " + result1); // Strings first and second are equal:
                                                                              // true

        // compare first and third strings
        boolean result2 = first.equals(third);
        System.out.println("Strings first and third are equal: " + result2); // Strings first and third are equal: false

        // compare first and third strings
        boolean result3 = first.equals(third);
        System.out.println("Strings first ad third are equal: " + result3); // Strings first and third are equal: false

        // 4. Java String => Contains()
        String str1 = "Java String contains()";
        // check if str1 contains "Java"
        boolean result = str1.contains("Java");
        System.out.println(result); // true

        // 5.Java String replace
        String str2 = "bat ball";
        // replace b with c
        System.out.println(str2.replace('b', 'c')); // cat call

        // 6.Java String toLowerCase
        String str3 = "JAVA PROGRAMMING";
        System.out.print(str3.toLowerCase()); // java programming

        // 7.Java String trim
        String str4 = "  Learn Java Programming       ";
        System.out.println(str4.trim()); // Learn Java Programming

        // 8.Java String isEmpty()
        String str5 = "Java Programming";
        String str6 = "";
        System.out.println(str5.isEmpty()); // false
        System.out.println(str6.isEmpty()); // true

        // Create Java String Using the New Keyword
        String name = new String("Java String");
        System.out.println(name); // Java String
    }
}
