package com.fuzailshaikh;

class Array {
    public static void main(String[] args) {
        int[] myNumbers = {100, 50};

        // Another way to declare size of array (2) and set values on each index
        // myNumbers = new int[2];
        // myNumbers[0] = 100;
        // myNumbers[1] = 50;

        int sum = sumMyNumbers(myNumbers);
        System.out.println(sum);
        System.out.println(fancySumOfMyNumbers(100, 150));
        findElement(0, 2);
    }

    static int sumMyNumbers(int[] numbers) {
        int firstNum = numbers[0];
        int secondNum = numbers[1];
        int sum = firstNum + secondNum;
        return sum;
    }

    // Can pass variable arguments with ... syntax and it can be indexed like an array
    static int fancySumOfMyNumbers(int... numbers) {
        return numbers[0] + numbers[1];
    }

    static void findElement(int row, int col) {
        // Jagged array is array of arrays such that member arrays can be of different sizes
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        // 0: [1, 2, 3, 4]
        // 1: [5, 6, 7]

        int cell = myNumbers[row][col];
        System.out.println(cell); 
    }

}

// Jagged Arrays
// Declaring 2-D array with 2 rows 
// int arr[][] = new int[2][]; 

// First row has 3 columns 
// arr[0] = new int[4]; 

// Second row has 2 columns 
// arr[1] = new int[3];