// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.operators.assignment;

public class Assignment {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);   // 10

        a += 5;
        System.out.println(a);   // 15

        a -= 3;
        System.out.println(a);   // 12

        a *= 2;
        System.out.println(a);   // 24

        a /= 4;
        System.out.println(a);   // 6

        a %= 4;
        System.out.println(a);   // 2

        a <<= 2;
        System.out.println(a);   // 8

        a >>= 1;
        System.out.println(a);   // 4

        a &= 0b111;
        System.out.println(a);   // 4

        a |= 0b010;
        System.out.println(a);   // 6

        a ^= 0b011;
        System.out.println(a);   // 5
    }
}
