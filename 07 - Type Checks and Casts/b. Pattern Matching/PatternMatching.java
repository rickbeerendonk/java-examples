// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.typechecks.patternmatching;

public class PatternMatching {
    public static void main(String[] args) {
        // instanceof with pattern variable (Java 16+)
        // No need for explicit cast after the check
        Object obj = "Hello";

        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());  // HELLO
            System.out.println(s.length());       // 5
        }

        // In a method
        System.out.println(describe(42));      // Integer: 42, doubled: 84
        System.out.println(describe("Hi"));    // String of length 2
        System.out.println(describe(3.14));    // Other: 3.14
    }

    static String describe(Object o) {
        if (o instanceof Integer i) {
            return "Integer: " + i + ", doubled: " + (i * 2);
        } else if (o instanceof String s) {
            return "String of length " + s.length();
        } else {
            return "Other: " + o;
        }
    }
}
