package com.fuzailshaikh;

class Conditions {
    public static void main(String[] args) {
        int age = 24;

        // Ternary operator
        // variable = (condition) ? expressionTrue :  expressionFalse;
        String message = age > 18 ? "is eligible" : "is underage";  
        System.out.println(message);

        // If-Else
        int time = 22;

        if (time < 10) {
          System.out.println("Good morning.");
        } else if (time < 20) {
          System.out.println("Good day.");
        } else {
          System.out.println("Good evening.");
        }

        // Switch-Case
        int day = 4;

        switch (day) {
        case 6:
            System.out.println("Today is Saturday");
            break;
        case 7:
            System.out.println("Today is Sunday");
            break;
        default:
            System.out.println("Looking forward to the Weekend");
        }
    }

}
