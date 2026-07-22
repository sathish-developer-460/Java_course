class TypeConversion {
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