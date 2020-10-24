package com.fuzailshaikh;

class StringManipulation {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s.contains("W")); //true

        String str = s.replaceAll("World", "Fuzail");
        System.out.println(str); // Hello Fuzail

        str = str.substring(6); // Fuzail
        str = str.toUpperCase();
        System.out.println(str); // FUZAIL

        s = "a/b/c/d";
        String[] arr = s.split("/"); // [a,b,c,d]
    }
}
