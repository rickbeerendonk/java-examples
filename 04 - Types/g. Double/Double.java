// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

public class Main {
    public static void main(String[] args) {
      // Min and Max

        System.out.println("Min:          " + Double.MIN_VALUE);         // 4.9E-324
        System.out.println("Max:          " + Double.MAX_VALUE);         // 1.7976931348623157E308
        System.out.println("Min Normal:   " + Double.MIN_NORMAL);        // 2.2250738585072014E-308
        System.out.println("Min Exponent: " + Double.MIN_EXPONENT);      // -1022
        System.out.println("Max Exponent: " + Double.MAX_EXPONENT);      // 1023
        System.out.println("Neg Infinity: " + Double.NEGATIVE_INFINITY); // -Infinity
        System.out.println("Pos Infinity: " + Double.POSITIVE_INFINITY); // Infinity
        System.out.println("Bytes:        " + Double.BYTES);             // 8
        System.out.println("Size:         " + Double.SIZE);              // 64

        // Explicit vs Implicit
        
        double explicit = 1.23;
        var implicit = 1.23;  

        // Literal constants

        System.out.println(1.23);    //     1.23  (Standard)
        System.out.println(1.23e4);  // 12300.0   (Exponential)
    }
}
