class Datatypes {
    public static void main(String args[]) {
        Boolean b1 = true;
        Boolean b2 = false;
        char a = 'G'; // G
        int i = 89; // -2,147,483,648 to 2,147,483,647
        byte b = 4; // Stores whole numbers from -128 to 127
        short s = 56; // -32,768 to 32,767
        double d = 4.355453532; // 15 decimal digits (double precision)
        // for float use 'f' as suffix as standard
        float f = 4.7333434f; // 6 to 7 decimal digits
        // need to hold big range of numbers then we need
        long l = 12121;
        System.out.println("char:" + a);// G
        System.out.println("boolean1:" + b1);// true
        System.out.println("boolean2:" + b2);// false
        System.out.println("integer:" + i);// 89
        System.out.println("byte:" + b);// 4
        System.out.println("short:" + s);// 56
        System.out.println("double:" + d);// 4.355453532
        System.out.println("float:" + f);// 4.7333434
        System.out.println("long:" + l); // 12121
        System.out.println(Short.SIZE); // 16 bits
        System.out.println(Short.MIN_VALUE);// -32768
        System.out.println(Short.MAX_VALUE);// 32767
        System.out.println(Byte.SIZE); // 8 bits
        System.out.println(Byte.MIN_VALUE); // -128
        System.out.println(Byte.MAX_VALUE); // 127
        System.out.println(Integer.SIZE); // 32 bits
        System.out.println("Bool: " + b1 + " " + b2);// true false
    }
}