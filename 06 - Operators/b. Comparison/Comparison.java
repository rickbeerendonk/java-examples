// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.operators.comparison;

public class Comparison {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println(a == b);  // false  (equal)
        System.out.println(a != b);  // true   (not equal)
        System.out.println(a > b);   // true   (greater than)
        System.out.println(a < b);   // false  (less than)
        System.out.println(a >= b);  // true   (greater than or equal)
        System.out.println(a <= b);  // false  (less than or equal)

        b = 7;
        System.out.println(a >= b);  // false   (greater than or equal)
        System.out.println(a <= b);  // true  (less than or equal)

        b = 5;
        System.out.println(a == b);  // true  (equal)
        System.out.println(a != b);  // false   (not equal)
        System.out.println(a >= b);  // true   (greater than or equal)
        System.out.println(a <= b);  // true  (less than or equal)

        // Object equality: == compares references, equals() compares values
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);       // false (different objects)
        System.out.println(s1.equals(s2));  // true  (same content)
    }
}
