// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.operators.bitwise;

public class Bitwise {
    public static void main(String[] args) {
        int a = 0b1010;  // 10
        int b = 0b1100;  // 12

        System.out.println(a & b);    // 8   (AND:  0b1000)
        System.out.println(a | b);    // 14  (OR:   0b1110)
        System.out.println(a ^ b);    // 6   (XOR:  0b0110)
        System.out.println(~a);       // -11 (NOT: inverts all bits)
        System.out.println(a << 1);   // 20  (left shift: multiply by 2)
        System.out.println(a >> 1);   // 5   (signed right shift: divide by 2)
        System.out.println(a >>> 1);  // 5   (unsigned right shift)
    }
}
