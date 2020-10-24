package com.fuzailshaikh;

class Operators {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;

        // Arithmetic
        System.out.println("Sum: " + x + y);
        System.out.println("Diff: " + (x - y));
        System.out.println("Multiply: " + x * y);
        System.out.println("Divide: " + x / y);
        System.out.println("Modulus: " + x % y);

        // Comparison
        System.out.println("Less than: " + (x < y));
        System.out.println("Greater than: " + (x > y));
        System.out.println("Equality: " + (x == y));

        // Logical
        System.out.println("AND: " + (x == 10 && y == 2));
        System.out.println("OR: " + (x == 10 || y == 5));
        System.out.println("NOT: " + !(x == 10));
    }

}
