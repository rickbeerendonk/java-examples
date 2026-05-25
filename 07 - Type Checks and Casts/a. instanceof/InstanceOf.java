// European Union Public License version 1.2
// Copyright © 2026 Rick Beerendonk

package org.typechecks.instanceof_;

public class InstanceOf {
    public static void main(String[] args) {
        Object obj = "Hello";

        System.out.println(obj instanceof String);   // true
        System.out.println(obj instanceof Integer);  // false
        System.out.println(obj instanceof Object);   // true

        Number n = Integer.valueOf(42);
        System.out.println(n instanceof Integer);    // true
        System.out.println(n instanceof Double);     // false

        // null is never an instance of any type
        Object nothing = null;
        System.out.println(nothing instanceof String);  // false
    }
}
