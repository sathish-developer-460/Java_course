class Arrays {
    public static void main(String[] args) {
        // int a[] = { 33, 3, 4, 5 }; // array declaration
        // System.out.println(a[3]); // 5 // accessing of an element
        // System.out.println(a[0]); // 33

        int a[] = { 33, 3, 4, 5 };
        System.out.println("Before" + a[0]); // a[0]=33
        a[0] = 1222;
        System.out.println("After" + a[0]); // a[0]= 1222

        // Getting the length of the array
        int length = a.length;
        System.out.println("Length" + length); // 4

        // Java One Dimensional Array
        int[] arr; // declares an Array of integers.
        arr = new int[5];// allocating memory for 5 integers.
        // initialize the elements of the array
        // first to last(fifth) element
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50; // int[] arr={10, 20, 30, 40, 50}
        // accessing the elements of the specified array length=5
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " : " + arr[i]); // 10, 20, 30, 40 , 50
        }

        // Java Two Dimensional Array
        int[][] arr = new int[3][3]; // 3rows & 3columns
        System.out.println("Rows: " + arr.length);// Number of Rows => //3
        System.out.println("Columns: " + arr[0].length); // Number of Columns => //3
        // declaring and initializzing 2D array
        int arrr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };
        // Printing 2D array || Nested Loop
        for (int i = 0; i < 3; i++) {
            // i=0 0<3 1 after j=0 loop finishes, then i loop becomes i=1 1<3 2
            for (int j = 0; j < 3; j++) {
                // j=0 0<3 1 || j=1 1<3 2 || j=2 2<3 3
                // j=0 1<3 2 || j=1 1<3 2 || j=2 2<3 3
                // j=0 2<3 3 || j=1 1<3 2 || j=2 2<3 3
                System.out.println(arrr[i][j] + " ");
                // arr[0][0] => 2
                // arr[0][1]=>7
                // arr[0][2]=> 9

                // arr[1][0] => 3
                // arr[1][1]=>6
                // arr[1][2]=> 1

                // arr[2][0] => 7
                // arr[2][1]=>4
                // arr[2][2]=> 2
            }
            System.out.println();

            // example of 2 Dimensional array
            String[] cars = { "Royal Enfield", "BMW", "Java", "Hero" };
            for (int i = 0; i < cars.length; i++) {
                System.out.println(cars[i]);
                // Royal Enfield
                // BMW
                // Java
                // Hero
            }
            int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
            System.out.println(myNumbers[1][2]); // Outputs 7

            int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
            myNumbers[1][2] = 9;
            System.out.println(myNumbers[1][2]);// 9
            System.out.println(myNumbers);// [[I@251a69d7
            for (int i = 0; i < myNumbers.length; i++) {
                System.out.println(myNumbers[i]);
                // [[I@251a69d7
                // [I@7344699f
                // [I@6b95977
            }
            for (int i = 0; i < myNumbers.length; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(myNumbers[i][j] + " ");
                    // 1 2 3
                    // 5 6 9
                }
                System.out.println();
            }

        }
    }
}
