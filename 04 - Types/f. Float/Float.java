// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

public class Main {
    public static void main(String[] args) {
      // Min and Max

        System.out.println(Float.MIN_VALUE); // 1.4E-45
        System.out.println(Float.MAX_VALUE); // 3.4028235E38

        // Explicit vs Implicit
        
        float explicit = 1.23F;
        var implicit1 = 1.23;  // double
        var implicit2 = 1.23F; // float

        // Literal constants

        System.out.println(1.23F);    //     1.23  (Standard)
        System.out.println(1.23e4F);  // 12300.0   (Exponential)
    }
}
