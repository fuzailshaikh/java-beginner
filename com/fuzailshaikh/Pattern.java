package com.fuzailshaikh;

class Pattern {
    public static void main(String[] args) {
        int lines = 4;

        int spaces = lines - 1;
        int startNumber = 1;
        

        for(int i = 0; i < lines; i++){
            System.out.print(" ".repeat(spaces));
            int currentNumber = startNumber;
            int totalChars = 2*i + 1;

            for (int j = 0; j < totalChars; j++){
                if (j < totalChars/2){
                    System.out.print(currentNumber++);
                }
                else{
                    System.out.print(currentNumber--);
                }
            } 

            System.out.println();
            spaces--;
            startNumber++;
        }

    }
}

// OUTPUT
//     1
//    232
//   34543
//  4567764