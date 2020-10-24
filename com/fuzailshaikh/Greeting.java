package com.fuzailshaikh;

class Greeting {

    // public: access modifier so that method is available to everyone
    // static: so we don't need to create an object of this class to run this function
    // void: return type which indicates that we don't return any value from this function
    // main: method name
    // String[] args: Parameter which is array of string 
    public static void main(String[] args) {

        // System: class
        // out: static object
        // println(): method of static 'out' object
        System.out.println("Hello World");

        String firstArg = args[0];
        System.out.println("Hello " + firstArg);

        pyramidPrint();
    }

    static void pyramidPrint() {
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
    }

    static void pyramidPrintEscapeChars() {
        System.out.print("*\n");
        System.out.print("**\n");
        System.out.print("***\n");
        System.out.print("****\n");
        System.out.print("*****\n");
    }
}
