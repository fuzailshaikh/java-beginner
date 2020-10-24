package com.fuzailshaikh;

class Data {
    public static void main(String[] args) {
        // Integer (whole number)
        int x = 5;

        // Double precision floating point number
        double y = 3.14;

        // No need for typecasting as we store result in bigger data type
        double doubleSum = x + y;
        System.out.println(doubleSum);

        // Explicit typecasting required as we are trimming result information
        int intSum = x + (int) y;
        System.out.println(intSum);

        // Some data types
        float pi = 3.14f;            // Single precision floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String
    }

}
