package com.fuzailshaikh;

import static java.lang.System.*;
import java.util.Scanner;

// Run using: java -ea Assertions.java
class Assertions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter age: ");  
        
        int value = scanner.nextInt();  
        scanner.close();
        assert value >= 18: "Not valid";  

        // Now no need of System.out  
        out.println("Age is "+value); 
    }

}
