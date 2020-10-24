package com.fuzailshaikh;

class Loops {
    public static void main(String[] args) {
      runForLoop();
    }

    static void runForLoop() {
      // Statement 1 is executed (one time) before the execution of the code block.
      // Statement 2 defines the condition for executing the code block.
      // Statement 3 is executed (every time) after the code block has been executed.
      for (int i = 1; i <= 10; i++) {
        System.out.println(i);
      }
    }

    // Execution only when condition is true
    static void runWhileLoop() {
      int i = 1;
      while (i <= 10) {
        System.out.println(i);
        i++;
      }
    }

    // Execution atleast once
    static void runDoWhileLoop() {
      int i = 1;
      do {
        System.out.println(i);
        i++;
      }
      while (i < 11);
    }

    static void runForEachLoop() {
      String[] people = {"John", "Abe", "Jimmy"};

      // Iterate over each element
      for (String i : people) {
        System.out.println(i);
      }
    }
    
    static void breakFromLoop() {
      for (int i = 1; i <= 10; i++) {
        if (i == 5) {
          break;
        }
        System.out.println(i);
      }
    }

    static void continueInLoop() {
      for (int i = 1; i <= 10; i++) {
        if (i == 5) {
        // Does not print 5 because we continue with next iteration
          continue;
        }
        System.out.println(i);
      }
    }

}
