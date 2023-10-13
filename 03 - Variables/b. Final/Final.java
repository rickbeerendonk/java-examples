// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

public class Final {
  public static void main(String... args) {
    // Explicit type
    final int expl = 123;
    
    // Implicit type
    final var impl = 456; // int, not an object
    
    Integer explObj = expl;
    Integer implObj = impl;
    System.out.println(explObj.getClass()); // class java.lang.Integer
    System.out.println(implObj.getClass()); // class java.lang.Integer
    
    // Error: final cannot be reassigned
    //expl = impl;
  }
}