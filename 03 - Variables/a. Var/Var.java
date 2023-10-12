// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

public class Var {
  public static void main(String... args) {
    // Explicit type
    int expl = 123;
    
    // Implicit type
    var impl = 456; // int, not an object
    
    Integer explObj = expl;
    Integer implObj = impl;
    System.out.println(explObj.getClass()); // class java.lang.Integer
    System.out.println(implObj.getClass()); // class java.lang.Integer
    
    // No error (as opposed to const)
    expl = impl;
    
    System.out.println(expl); // 456
  }
}