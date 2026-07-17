// In the Java, there are two types of type conversion: implicit and explicit.
/* 1. widening Casting (automatically) - converting a smaller data type to a larger data type size.
byte -> short -> char -> int -> long -> float -> double
int myInt = 9;
double myDouble = myInt; // Automatic casting: int to double
System.out.println(myInt);      // Outputs 9
System.out.println(myDouble); // outputs 9.0
/*
   /*2. Narrowing Casting manually - converting a larger data type to a smaller size type
   double -> float -> long -> int -> char ->short -> byte
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int
    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
    float myFloat = (float) myDouble; // Manual casting: double to float
    System.out.println(myFloat); // outputs 9.78
*/
class TypeConversion4 {
    public static void main(String args[]) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double (No data loss)
        System.out.println(myInt); // Outputs 9
        System.out.println(myDouble); // outputs 9.0

        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble1; // Manual casting: double to int (Data loss) (Converting Big data type to small
                                      // data type)
        System.out.println(myDouble1); // Outputs 9.78
        System.out.println(myInt1); // Outputs 9
    }
}