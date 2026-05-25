// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.operators.arithmetic;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(a + b);   // 13  (addition)
        System.out.println(a - b);   // 7   (subtraction)
        System.out.println(a * b);   // 30  (multiplication)
        System.out.println(a / b);   // 3   (integer division)
        System.out.println(a % b);   // 1   (remainder)

        // Increment and decrement
        int c = 5;
        System.out.println(c++);     // 5   (post-increment: return, then add)
        System.out.println(c);       // 6
        System.out.println(++c);     // 7   (pre-increment: add, then return)
        System.out.println(c--);     // 7   (post-decrement: return, then subtract)
        System.out.println(c);       // 6
        System.out.println(--c);     // 5   (pre-decrement: subtract, then return)
    }
}
